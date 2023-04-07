package RecursiveImplementation;

public class Print1To100 {
	
	public static void printNumber(int num) {
		if(num>100) {
			return;
		}
		else {
		System.out.println(num);
		 printNumber(num+1);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumber(1);

	}

}
