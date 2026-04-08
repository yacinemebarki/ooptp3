package firstexo;
public class videoCours implements Identifiable {
    int id;
    String titre;
    String ens;
    int duree;
    
    public videoCours(int id,int duree,String titre,String ens){
        this.id=id;
        this.duree=duree;
        this.titre=titre;
        this.ens=ens;
    }

    @Override
    
    public int getid(){
        return id;
    }
    public int getduree(){
        return duree;
    }
    public String getens(){
        return ens;
    }
    public String gettitre(){
        return titre;
    }
    public void setid(int id){
        this.id=id;
    }
    public void setduree(int duree){
        this.duree=duree;
    }
    public void settitre(String titre){
        this.titre=titre;
    }
    public void setens(String ens){
        this.ens=ens;
    }
    @Override
    public String toString() {
        return "video course: " + titre + " Author: " + ens + " ID: " + id + " time: " + duree;
    }
    
}
