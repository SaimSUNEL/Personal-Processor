import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;


public class TreeGezici  extends HelloBaseVisitor<Object>{

	
	String KOMUT ;
	ArrayList code_array = new ArrayList();
	
	
	boolean is_interrupt = false ;
	
	
	//interruptlar 4. indeksten baþlayacak...
	int interrupt_index = 4 ;
	
	
	
	/*
	 * Labellarý ekle kendisi otomatik sayarak bulacak...
	 * 
	 * //Comment ekleme ?
			 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	public Object visitLabel_process(HelloParser.Label_processContext ctx) { 
		
		if ( this.is_interrupt == true ) 
		{
			
			this.code_array.set ( this.interrupt_index , ctx.getText() ) ;
			this.interrupt_index ++ ;
		}
		else 
		{
		
			this.code_array.add( ctx.getText() ) ;
		
		}
		
		
		
		return null ;
	
	}
	
	
	
	
	
	 public Object visitImm(HelloParser.ImmContext ctx) { 
		 
		 //addi $0 , imm 
		 KOMUT = "00011" ;
			KOMUT += beþ_bit_int_to_binary( 0 ) + yirmiiki_bit_int_to_binary( Integer.parseInt( ctx.immediate().getText() ));
			
			hexe_dönüþtür( KOMUT );
		    return null ;
		 
	 
	 }
	
	
	
	
	
	
	
	private Formatter program_file ;
	 public Object visitKl(HelloParser.KlContext ctx) { 
		 
		// mov $result , $reg
		 
		 KOMUT = "11000" ;
			
			KOMUT+= beþ_bit_int_to_binary(9 ) + beþ_bit_int_to_binary((int) visit( ctx.reg_def() ) ) +"00000000000000000" ;
			
			hexe_dönüþtür( KOMUT );
		  
		 
	 return null ;
	 
	 }
	public Object visitMath_komutu(HelloParser.Math_komutuContext ctx) {
		String komut = ctx.math_komut_ismi().getText();
		switch( komut )
		{
		case "incf":
			
			KOMUT = "00011" ;
			KOMUT += beþ_bit_int_to_binary( (int) visit( ctx.reg_def() ) ) + yirmiiki_bit_int_to_binary( 1 );
			
			hexe_dönüþtür( KOMUT );
			
			 KOMUT = "11000" ;
				
				KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def(  ) ) ) + beþ_bit_int_to_binary( 9 ) +"00000000000000000" ;
				
				hexe_dönüþtür( KOMUT );
			
			
			
			break;
			
		case "decf":
			KOMUT = "00011" ;
			KOMUT += beþ_bit_int_to_binary( (int) visit( ctx.reg_def() ) ) + yirmiiki_bit_int_to_binary( -1 );
			
			hexe_dönüþtür( KOMUT );
			
			 KOMUT = "11000" ;
				
				KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def(  ) ) ) + beþ_bit_int_to_binary( 9 ) +"00000000000000000" ;
				
				hexe_dönüþtür( KOMUT );
			
			
			
			
			break;
		
		
		
		
		}
	return null ;	
	
	}
	
	
	public Object visitStack_komutu(HelloParser.Stack_komutuContext ctx) {
		
		
		if( ctx.stack_komut_ismi().getText().equals( "push" )) 
		{
			KOMUT = "10000" ; //sw $reg , $sp komutu
		
		KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def() ) ) + beþ_bit_int_to_binary( 8 ) +"00000000000000000" ;
		
		hexe_dönüþtür( KOMUT );
		
		
		KOMUT = "00011" ; //addi $8 , 1
		KOMUT += beþ_bit_int_to_binary(8) + yirmiiki_bit_int_to_binary( 1 );
		
		hexe_dönüþtür( KOMUT );
		
		
		
		  KOMUT = "11000" ;  //mov $sp , $result
			
			KOMUT+= beþ_bit_int_to_binary(8 ) + beþ_bit_int_to_binary( 9 ) +"00000000000000000" ;
			
			hexe_dönüþtür( KOMUT );
			
		
		
		
		}
		else
		{
			
			
			KOMUT = "00011" ; //addi $8 , -1
			KOMUT += beþ_bit_int_to_binary(8) + yirmiiki_bit_int_to_binary( -1 );
			
			hexe_dönüþtür( KOMUT );
			
			
			
			  KOMUT = "11000" ;  //mov $sp , $result
				
				KOMUT+= beþ_bit_int_to_binary(8 ) + beþ_bit_int_to_binary( 9 ) +"00000000000000000" ;
				
				hexe_dönüþtür( KOMUT );
				
			
			
			
			 KOMUT = "01000" ;
				
				KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def(  ) ) ) + beþ_bit_int_to_binary( (int)  8  ) +"00000000000000000" ;
				
				hexe_dönüþtür( KOMUT );
			
			
				
			
				
				
				
			
		}
		
		
		return null ;
		
	
	}
	
	
	
	public Object visitJ_type_komut(HelloParser.J_type_komutContext ctx) { 
		
		String komut = ctx.j_type_komut_ismi().getText();
		switch( komut ) 
		{
		case "jmp":
			
			
			if( ctx.jump_to().getText().toCharArray()[0] !='$' )
			{
		KOMUT = "01100" ;
		KOMUT += yirmi_yedi_bit( Integer.parseInt( ctx.jump_to().getText()))   ;
			
			hexe_dönüþtür( KOMUT );
			}
			else
			{
				KOMUT = "00100" ;
				KOMUT += beþ_bit_int_to_binary( (int) visit( ctx.jump_to() ) ) + "0000000000000000000000"    ;
					hexe_dönüþtür( KOMUT );
				
				
			}
			
			
			break;
		
		}
		
		
	return null;
	}
	public Object visitNop_operation(HelloParser.Nop_operationContext ctx) { 
		
		
		//Önemli: $result registeri deðiþecek...
		
		//addi $0 , 0
		KOMUT = "00011" ;
		KOMUT += beþ_bit_int_to_binary( 0 ) + yirmiiki_bit_int_to_binary( 0 );
		
		hexe_dönüþtür( KOMUT );
	
	return null ;
	
	
	}
	
	
	
	public Object visitReturn_from_function(HelloParser.Return_from_functionContext ctx) { 
		
		
		
		
		KOMUT = "00011" ; //addi $8 , -1
		KOMUT += beþ_bit_int_to_binary(8) + yirmiiki_bit_int_to_binary( -1 );
		
		hexe_dönüþtür( KOMUT );
		
		
		
		  KOMUT = "11000" ;  //mov $sp , $result
			
			KOMUT+= beþ_bit_int_to_binary(8 ) + beþ_bit_int_to_binary( 9 ) +"00000000000000000" ;
			
			hexe_dönüþtür( KOMUT );
			
		
		
		
		 KOMUT = "01000" ;
			
		 KOMUT+= beþ_bit_int_to_binary(9) + beþ_bit_int_to_binary( (int)  8  ) +"00000000000000000" ;
			
		 hexe_dönüþtür( KOMUT );
		
		
		
		
		
		KOMUT = "00100" ;
		KOMUT += beþ_bit_int_to_binary( 9 ) + "0000000000000000000000"    ;
			hexe_dönüþtür( KOMUT );
		
		
		
		
	
	return null ;
	
	}
	
	
	public Object visitFoksiyon_cagirma(HelloParser.Foksiyon_cagirmaContext ctx) { 
		
		
	//save pc  toreg
	KOMUT = "01001" ;
	KOMUT += beþ_bit_int_to_binary( 0 ) + yirmiiki_bit_int_to_binary( 2 );
	
	hexe_dönüþtür( KOMUT );
	//PC+8 resultta
	
	//mov $reg , $9
	 KOMUT = "11000" ;
		
		KOMUT+= beþ_bit_int_to_binary( 7 ) + beþ_bit_int_to_binary( 9 ) +"00000000000000000" ;
		
		hexe_dönüþtür( KOMUT );
	 //Geri dönüþ adresi $7 de
	
	
	
	//jump to function
	
	
	KOMUT = "01100" ;
	KOMUT += yirmi_yedi_bit(   Integer.parseInt(  ctx.immediate().getText ()  ) )   ;
	hexe_dönüþtür( KOMUT );
	
	return null ;
	}
	
	
	public Object visitSave_pc_to_result(HelloParser.Save_pc_to_resultContext ctx) {
		
   String komut = ctx.special_komut_ismi().getText();
   
   
   switch( komut )
   {
   
   case "save_pc" :
	   
		KOMUT = "01001" ;
		KOMUT += beþ_bit_int_to_binary( 0 ) + yirmiiki_bit_int_to_binary( 2 );
		
		hexe_dönüþtür( KOMUT );
		//PC+8 resultta
		 
		 KOMUT = "11000" ;
			
			KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def(  ) ) ) + beþ_bit_int_to_binary( 9 ) +"00000000000000000" ;
			
			hexe_dönüþtür( KOMUT );
	   
	   
	   
	   break ;
   
   
   
   
   
   
   }
		
		
	
	
	return null ;
	}
	
	
	
	public Object visitI_type_komut(HelloParser.I_type_komutContext ctx) {
		
		
		String komut = ctx.i_type_komut_ismi().getText();
		
		switch( komut )
		{
		case "lwi":
			KOMUT = "00010" ;
			KOMUT += beþ_bit_int_to_binary( (int) visit( ctx.reg_def() ) ) + yirmiiki_bit_int_to_binary( Integer.parseInt( ctx.immediate().getText() ));
			
			hexe_dönüþtür( KOMUT );
			break;
		case "out":
			KOMUT = "00110" ;
			KOMUT += beþ_bit_int_to_binary( (int) visit( ctx.reg_def() ) ) + yirmiiki_bit_int_to_binary( Integer.parseInt( ctx.immediate().getText() ));
			
			hexe_dönüþtür( KOMUT );
			break;
			
		case "get_bit":
			//movi $6 , imm
			
			
			int shift_amount2 = Integer.parseInt( ctx.immediate().getText() ) ;
			int deger2 = ( 1 << shift_amount2  );
			
		//movi $6 , imm
		
		KOMUT = "00011" ;
		KOMUT += beþ_bit_int_to_binary( 0 ) + yirmiiki_bit_int_to_binary( deger2 );
		
		hexe_dönüþtür( KOMUT );
		
		
		   KOMUT = "11000" ;
		
		KOMUT+= beþ_bit_int_to_binary(6 ) + beþ_bit_int_to_binary( 9 ) +"00000000000000000" ;
		
		hexe_dönüþtür( KOMUT );
		
		
		
		
		
		
		//and $reg , $6
		
		  KOMUT = "00000" ;
		
		KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def(  ) ) ) + beþ_bit_int_to_binary( 6 ) +"00000000000000010" ;
		
		hexe_dönüþtür( KOMUT );
		
		
		
		
	//mov $6 , $result
		
	 KOMUT = "11000" ;
	
	KOMUT+= beþ_bit_int_to_binary( 6 ) + beþ_bit_int_to_binary( 9  ) +"00000000000000000" ;
	
	hexe_dönüþtür( KOMUT );
		
			//movi $5 , shift_amount
	
			KOMUT = "00011" ;
			KOMUT += beþ_bit_int_to_binary( 0 ) + yirmiiki_bit_int_to_binary( shift_amount2 );
			
			hexe_dönüþtür( KOMUT );
			
			
			   KOMUT = "11000" ;
			
			KOMUT+= beþ_bit_int_to_binary( 5 ) + beþ_bit_int_to_binary( 9 ) +"00000000000000000" ;
			
			hexe_dönüþtür( KOMUT );
	
	
			//shr $6 ,  $5
			
           KOMUT = "00000" ;
			
			KOMUT+= beþ_bit_int_to_binary( 6  ) + beþ_bit_int_to_binary( 5 ) +"00000000000000100" ;
			
			hexe_dönüþtür( KOMUT );
		
			
		
			
			
			
			break;
			
			
		case "bsf":
			
			//movi $6 , imm
			KOMUT = "00011" ;
			int shift_miktarý = Integer.parseInt( ctx.immediate().getText() ) ;
			int number_written_to_reg = 1 << shift_miktarý ;
			
			
			
			
			KOMUT += beþ_bit_int_to_binary( 0 ) + yirmiiki_bit_int_to_binary( number_written_to_reg );
			
			hexe_dönüþtür( KOMUT );
			
			
			   KOMUT = "11000" ;
			
			KOMUT+= beþ_bit_int_to_binary( 6 ) + beþ_bit_int_to_binary( 9 ) +"00000000000000000" ;
			
			hexe_dönüþtür( KOMUT );
			
			
			//or $reg , $6
			 KOMUT = "00000" ;
				
				KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def( ) ) ) + beþ_bit_int_to_binary(6 ) +"00000000000000011" ;
				
				hexe_dönüþtür( KOMUT );
			
			//result in $result reg
			
			
			
			
			
			
			
			break;
		case "bcf":
			

			//movi $6 , imm
			KOMUT = "00011" ;
			
			int shift_miktarý2 = Integer.parseInt( ctx.immediate().getText() ) ;
			int deger = ~( 1 << shift_miktarý2 ) ;
			
			KOMUT += beþ_bit_int_to_binary( 0 ) + yirmiiki_bit_int_to_binary( deger );
			
			hexe_dönüþtür( KOMUT );
			
			
			   KOMUT = "11000" ;
			
			KOMUT+= beþ_bit_int_to_binary( 6 ) + beþ_bit_int_to_binary( 9 ) +"00000000000000000" ;
			
			hexe_dönüþtür( KOMUT );
			
			
			//and $reg , $6
			 
            KOMUT = "00000" ;
			
			KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def(  ) ) ) + beþ_bit_int_to_binary( 6 ) +"00000000000000010" ;
			
			hexe_dönüþtür( KOMUT );
			
			
			
			
			//result in $result reg
			
			
			break;
			
			
			
			
			
		case "in":
			KOMUT = "00101" ;
			KOMUT += beþ_bit_int_to_binary( (int) visit( ctx.reg_def() ) ) + yirmiiki_bit_int_to_binary( Integer.parseInt( ctx.immediate().getText() ));
			
			hexe_dönüþtür( KOMUT );
			break;
		
		case "movi":
			KOMUT = "00011" ;
			KOMUT += beþ_bit_int_to_binary( 0 ) + yirmiiki_bit_int_to_binary( Integer.parseInt( ctx.immediate().getText() ));
			
			hexe_dönüþtür( KOMUT );
			
			
			   KOMUT = "11000" ;
			
			KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def() ) ) + beþ_bit_int_to_binary( 9 ) +"00000000000000000" ;
			
			hexe_dönüþtür( KOMUT );
			
			
			
			
			break ;
		
		case "swi":
			
			KOMUT = "00001" ;
			KOMUT += beþ_bit_int_to_binary( (int) visit( ctx.reg_def() ) ) + yirmiiki_bit_int_to_binary( Integer.parseInt( ctx.immediate().getText() ));
			
			hexe_dönüþtür( KOMUT );
			
			
			break;
			
		case "lui":
			
			KOMUT = "00111" ;
			KOMUT += beþ_bit_int_to_binary( (int) visit( ctx.reg_def() ) ) + yirmiiki_bit_int_to_binary( Integer.parseInt( ctx.immediate().getText() ));
			
			hexe_dönüþtür( KOMUT );
			
			
			break;
		
		
		case "addi":
			KOMUT = "00011" ;
			KOMUT += beþ_bit_int_to_binary( (int) visit( ctx.reg_def() ) ) + yirmiiki_bit_int_to_binary( Integer.parseInt( ctx.immediate().getText() ));
			
			hexe_dönüþtür( KOMUT );
			
			
			break ;
		
		}
		
		
	return null;
	}
	
	
	String output_file_name;
	
	public TreeGezici(String output_file_name)
	{
		this.output_file_name = output_file_name;
		try {
			program_file = new Formatter( new File ( output_file_name ) );
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		program_file.format("%s\n", "v2.0 raw" );
		
		
		
		hexe_dönüþtür( "01100000000000000000000000001010");
		
		for ( int a = 0 ; a < 9 ; a ++ )
		{
			hexe_dönüþtür ( "00000000000000000000000000000000" ) ;
			
		}
	
	}
	
	
	public String yirmi_yedi_bit( int number )
	{
		String binary =	"000000000000000000000000000"+ Integer.toBinaryString( number ) ;
		//System.out.println( "tobinary : " + binary ) ;
		String beþ_bit = binary.substring( binary.length() -27 , binary.length() );	
//		System.out.println("beþ bit : " + beþ_bit );
		
		
	     return beþ_bit ;
		
		
	}
	public String beþ_bit_int_to_binary( int number )
	{
	String binary =	"00000"+ Integer.toBinaryString( number ) ;
	//System.out.println( "tobinary : " + binary ) ;
	String beþ_bit = binary.substring( binary.length() -5 , binary.length() );	
//	System.out.println("beþ bit : " + beþ_bit );
	
	
     return beþ_bit ;
	}
	
	public String hex_sayi ( String dörtlü)
	{
		int toplam = 0 ;
	
		char [] arr = dörtlü.toCharArray() ;
		for( int a = 3 ; a >= 0 ; a-- )
	{
		toplam +=  (int) (( arr[a] - 48 )*Math.pow( 2 , 3-a ));
		
		
		
	}
		//System.out.println( "Toplam = " + toplam + " " ) ;
		if( toplam >= 10 )
			return String.valueOf( (char)('F' - ( 15-toplam)) ) ;
			
			
		else
		return String.valueOf( toplam );
		
	}
	
	
	
	 public Object visitLabelli_call(HelloParser.Labelli_callContext ctx) { 
		
		 KOMUT = "01001" ; //it was 2
			KOMUT += beþ_bit_int_to_binary( 0 ) + yirmiiki_bit_int_to_binary( 4 );
			
			hexe_dönüþtür( KOMUT );
			//PC+2 resultta
			
			//mov $reg , $9
			 //KOMUT = "11000" ;
				
				///KOMUT+= beþ_bit_int_to_binary( 7 ) + beþ_bit_int_to_binary( 9 ) +"00000000000000000" ;
				
				//hexe_dönüþtür( KOMUT );
			 //Geri dönüþ adresi $7 de
				
				
				//push command  store $result to $sp
				KOMUT = "10000" ; //sw $result , $sp komutu
				
				KOMUT+= beþ_bit_int_to_binary(9) + beþ_bit_int_to_binary( 8 ) +"00000000000000000" ;
				
				hexe_dönüþtür( KOMUT );
				
				
				KOMUT = "00011" ; //addi $8 , 1
				KOMUT += beþ_bit_int_to_binary(8) + yirmiiki_bit_int_to_binary( 1 );
				
				hexe_dönüþtür( KOMUT );
				
				
				
				  KOMUT = "11000" ;  //mov $sp , $result
					
					KOMUT+= beþ_bit_int_to_binary(8 ) + beþ_bit_int_to_binary( 9 ) +"00000000000000000" ;
					
					hexe_dönüþtür( KOMUT );
					

				
				
			
			
			
			//jump to function
			
			
		System.out.println( "call yapýlan : " + "jmp" + ctx.label().getText()  ) ; 
			
	if ( this.is_interrupt == true ) 
	{
		code_array.set (this.interrupt_index ,  "jmp" + ctx.label().getText()    );	
	this.interrupt_index ++ ;
	}else 
	{
		
		code_array.add( "jmp" + ctx.label().getText()    );	
	}
		/*KOMUT = "01100" ;
			KOMUT += yirmi_yedi_bit(   Integer.parseInt(  ctx.immediate().getText ()  ) )   ;
			hexe_dönüþtür( KOMUT );
			*/
		 
		 
		 
		 
		 
		 
		 return null ;
		 
	 
	 
	 }
	
	
	
	 public Object visitInterrupt_fonk(HelloParser.Interrupt_fonkContext ctx) { 
		
		 this.is_interrupt = true ;
		 
		
for ( int a = 0 ; a < ctx.komutlar().size() ; a ++ )
{
	
	visit ( ctx.komutlar( a  ) ) ;
	
	
	
}
		 
		 
		 
	 
	 this.is_interrupt = false ;
	 return null ;
	 }
	
	
	
	
	
	public String yirmiiki_bit_int_to_binary(int number )
	{
	String binary =	"0000000000000000000000" + Integer.toBinaryString( number ) ;
	String beþ_bit = binary.substring( binary.length() - 22 , binary.length() );	
	
	
	
     return beþ_bit ;
	}
	private int sayi = 0 ;
	public void hexe_dönüþtür( String komut )
	{
		String hex_formu = "" ;
		String dörtlü ="";
		for( int a = 0 ; a < 8 ; a++ )
		{
			dörtlü = komut.substring( a *4 ,a*4+4 );
			//System.out.print( dörtlü );
		hex_formu += hex_sayi( dörtlü ) ;
		//System.out.println( " hex : " + hex_sayi( dörtlü ));
		}
		
		System.out.println( ""+ hex_formu ) ;
	program_file.format("%s", hex_formu );
	
	
	if ( this.is_interrupt == true )
	{

		code_array.set( this.interrupt_index , hex_formu ) ;
		//code_array.add( hex_formu ) ;
		this.interrupt_index ++ ;
	return  ;
	}
	else 
		code_array.add( hex_formu ) ;
	
	sayi ++ ;
	if( sayi == 8 ) {
		
		program_file.format("%s", "\n" );
		sayi = 0 ;
		
	}
	else
	{
		
		program_file.format("%s" , " " ) ;
	}
	
	
	}
	
	
	
	public String hexe_dönüþtür2( String komut )
	{
		String hex_formu = "" ;
		String dörtlü ="";
		for( int a = 0 ; a < 8 ; a++ )
		{
			dörtlü = komut.substring( a *4 ,a*4+4 );
			//System.out.print( dörtlü );
		hex_formu += hex_sayi( dörtlü ) ;
		//System.out.println( " hex : " + hex_sayi( dörtlü ));
		}
		
		System.out.println( ""+ hex_formu ) ;
	
	
	sayi ++ ;
	if( sayi == 8 ) {
		
		
		sayi = 0 ;
		
	}
	else
	{
		
		
	}
	
	
	return hex_formu ;
	
	}
	
	
	
	
	
	
	
	
	
	
	public Object visitLabelli_komut(HelloParser.Labelli_komutContext ctx) { 
		
		
		if ( this.is_interrupt == true ) 
		{
			code_array.set( this.interrupt_index , ctx.getText() ) ;
			this.interrupt_index ++ ;
		}else
		{
			code_array.add( ctx.getText() ) ;
		}
		
		
		
		
		return null ;
		
	
	
	
	}
	
	
	public Object visitProgram(HelloParser.ProgramContext ctx) {
		
		 visitChildren(ctx);
		 
		 
		 program_file.format( "%s",  "\n" );
		 program_file.close();
		System.out.println( "Dosya yazýldý..." ) ;
		Date date = new Date();
		System.out.println( date.getHours()+":"+date.getMinutes()+":"+date.getSeconds() ) ;
	
		System.out.println( "************Code Arrayý*********** " ) ;
		for( int a = 0 ; a < code_array.size() ; a ++  )
		{
System.out.println( code_array.get( a )  );			
				}
		
		int index = 0 ;
		String code = null ;
		String label = null ;
		System.out.println( "***************Bulunan Labellar************" ) ;
		int ind = 0 ;
		int önceki_label_sayýsý = 0 ;
		
		String cd = null ;
		while( index < code_array.size() )
		{
			
			code = (String)code_array.get( index ) ;
		
			if( code.contains( "jmp"  )   )
			{
			
				label = code.substring( 3 , code.length()  ) ;
				
				
				
				System.out.println( "Bulunan label : " + label  );
				önceki_label_sayýsý  = 0 ; 
				for ( ind = 0 ; ind < code_array.size() ; ind++ )
				{
					cd =  ( String )code_array.get( ind );
					
					
					if( Character.isAlphabetic( cd.toCharArray()[0] ) ) 
						if( Character.isLowerCase( (cd.toCharArray()[0]) ) && cd.toCharArray()[0] != 'j' )
						{
							önceki_label_sayýsý ++ ;
							
						}
					if( (label+":" ).equals( cd ) )
					{
						
						System.out.println( "Jump için bulunan label önceki label sayýsý : " + önceki_label_sayýsý ) ;
						
						
						
						
						KOMUT = "01100" ;
						//+1 Interrup routine addition causes problem...
						if(this.is_interrupt)
						KOMUT += yirmi_yedi_bit(  ind - önceki_label_sayýsý+2)   ;
						else
							KOMUT += yirmi_yedi_bit(  ind - önceki_label_sayýsý  +1 )   ;

						String hex_formu = "" ;
						String dörtlü ="";
						for( int a = 0 ; a < 8 ; a++ )
						{
							dörtlü = KOMUT.substring( a *4 ,a*4+4 );
							//System.out.print( dörtlü );
						hex_formu += hex_sayi( dörtlü ) ;
						//System.out.println( " hex : " + hex_sayi( dörtlü ));
						}
						
						code_array.set( index , hex_formu ) ;
						
						
						
						
					}
					
				
				
				}
							}
		index ++ ;	
		}
		
		
		
		System.out.println( "************Code Arrayý*********** " ) ;
		for( int a = 0 ; a < code_array.size() ; a ++  )
		{
System.out.println( code_array.get( a )  );			
				}
		
		
		String df = null ;
		for( int a = 0 ; a < code_array.size(); a++ )
		{
			df = (String) code_array.get( a ) ;
		if( Character.isAlphabetic( df.toCharArray()[0] ) ) 
			if( Character.isLowerCase( (df.toCharArray()[0]) ) )
		{
			code_array.set( a , "--" ) ;
			
		}
			
			
		}
		
		System.out.println( "************Final Code*********** " ) ;
		for( int a = 0 ; a < code_array.size() ; a ++  )
		{

			System.out.println( code_array.get( a )  );			
		
		}
		
		System.out.println( "*************Son dosyaya yazýlýyor....****************" );
		
		
		try {
			program_file = new Formatter( new File (this.output_file_name) );
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		program_file.format("%s\n", "v2.0 raw" );	
		
		String hex_formu = null ;
		String kod = null ;
		int sayi = 0 ;
		for( int g  = 0 ; g < code_array.size() ; g++ )
		{
			
			
			kod = (String) code_array.get( g ) ;
			if( kod == null ) continue ;
			System.out.println( "code : " + kod ) ;
			if( ! ( kod.equals( "--" )) )
			{
			program_file.format("%s", kod );
			//code_array.add( hex_formu ) ;
			sayi ++ ;
			if( sayi == 8 ) {
				
				program_file.format("%s", "\n" );
				sayi = 0 ;
				
			}
			else
			{
				
				program_file.format("%s" , " " ) ;
			}
			
			}
			
			
			
			
			
			
			
			
		}
		
		 program_file.format( "%s",  "\n" );
		 program_file.close();
		
		System.out.println( "*******Program tamamlandý***********" ) ;
		return null ;
	
	
	}
	
	
	
	
	
	public Object visitR_type_komut(HelloParser.R_type_komutContext ctx) { 
		
		String komut = ctx.r_type_komut_ismi().getText();
		
		switch( komut )
		{
		case "sw":
			KOMUT = "10000" ;
			
			KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def( 0 ) ) ) + beþ_bit_int_to_binary( (int) visit( ctx.reg_def( 1 ) ) ) +"00000000000000000" ;
			
			hexe_dönüþtür( KOMUT );
			
			break;
		case "lw":
            KOMUT = "01000" ;
			
			KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def( 0 ) ) ) + beþ_bit_int_to_binary( (int) visit( ctx.reg_def( 1 ) ) ) +"00000000000000000" ;
			
			hexe_dönüþtür( KOMUT );
			
			break ;
		
		
		case "mov_fast":
            KOMUT = "11000" ;
			
			KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def( 0 ) ) ) + beþ_bit_int_to_binary( (int) visit( ctx.reg_def( 1 ) ) ) +"00000000000000000" ;
			
			hexe_dönüþtür( KOMUT );
			
			break ;
		
		case "beq":
            KOMUT = "10100" ;
			
			KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def( 0 ) ) ) + beþ_bit_int_to_binary( (int) visit( ctx.reg_def( 1 ) ) ) +"00000000000000000" ;
			
			hexe_dönüþtür( KOMUT );
			
			break ;
			
		case "bnq":
            KOMUT = "11100" ;
			
			KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def( 0 ) ) ) + beþ_bit_int_to_binary( (int) visit( ctx.reg_def( 1 ) ) ) +"00000000000000000" ;
			
			hexe_dönüþtür( KOMUT );
			
			break ;
		
		case "slt":
            KOMUT = "00000" ;
			
			KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def( 0 ) ) ) + beþ_bit_int_to_binary( (int) visit( ctx.reg_def( 1 ) ) ) +"00000000000001000" ;
			
			hexe_dönüþtür( KOMUT );
			
			break ;
			
		case "add":
            KOMUT = "00000" ;
			
			KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def( 0 ) ) ) + beþ_bit_int_to_binary( (int) visit( ctx.reg_def( 1 ) ) ) +"00000000000000000" ;
			
			hexe_dönüþtür( KOMUT );
			
			break ;
			
		case "shr":
            KOMUT = "00000" ;
			
			KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def( 0 ) ) ) + beþ_bit_int_to_binary( (int) visit( ctx.reg_def( 1 ) ) ) +"00000000000000100" ;
			
			hexe_dönüþtür( KOMUT );
			
			break ;
			
			
			
		case "sub":
            KOMUT = "00000" ;
			
			KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def( 0 ) ) ) + beþ_bit_int_to_binary( (int) visit( ctx.reg_def( 1 ) ) ) +"00000000000000001" ;
			
			hexe_dönüþtür( KOMUT );
			
			break ;
		
		case "and":
            KOMUT = "00000" ;
			
			KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def( 0 ) ) ) + beþ_bit_int_to_binary( (int) visit( ctx.reg_def( 1 ) ) ) +"00000000000000010" ;
			
			hexe_dönüþtür( KOMUT );
			
			break ;
			
		case "or":
            KOMUT = "00000" ;
			
			KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def( 0 ) ) ) + beþ_bit_int_to_binary( (int) visit( ctx.reg_def( 1 ) ) ) +"00000000000000011" ;
			
			hexe_dönüþtür( KOMUT );
			
			break ;
			
		case "mul":
            KOMUT = "00000" ;
			
			KOMUT+= beþ_bit_int_to_binary((int) visit( ctx.reg_def( 0 ) ) ) + beþ_bit_int_to_binary( (int) visit( ctx.reg_def( 1 ) ) ) +"00000000000000110" ;
			
			hexe_dönüþtür( KOMUT );
			
			break ;
			
		
		}
		
		
		
		
		
	return null ;
	
	}
	public Object visitMov_high(HelloParser.Mov_highContext ctx) {
		
		visit( ctx.source() ) ;
		 visit( ctx.destination() ) ;
		
		
	
		
		
		
	
return null ;	
	}
	
	
	public Object visitJk(HelloParser.JkContext ctx) { 
		
		if( ctx.getText().contains( "$" ) ) 
		{
			//sw $9 , $reg_num
KOMUT = "10000" ;
			
			KOMUT+= beþ_bit_int_to_binary( 9 ) + beþ_bit_int_to_binary( (int)visit( ctx.reg_or_immediate()) ) +"00000000000000000" ;
			
			hexe_dönüþtür( KOMUT );
			
			
		}
		else
		{//swi $9 , imm
			
			KOMUT = "00001" ;
			KOMUT += beþ_bit_int_to_binary( 9 ) + yirmiiki_bit_int_to_binary( Integer.parseInt( ctx.reg_or_immediate().getText() ));
			
			hexe_dönüþtür( KOMUT );
			
			
			
		}
		
	
	
	
	return null ;
	}
	public Object visitJn(HelloParser.JnContext ctx) { 
		
		int reg = ( int ) visit( ctx.reg_def() ) ;
		//mov $reg , $9
		KOMUT = "11000" ;
		
		KOMUT+= beþ_bit_int_to_binary(reg ) + beþ_bit_int_to_binary( 9 ) +"00000000000000000" ;
		
		hexe_dönüþtür( KOMUT );
		
		
	
	return null ;
	}
	
	
	
	
	public Object visitGetir(HelloParser.GetirContext ctx) {
	
		
		if( ctx.reg_or_immediate().getText().contains( "$" ) ) 
		{
			int reg_num =( int ) visit( ctx.reg_or_immediate() ) ;
		
KOMUT = "01000" ;
			
//lw $result , $reg_num

			KOMUT+= beþ_bit_int_to_binary( 9 ) + beþ_bit_int_to_binary( reg_num ) +"00000000000000000" ;
			
			hexe_dönüþtür( KOMUT );
			
			
			
		}
		else
		{
			//lwi $9 , imm
			
			KOMUT = "00010" ;
			
			
			KOMUT += beþ_bit_int_to_binary( 9 )  + yirmiiki_bit_int_to_binary( Integer.parseInt( ctx.reg_or_immediate().getText() ));
			
			hexe_dönüþtür( KOMUT );
		
		
		}
		
		
		
		return null ;
	}
	
	
	
	public Object visitReg_def(HelloParser.Reg_defContext ctx) { 
		
		
		
		if( ctx.getText().contains( "result" ) ) return 9 ;
		else if ( ctx.getText().contains( "sp" ) ) return 8 ;
		else
		return Integer.parseInt( ctx.immediate().getText () ) ;
		
	
	
	}
	
	
}
