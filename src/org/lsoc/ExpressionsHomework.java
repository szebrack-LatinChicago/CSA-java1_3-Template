public class ExpressionsHomework {

	
	public static void main(String[] args) {
		//Do not touch this line.
		Out systemGrader = new Out();//Object-Oriented-Programming, we will learn this 2nd quarter, its not spooky.	
		//READ BELOW, replace all null with the answer.
		
		
		
		//These green things are comments, they make the computer do anything but you can read them.
		//Many questions will seem trivial, but high mastery of knowledge can mean consistently being correct on easy problems.
		
		
		//There is a fancy predictor code:
		//Predictions work by (Question Letter , YOUR ANSWER, the math or variable you are predicting.
		// ie. replace the word null with your guess
		
		//feel free to use System.out.println(variable) to help get or understand the answers
		
		//YOU HAVE TO ATTEMPT ALL THE PROBLEMS
		//but you can get as many wrong as you like. 
		
		//Section 1:basic math
	
		int a = 5;
		int b = a - 5;
		
		systemGrader.out.predict("A", null, a); // A) predict the value of a
		systemGrader.out.predict("B", null, b); // B) predict the value of b
		

		//Section 2:math with decimals
		int x = 90;                    
        double c = x;                  
        systemGrader.out.predict("C", null, c);  // C) predict the value of c
        float d = x;                   
        systemGrader.out.predict("D", null, d);  // D) Predict the value of int 90 being fit into a float memory
  

       //E-H moved to another homework,
		
		
		//section 4:
        systemGrader.out.predict("I", null ,5/2);  //I)
        systemGrader.out.predict("J", null ,5.0/2);//J
		double k = 5;
		systemGrader.out.predict("K", null ,k/2);  //K -- k is a double
		systemGrader.out.predict("L", null ,5%2);  //L
		
		double m = 0;
		m = m + 1/3;
		m = m + 1/3;
		m = m + 1/3;
		systemGrader.out.predict("M", null ,m);  //M
		
		double n =.1+.1+.1;
		systemGrader.out.predict("N", null ,n);  //N
		float o = (float) (.1+.1+.1);
		systemGrader.out.predict("o", null ,o);  //N
		
		//predict variables after going through some math +-/*
		//predict string sizes.
		
		
		
		//DO NOT TOUCH THIS LAST LINE
		systemGrader.out.grade();		
	}

}