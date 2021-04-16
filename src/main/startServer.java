package main;

import server.Server;

public class startServer
{
   public static void main(String[] args)
   {
      Server server = new Server(9999);
      server.listen(); 
      
   }
}