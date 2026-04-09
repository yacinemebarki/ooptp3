package thirdexo3;

public class NotificationConsole implements operation {
    private String message;
    public NotificationConsole(){

    }
    public NotificationConsole(String message){
        this.message=message;
    }

    public String getmes(){
        return message;
    }
    
    public void setmes(String mes){
        this.message=mes;
    }

    @Override
    public void excute(){
        System.out.println("NotificationConsole entrain d excuter");

    }
    @Override
    public String description(){
        return "yacine";
    }
}
