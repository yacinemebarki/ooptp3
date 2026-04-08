package secondexo;

import java.lang.reflect.*;

public class MiniInspecteur {
    public static void inspecter(String classname){
        try{
            Class<?> c=Class.forName(classname);
            System.out.println("Méthode 3 : " + c.getName());
            System.out.println("nom complet: "+c.getName());

            System.out.println("nom simple: "+c.getSimpleName());
            System.out.println("nom de package: "+c.getPackageName());
            System.out.println("nom de super class: "+c.getSuperclass());

            Constructor<?>[] con=c.getConstructors();
            System.out.println("affichage des constructors ");
            for(Constructor<?> c1:con){
                System.out.println(c1);
            }
            System.out.println("fin d affichage des constructors");

            Method[] metho = c.getDeclaredMethods();
            System.out.println("affichage des methods");
            for(Method m:metho){
                System.out.println(m);
            }
            System.out.println("fin d affichage des methods");
            Field[] attr=c.getDeclaredFields();
            System.out.println("affichage des attributs");
            for(Field at:attr){
                System.out.println(at);
            }
            System.out.println("fin d affichage des attributs");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        
        Class<?> c1=CompteUtilisateur.class;
        System.out.println("methode1 "+c1.getName());
        CompteUtilisateur user=new CompteUtilisateur();
        c1=user.getClass();
        System.out.println("methode2 "+c1.getName());
        try{
            c1=Class.forName("secondexo.CompteUtilisateur");
            System.out.println("Méthode 3 : " + c1.getName());
            System.out.println("nom complet: "+c1.getName());

            System.out.println("nom simple: "+c1.getSimpleName());
            System.out.println("nom de package: "+c1.getPackageName());
            System.out.println("nom de super class: "+c1.getSuperclass());

            Constructor<?>[] con=c1.getConstructors();
            System.out.println("affichage des constructors ");
            for(Constructor<?> c:con){
                System.out.println(c);
            }
            System.out.println("fin d affichage des constructors");

            Method[] metho = c1.getDeclaredMethods();
            System.out.println("affichage des methods");
            for(Method m:metho){
                System.out.println(m);
            }
            System.out.println("fin d affichage des methods");
            Field[] attr=c1.getDeclaredFields();
            System.out.println("affichage des attributs");
            for(Field at:attr){
                System.out.println(at);
            }
            System.out.println("fin d affichage des attributs");
            Object u1=c1.getDeclaredConstructor().newInstance();
            Constructor<?> cons=c1.getConstructor(int.class,String.class,String.class,boolean.class);
            Object u2=cons.newInstance(1245,"yacine","yacine@gmail.com",true);

            Method presentation=c1.getMethod("presentation");
            Object result=presentation.invoke(u2);
            System.out.println("presentation: "+result);
            Field nom=c1.getDeclaredField("nom");
            nom.setAccessible(true);
            nom.set(u2,"mebarki");
            System.out.println(presentation.invoke(u2));
            System.out.println("FIn insepection de utilisatuer");
            System.out.println("debut de inspection de produit");
            inspecter("secondexo.produit");






        }
        catch(Exception e){
            e.printStackTrace();
        }
        



    }


}
