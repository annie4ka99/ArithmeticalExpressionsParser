grammar Expression;

@header {
package parser;
import java.util.Map;
import java.util.HashMap;
import exception.ArithmeticExpressionException;
}

@members {
Map<String, Integer> variableValues = new HashMap<>();
int line = 1;
}

file:(expression SEM)*;

expression
@after {line++;}
: VAR EQUAL as=appsub {variableValues.put($VAR.text, $as.value); System.out.println($VAR.text + " = " + $as.value); }
                    | as1=appsub {System.out.println($as1.value);};

appsub returns [Integer value]: as1=appsub APPLY md1=muldiv {$value = ($as1.value)+($md1.value);}
                              | as2=appsub SUBTRACT md2=muldiv {$value = ($as2.value)-($md2.value);}
                              | md=muldiv {$value = $md.value;};

muldiv returns [Integer value] : md1=muldiv MULTIPLY neg1=negation{$value = ($md1.value)*($neg1.value);}
       | md2=muldiv DIVIDE neg2=negation
            { if ($neg2.value == 0) throw new ArithmeticExpressionException("division by zero", line);
                $value = ($md2.value)/($neg2.value);}
       | neg=negation {$value = $neg.value;}
       | neg3=negation MOD md3=muldiv{$value = ($neg3.value)%($md3.value);};

negation returns [Integer value] : var=variable {$value = $var.value;}
                                 | OB as=appsub CB {$value = $as.value;}
                                 | SUBTRACT neg=negation {$value= -($neg.value);}
                                 | n=number {$value = $n.value;};

variable returns [Integer value] :
VAR {
    $value = variableValues.get($VAR.text);
    if ($value == null)
        throw new ArithmeticExpressionException("can't find value of variable '" + $VAR.text + "'", line);
};

number returns [Integer value] :
NUM {
    try {
        $value = Integer.parseInt($NUM.text);
    } catch (NumberFormatException ex) {
        throw new ArithmeticExpressionException("can't get integer from " + $NUM.text, line);
    }
};

EQUAL : '=';
APPLY : '+';
MULTIPLY : '*';
DIVIDE : '/';
SUBTRACT : '-';
MOD : '%';
OB : '(';
CB : ')';
VAR : [a-z]([a-zA-Z0-9'])*;
SEM: ';';
WS : [ \r\t\n]+ -> skip ;
NUM : ('0' | (('1'..'9')('0'..'9')*));