import java.util.Scanner;

public class CheckPalindrome {

    public static void solution(String str){
        StringBuilder sbuitlder=new StringBuilder(str);
        String s1=new String(sbuitlder.reverse());

         if(s1.equals(str)){
             System.out.println("PALINDROME");
         }
         else{
             System.out.println("NOT PALINDROME");
         }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your String");
        String str=sc.nextLine();
        solution(str);

    }
}
