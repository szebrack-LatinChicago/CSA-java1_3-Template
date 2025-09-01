//COMMENTS ARE MENT TO HELP READABILITY
//FIX the look of the file with command + shift + f (mac) [Shift + Alt + F  should work on windows]
//EACH TRY CATCH IS 1 ERROR

public class 					IdentifyErrors {
								public 
								static 
										void 
								main(String[] args) {try{ /* this one is supposed to 
print out hello world on 1 line, */;System.out.println("hello");System.out.println("world");
								}catch(Exception e){
    		System.out.println(
    																e);}try{ /*Try to print out stars in the shape of a TRIANGLE*/
    		System.out.println("***");
        	System.out.println("***");System.out.println("***");}catch(Exception e){System.out.println(e);}	
try
{
    		System.out.
    		println(5
    				/0);//each 0 monkey gets 5 banana
}catch(Exception e){
    		System.
    		out.
    		println(e);
    	}						try{//I recommend removing the code which tells the computer to have an error.
    		throw 
    		new RuntimeException		("Custom Error");
    	}catch(Exception
    			e){System.out.println(e);}
    	

    	
   
    	
    	
    	
    	
    	
    	
    }

}