package thirdexo3;

public class NettoyageTemp implements operation{
    private String dirname;
    public NettoyageTemp(){

    }
    public NettoyageTemp(String dirname){
        this.dirname=dirname;
    }
    public String getdir(){
        return dirname;
    }
    public void setdir(String dir){
        this.dirname=dir;
    }
    @Override
    public void excute(){
        System.out.println("entairn de nettoyer les fichier ");

    }
    @Override
    public String description(){
        return "10 fichier sont etait suprimer";
    }    
}
