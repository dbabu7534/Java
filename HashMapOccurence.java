import java.util.*;

public class Main {

    public static void main(String[] args){
        int[] arr = {1,1,2,3,4,2};

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0) + 1 );
        }

        for(Map.Entry<Integer,Integer> h : hm.entrySet()){
            System.out.println(h.getKey()+"\t"+h.getValue());
        }

        System.out.println("-----------------------------");

        hm.forEach((k,v) -> System.out.println(k +"\t"+ v) );
        System.out.println(hm);
    }

}
