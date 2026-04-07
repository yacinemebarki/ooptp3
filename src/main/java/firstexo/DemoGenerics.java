
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class DemoGenerics {
    public static void main(String[] args) {

        depot<liver> Depot_liver=new depot<>();
        depot<videoCours> Depot_video=new depot<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many books you want to add");
        int n=sc.nextInt();
        sc.nextLine();
        liver b;
        boolean exist;
        String title;
        String aut;
        int id;
        int nb_page;
        for (int i=0;i<n;i++){
            System.out.println("enter new book");
            System.out.println("enter book title");
            title=sc.nextLine();
            
            System.out.println("enter author name");
            aut=sc.nextLine();
            
            System.out.println("enter id");
            id=sc.nextInt();
            sc.nextLine();
            System.out.println("enter page number");
            nb_page=sc.nextInt();
            sc.nextLine();
            b=new liver(title,id,aut,nb_page);
            exist=Depot_liver.add(b);
            if (exist==true){
                i=i-1;
            }

        }
        System.out.println("enter how many video course  you want to add");
        n=sc.nextInt();
        sc.nextLine();
        videoCours vc;
        
        String ens;
        
        int duree;
        for (int i=0;i<n;i++){
            System.out.println("enter new video course");
            System.out.println("enter course title");
            title=sc.nextLine();
            
            System.out.println("enter teacher name");
            ens=sc.nextLine();
            
            System.out.println("enter id");
            id=sc.nextInt();
            sc.nextLine();
            System.out.println("enter video time");
            duree=sc.nextInt();
            sc.nextLine();
            vc=new videoCours(id,duree,title,ens);
            exist=Depot_video.add(vc);
            if (exist==true){
                i=i-1;
            }

        }
        // avec les methods de depot 
        System.out.println("dispaly books");
        Depot_liver.display();
        
        System.out.println("display video course");
        Depot_video.display();
        
        System.out.println("enter book id to search for");
        int id_search =sc.nextInt();
        sc.nextLine();
        liver l=Depot_liver.search(id_search);
        if (l!=null){
            System.out.println("title "+l.titre+" author_name "+l.auteur+" page number "+l.nb_page);
        }
        
        System.out.println("enter video id to saerch for");
        id_search=sc.nextInt(id_search);
        sc.nextLine();
        videoCours video=Depot_video.search(id_search);
        System.out.println("title "+video.titre+" teacher "+video.ens+" video time "+video.duree);
        
        System.out.println("enter a book you want to delete");
        id_search=sc.nextInt();
        sc.nextLine();
        Depot_liver.delete(id_search);

        System.out.println("enter video id you want to delete");
        id_search=sc.nextInt();
        sc.nextLine();
        Depot_video.delete(id_search);

        //avec les method utilitaire

        utilitaire.display(Depot_liver.arr);
        liver book1=new liver("java", 2, "ana", 30);
        liver book2=new liver("python",2,"hwa",32);
        String titre=utilitaire.compare(book1.titre, book2.titre);
        System.out.println("titre "+titre);
        
        System.out.println("enter case you want to permute");
        int pi1=sc.nextInt();
        sc.nextLine();
        int pi2=sc.nextInt();
        sc.nextLine();
        utilitaire.permute(Depot_liver.arr, pi1, pi2);
        
        Collection<Integer> ids=new ArrayList<>();
        utilitaire.copier(Depot_liver.arr, ids);
        System.out.println("all IDs: " + ids);



    
    
    }
}
