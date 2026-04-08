package secondexo;


class CompteUtilisateur{
    private int id;
    private String email;
    private String nom;
    private boolean active;
    public CompteUtilisateur(){
        this.id=0;
        this.email="";
        this.nom="";
        this.active=false;

    }
    public CompteUtilisateur(int id,String nom,String email,boolean active){
        this.id=id;
        this.nom=nom;
        this.email=email;
        this.active=active;
        
    }
    public int getid(){
        return id;
    }
    public String getnom(){
        return nom;
    }
    public String getmail(){
        return email;
    }
    public boolean getactive(){
        return active;
    }
    public void setid(int id){
        this.id=id;
    }
    public void setnom(String nom){
        this.nom=nom;
    }
    public void setmail(String mail){
        this.email=email;
    }
    public void activter(){
        this.active=true;
    }
    public void desactiver(){
        this.active=false;
    }
    public String presentation(){
        return id + " "+nom+" "+email+" actif= "+active;
    }



}