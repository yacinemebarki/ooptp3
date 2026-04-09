package thirdexo3;

public class exportcsv implements operation{
    private String fname;
    
    public exportcsv(){

    }

    public exportcsv(String fname){
        this.fname=fname;
    }
    public String getfile(){
        return fname;
    }

    public void setfile(String name){
        this.fname=name;
    }

    @Override
    public void excute(){
        System.out.println("exportation de csv entain d faire");

    }
    @Override
    public String description(){
        return "la duree estime 100s";
    }    

}
