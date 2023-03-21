package CollectionsSolve;

import java.util.*;


public class ArrayHandler {
    public static void main(String[] args) {
        int[] arr={6,5,6,3,8,7,9,78,98,98,44,};
        List<Integer> list=new ArrayList<>();
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Collections.sort(list);
        System.out.println(list);
//        Collections.reverse(list);
        System.out.println(list);
        int x=Collections.binarySearch(list,6);
        System.out.println("x  :->"+x);
        


    }
}
