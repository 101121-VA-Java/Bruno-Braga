public class Calculator{

	public static void main(String[] args){
		weekday("monday");
		String s = "tuesday";
		weekday(args[0]);	
		weekday(args[1]);
	}
	
	public int add(int a , int b){
		return a + b;
	}
	
	public int sum(int a, int b){
		return a - b;
	}
	
	public static double multiply(double a, double b){
		return a * b;
	}
	public static int remainder(int a, int b){
		return a % b;
	}

	public static void weekday(String weekday){
		switch(weekday){
			case "monday":
				System.out.println("Today is monday");
				break;
			case "tuesday":
				System.out.println("Today is Tuesday");
				break;
			default: 
		}
		

	}
}
