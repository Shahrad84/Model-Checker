import org.antlr.v4.runtime.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Usage: java Main <input.hash> [output.pml]");
            return;
        }
        
        String inputFile = args[0];
        String outputFile = args.length > 1 ? args[1] : "output.pml";
        
        System.out.println("📖 Reading: " + inputFile);
        CharStream input = CharStreams.fromFileName(inputFile);
        
        HashLexer lexer = new HashLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HashParser parser = new HashParser(tokens);
        
        HashParser.ProgramContext tree = parser.program();
        
        PromelaTranslator translator = new PromelaTranslator();
        String promelaCode = translator.visit(tree);
        
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            writer.print(promelaCode);
        }
        
        System.out.println("✅ Done! Output: " + outputFile);
        System.out.println("\n--- Output Code ---");
        System.out.println(promelaCode);
    }
}