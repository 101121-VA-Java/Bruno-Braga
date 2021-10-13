public class HelloWorld {
	public static void main(String[] args){
		System.out.println("Hello everyone!");
		
		//Primitive types
		boolean trueOrFalse = true;
		byte hTS = 127;
		byte mHTE = -128;
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		long minLong = Long.MIN_VALUE;
		
		//Control Statement		
		if (hTS == 126){
			System.out.println("Hundred and Twenty Seven" + hTS);
		} 
		else{
			System.out.println("It is  Hundred and Twenty Seven");
		}
		for(int i = 0; i <= hTS; i++ ){
			System.out.println("interation is:" + i);
		}

		
		System.out.println(maxInt);
					
	}
}
