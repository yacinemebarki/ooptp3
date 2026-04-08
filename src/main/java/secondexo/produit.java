package secondexo;

public class produit {
    private int id;
    private String name;
    private boolean valable;
    public produit(){};
    public produit(int id,String name,boolean valable){
        this.id=id;
        this.name=name;
        this.valable=valable;
    }

    public int getid(){
        return id;
    }
    public String getnom(){
        return name;
    }
    
    public boolean getactive(){
        return valable;
    }
    public void setid(int id){
        this.id=id;
    }
    public void setnom(String nom){
        this.name=name;
    }
    
    public void activter(){
        this.valable=true;
    }
    public void desactiver(){
        this.valable=false;
    }
    public String presentation(){
        return id + " "+name+" valable= "+valable;
    }


}
