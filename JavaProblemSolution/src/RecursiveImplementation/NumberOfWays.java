package RecursiveImplementation;

import java.util.Scanner;

public class NumberOfWays {
	public static  int findNumberOfWay(int n) {
		if(n==0) {
			return 1;
		}
		else if(n<0) {
			return 0;
		}
		
		return findNumberOfWay(n-1)+findNumberOfWay(n-2)+findNumberOfWay(n-3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Entyer Number ");
		int x=Integer.parseInt(sc.nextLine());
		int result=findNumberOfWay(x);
		System.out.println(result);

	}

}
