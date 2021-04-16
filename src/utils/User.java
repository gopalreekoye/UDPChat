/**
* User class for storing user information for the server and client
*
* @author  Lufuno Tshishivhiri
* @version 1.0
* @since   02/04/2021 
*/
package utils;


public class User {
    private Integer port;
    private String id;
    private String ip;
    private String username;
    /**
     * This contructor creats user class
     * @param port the port number the user is on
     * @param ip the user's ip address
     * @param username 
     */
    public User(int port,String ip, String username){
        this.port = port;
        this.ip = ip;
        this.username = username;
        this.id = ip+"%"+ this.port.toString();
    }

    /**
     * 
     * @return string username
     */
    public String getUsername(){
        return username;
    }
    /**
     * 
     * @return string id
     */
    public String getId(){
        return id;
    }

    public Integer getPort(){
        return port;
    }

    public String getAddress(){
        return ip;
    }
}
