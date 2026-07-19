import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args){

        String inputFile = "test.hash";
        String outputFile = "output.pml";
        
        if (args.length > 0) {
            inputFile = args[0];
        }
        if (args.length > 1) {
            outputFile = args[1];
        }
        
        try {
            // - 1: Read input
            System.out.println("Reading file: " + inputFile);
            CharStream input = CharStreams.fromFileName(inputFile);
            
            // - 2: Create lexer and parser
            HashLexer lexer = new HashLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            HashParser parser = new HashParser(tokens);
            
            // - 3: Add error handling
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer,
                                      Object offendingSymbol,
                                      int line,
                                      int charPositionInLine,
                                      String msg,
                                      RecognitionException e) {
                    System.err.println("ERROR at line " + line + ":" + charPositionInLine);
                    System.err.println("  " + msg);
                    System.exit(1);
                }
            });
            
            // - 4: Parse the input
            System.out.println("Parsing...");
            HashParser.ProgramContext tree = parser.program();
            
            // - 5: Translate to Promela
            System.out.println("Translating to Promela...");
            PromelaTranslator translator = new PromelaTranslator();
            String promelaCode = translator.visit(tree);
            
            // - 6: Write output file
            System.out.println("Writing output to: " + outputFile);
            FileWriter writer = new FileWriter(outputFile);
            writer.write(promelaCode);
            writer.close();
            
            // - 7: Show success message
            System.out.println("==========================================");
            System.out.println("SUCCESS! Translation completed.");
            System.out.println("Input file:  " + inputFile);
            System.out.println("Output file: " + outputFile);
            System.out.println("==========================================");
            
            // Print the generated code
            System.out.println("\nGenerated Promela Code:");
            System.out.println("------------------------------------------");
            System.out.println(promelaCode);
            System.out.println("------------------------------------------");
            
        } catch (IOException e) {
            System.err.println("Error reading/writing file:");
            System.err.println("  " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Unexpected error:");
            System.err.println("  " + e.getMessage());
            e.printStackTrace();
        }
    }
}