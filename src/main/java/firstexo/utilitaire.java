package firstexo;
import java.util.*;


public class utilitaire {
    public static void display(List<?> arr){
        for (Object obj:arr){
            System.out.println(obj.toString());
        }
    }
    public static <T extends Comparable<T>> T compare (T a,T b){
        if (a.compareTo(b)>=0){
            return a;
        }
        else {
            return b;
        }
    }
    public static <T> void permute(List<T> arr,int a,int b){
        T per;
        if (a<arr.size() && a>=0 && b<arr.size() && b>=0){
            per=arr.get(a);
            arr.set(a,arr.get(b));
            arr.set(b,per);
            System.out.println("the change was successfully");

        }
        else{
            System.out.println("index not found");
        }

    }
    public static <T extends Identifiable> void copier(List<T> arr,Collection<Integer> des){
        for(T obj:arr){
            des.add(obj.getid());

        }
        

    }
}
