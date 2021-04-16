package GUI;
/**
* MessageTracker stores messages and the id of their owner
*
* @author  Lufuno Tshishivhiri
* @version 1.0
* @since   14/04/2021 
*/
public class MessageTracker {
    String id;
    String message = "";
    
    public MessageTracker(String id){
        this.id = id;
    }

    public MessageTracker(String id, String msg){
        this.id = id;
        this.message = msg +" \n";
    }

    public String getId(){
        return id;
    }

    public void add(String msg){
        message = message + msg + " \n";
    }
}
