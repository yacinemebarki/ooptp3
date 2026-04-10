package thirdexo3;

import java.lang.reflect.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistreOperations <T extends operation>{
    Map<String, Class<? extends T>> map;
    
    public RegistreOperations(){
        this.map=new HashMap<>();
    }

    public void enregistrer(String nom,Class<? extends T>classe){
        map.put(nom,classe);
    }

    public void lister(){
        System.out.println("affichage des  operation");
        for (String n:map.keySet()){
            System.out.println(n);
        }
        System.out.println("fin d affichage des operation");
    }

    public T creer(String nom){
        try {
            Class<? extends T>classe=map.get(nom);
            return classe.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    
    }
    public T creer(String nom,Class<?>[] types,Object[] args){
        try{
            Class<? extends T>classe=map.get(nom);
            Constructor<? extends T> cons=classe.getDeclaredConstructor(types);
            return cons.newInstance(args);


        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public void discription(String nom){
        Class<? extends T> classe=map.get(nom);
        String name=classe.getName();
        System.out.println("nom: "+name);
        Field[] attr=classe.getDeclaredFields();
        System.out.println("affichage des attributs");
        for(Field at:attr){
            System.out.println("attribut "+at);
        
        }
        System.out.println("fin affichage des attributs");
        Method[] methods=classe.getDeclaredMethods();
        System.out.println("affichage des methods");
        for(Method m:methods){
            System.out.println("method "+m);
        }
        System.out.println("fin affichage des methods");

        Constructor[] cons=classe.getConstructors();
        System.out.println("affichage des constructor");
        for(Constructor c:cons){
            System.out.println("constructor "+c);
        }
        System.out.println("fin affichage des constrocutor");

    }
    public void excutetous(List<? extends T> operations){
        for (T op:operations){
            op.excute();
        }
    }
    



}
