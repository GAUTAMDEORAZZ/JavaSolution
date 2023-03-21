import java.util.HashMap;
import java.util.Map;

public class DublicateFind {
    public static void main(String[] args) {
        int[] arr={ 4,3,2,7,8,2,3,1};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }

        for(Map.Entry m:hm.entrySet()){
            if((int)m.getValue()>1){
                System.out.println(m.getKey());
            }
        }
//        System.out.println(hm);
    }

}
