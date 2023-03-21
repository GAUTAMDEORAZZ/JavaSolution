import java.util.Arrays;

public class BubbleSort {
    public static void solveProblem(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static void main(String[] args) {
        int[] arr={23,32,12,332,32,11,233};
        solveProblem(arr);
        System.out.println(Arrays.toString(arr));
    }
}
