import java.util.Arrays;

public class AddInArray {
    public static void solve(int[] arr){
        for(int i=0;i<arr.length;i++){
             if(arr[i]%5==0){
                 arr[i]=arr[i]+5;
             }
             else if(arr[i]%2==0){
                 arr[i]=arr[i]+2;
             }
             else{
                 arr[i]=arr[i]+1;
             }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr={12,10,23,4,5,18,22,17,45};
        System.out.println(Arrays.toString(arr));
        solve(arr);

    }
}
