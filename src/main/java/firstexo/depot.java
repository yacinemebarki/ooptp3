import java.util.*;

public class depot <T extends Identifiable> {
    List <T> arr=new ArrayList<>();
    public boolean add(T obj){
        for(T ele:arr){
            if (obj.getid()==ele.getid()){
                System.out.println("element with that id exist "+obj.getid());
                return true;
            }
        }
        arr.add(obj);
        return false;
    }
    public void display(){
        for(T obj:arr){
            System.out.println(obj.toString());

        }
    }
    public T search(int id){
        for(int i=0;i<arr.size();i++){
            if (arr.get(i).getid()==id) {                
                return arr.get(i);
            }

        }
        return null;
    }
    public void delete(int id){
        for (int i=0;i<arr.size();i++){
            if (arr.get(i).getid()==id){
                arr.remove(i);
                System.out.println("the element was deleted");
                return;
            }
        }
        System.out.println("elment with this id "+id);
    }

    
}
