package ar.edu.iua.webServices;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

public class Server {
    public static void server(){

        try {
            
            HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

            server.createContext("/buscarPlan", new BuscarPlanHandler()); // http://localhost:8080/buscarPlan
            server.createContext("/buscarPlanes", new BuscarPlanesHandler()); // http://localhost:8080/buscarPlanes

            server.createContext("/modificarPlan", new ModificarPlanHandler()); // http://localhost:8080/modificarPlan
            server.createContext("/modificarPlanes", new ModificarPlanesHandler()); // http://localhost:8080/modificarPlanes

            server.createContext("/borrarPlan", new BorrarPlanHandler()); // http://localhost:8080/borrarPlan
            server.createContext("/borrarPlanes", new BorrarPlanesHandler()); // http://localhost:8080/borrarPlanes

            server.createContext("/crearPlan", new CrearPlanHandler()); // http://localhost:8080/crearPlan
            server.createContext("/crearPlanes", new CrearPlanesHandler()); // http://localhost:8080/crearPlanes

            
            server.createContext("/crearProfesor", new CrearProfesorHandler()); // http://localhost:8080/crearProfesor
            server.createContext("/crearProfesores", new CrearProfesorHandler()); // http://localhost:8080/crearProfesor

            server.createContext("/buscarProfesor", new BuscarProfesorHandler()); // http://localhost:8080/buscarProfesor
            server.createContext("/buscarProfesores", new BuscarProfesoresHandler()); // http://localhost:8080/buscarProfesores


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
