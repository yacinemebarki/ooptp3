package firstexo;
public class liver implements Identifiable {
    int id;
    String titre;
    String auteur;
    int nb_page;
    public liver(String titre,int id,String auteur,int nb_page){
        this.titre=titre;
        this.id=id;
        this.nb_page=nb_page;
        this.auteur=auteur;
    }
    @Override
    
    
    public int getid(){
        return id;
    }

    public int getnb_page(){
        return nb_page;
    }
    public String getauteur(){
        return auteur;
    }
    public String gettitre(){
        return titre;
    }
    public void setid(int id){
        this.id=id;
    }
    public void setdnb_page(int nb_page){
        this.nb_page=nb_page;
    }
    public void settitre(String titre){
        this.titre=titre;
    }
    public void setauteur(String auteur){
        this.auteur=auteur;
    }
    @Override
    public String toString() {
        return "Book: " + titre + ", Author: " + auteur + ", ID: " + id + ", Pages: " + nb_page;
    }
    
    
}
