package thirdexo3;

import java.rmi.server.ObjID;
import java.rmi.server.Operation;
import java.util.ArrayList;
import java.util.List;

public class DemoFabrique {
    public static void main(String[] args){
        try{
            RegistreOperations operations=new RegistreOperations<>();
            operations.enregistrer("excute",NotificationConsole.class );
            operations.enregistrer("description",NettoyageTemp.class);
            operations.enregistrer("excute",exportcsv.class);
            operation op=operations.creer("excute");
            operation op1=operations.creer("excute",new Class[] {String.class},new Object[]{"data.csv"});
            List<operation> liste = new ArrayList<>();
            liste.add(op1);
            liste.add(op);
            operations.excutetous(liste);
        
            operations.discription("description");
            

        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
