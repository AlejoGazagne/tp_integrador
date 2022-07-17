package ar.edu.iua.webServices;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

public class Server {
    public static void server(){

        try {
            
            HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

            server.createContext("/buscarPlan", new buscarPlanHandler()); // http://localhost:8080/buscarPlan
            server.createContext("/modificarPlan", new modificarPlanHandler()); // http://localhost:8080/modificarPlan
            server.createContext("/borrarPlan", new borrarPlanHandler()); // http://localhost:8080/borarPlan
            
            server.setExecutor(null);
            server.start();

            System.out.print("Servidor escuchando en ");
            System.out.print(server.getAddress().getHostName().equals("0:0:0:0:0:0:0:0") ? "localhost" : server.getAddress().getHostString());            
            System.out.print(":");
            System.out.print(server.getAddress().getPort());
            System.out.println();
        
        } catch (IOException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
    
}
