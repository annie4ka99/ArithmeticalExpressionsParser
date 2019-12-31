import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import exception.ArithmeticExpressionException;
import exception.RecognitionErrorListener;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import parser.ExpressionLexer;
import parser.ExpressionParser;

public class Main {


    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt", StandardCharsets.UTF_8))){
            CharStream is = CharStreams.fromReader(reader);
            ExpressionLexer lexer = new ExpressionLexer(is);
            lexer.removeErrorListeners();
            lexer.addErrorListener(RecognitionErrorListener.INSTANCE);

            TokenStream ts = new CommonTokenStream(lexer);
            ExpressionParser parser = new ExpressionParser(ts);
            parser.removeErrorListeners();
            parser.addErrorListener(RecognitionErrorListener.INSTANCE);

            parser.file();
        } catch (ParseCancellationException | ArithmeticExpressionException ex){
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println("error when try to open and read input.txt");
        }
    }

}
