

/*  DO NOT EDIT */
public class Homework_Grader {
	private int score = 0;
	private int totalQuestions = 0;
	private int questionsAnswered = 0;
	private String name;
	public Homework_Grader() {} // empty constructor
	public Homework_Grader(String name) {
		this.name = name;
	}
	public void predict(Object first, Object second, Object third) {
		if(second == null)
			predict(first.toString(),"null",third.toString());
		else
			System.out.printf("Error in prediciton functions with %s %s %s\n",first,second,third);
	}
	
	
	public void predict(String l, String i, String j) {
		if(i == null || i.equals("null")) {
			System.out.printf("Skipping Question %s \n",l);
			totalQuestions++;
		}else {
			if(i.equals(j)) {
				System.out.printf("Correct prediction question %s \n",l);
				totalQuestions++;
				questionsAnswered++;
				score++;		
			}else {
				System.out.printf("Error in prediction questions %s: Answer given : %s Answer Expected: %s \n",l,i,j);
				totalQuestions++;
				questionsAnswered++;
			}
		}	
	}
	
	public void grade() {
		System.out.printf("Questions attempted : %s, out of %s\n\n",questionsAnswered,totalQuestions);
	}
	public void score() {
		System.out.printf("Questions correct : %s, out of %s",score,questionsAnswered);
	}
	//integers
	public void predict(String l, int i, int j) {
		predict(l,Integer.toString(i),Integer.toString(j));
	}
	public void predict(String l, String i, int j) {
		predict(l,i,Integer.toString(j));
	}
	public void predict(String l, int i, String j) {
		predict(l,Integer.toString(i),j);
	}
	//doubles
	public void predict(String l, double i, double j) {
		predict(l,Double.toString(i),Double.toString(j));
	}
	public void predict(String l, String i, double j) {
		predict(l,i,Double.toString(j));
	}
	public void predict(String l, double i, String j) {
		predict(l,Double.toString(i),j);
	}
	//floats
	public void predict(String l, float i, float j) {
		predict(l,Float.toString(i),Float.toString(j));
	}
	public void predict(String l, String i, float j) {
		predict(l,i,Float.toString(j));
	}
	public void predict(String l, float i, String j) {
		predict(l,Float.toString(i),j);
	}
	//double/int/float cross products
	public void predict(String l, double i, int j) {
		predict(l,Double.toString(i),Integer.toString(j));
	}
	public void predict(String l, int i, double j) {
		predict(l,Integer.toString(i),Double.toString(j));
	}
	public void predict(String l, double i, float j) {
		predict(l,Double.toString(i),Float.toString(j));
	}
	public void predict(String l, float i, double j) {
		predict(l,Float.toString(i),Double.toString(j));
	}
	public void predict(String l, int i, float j) {
		predict(l,Integer.toString(i),Float.toString(j));
	}
	public void predict(String l, float i, int j) {
		predict(l,Float.toString(i),Integer.toString(j));
	}
	//booleans
	public void predict(String l, boolean i, boolean j) {
		predict(l,Boolean.toString(i),Boolean.toString(j));
	}
	public void predict(String l, String i, boolean j) {
		predict(l,i,Boolean.toString(j));
	}
	public void predict(String l, boolean i, String j) {
		predict(l,Boolean.toString(i),j);
	}
	
	
}