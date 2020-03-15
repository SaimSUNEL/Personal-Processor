import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Ana {

	
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		String file_path = "LedBlinkProgram.txt" ;
		HelloLexer lexer = new HelloLexer( new ANTLRFileStream( file_path , "UTF-16") ) ;
		CommonTokenStream token_stream = new CommonTokenStream( lexer ) ;
		HelloParser parser = new HelloParser( token_stream ) ;
		ParseTree tree = parser.program();
		String hex_code_output_file = "myprocprogram.output";
		TreeGezici walker = new TreeGezici(hex_code_output_file);
		walker.visit( tree ) ;
		//ParseTreeWalker walker = new ParseTreeWalker() ;
		//System.out.println( "Walker " ) ;
		//walker.walk( new TreeWalker () , tree ) ;
		
		
		
		
		
		
		
		
		
	}

}
