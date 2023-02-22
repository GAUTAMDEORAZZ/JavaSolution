package DayDateYear;

import java.util.Scanner;

public class Main {
    public static void solve(int x){
        int Day=0,Month=0,Year=0;
        while(x>=365){
            Year+=x/365;
            x=x%365;

        }
       while(x>=30){
           Month+=x/30;
           x=x%30;

       }
       if(x>0){
           Day=x;

       }
        System.out.println("The years is : "+Year);
        System.out.println("The Months is : "+Month);

        System.out.println("The Days is : "+Day);

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int x=Integer.parseInt(sc.nextLine());
        solve(x);

    }
}
