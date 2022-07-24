package ar.edu.iua.webServices;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.Map;

import com.google.gson.Gson;
//import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import ar.edu.iua.modelo.academico.profesores.Profesor;
import ar.edu.iua.modelo.academico.profesores.ProfesorImpl;
import ar.edu.iua.negocio.academico.profesor.BuscarProfesorEx;
import ar.edu.iua.negocio.academico.profesor.BuscarProfesorImpl;


public class BuscarProfesorHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException {

        //String protocol = exchange.getProtocol();
        //String verb = exchange.getRequestMethod();
        String contextPath = exchange.getHttpContext().getPath();

        URI uri = exchange.getRequestURI();

        String path = uri.toString().replaceFirst(contextPath, "");
        Map<String, String> params = UtilServices.readParamsQuery(path);

        String body = UtilServices.readBody(exchange);

        executeResponse(exchange, params, body);
        
    }

    private void executeResponse(HttpExchange exchange, Map<String, String> params, String body) throws IOException {
        BuscarProfesorImpl encontrado = new BuscarProfesorImpl();
        //Gson gson = new Gson();
        int dni = Integer.parseInt(params.get("dni"));
        Profesor prof = new ProfesorImpl(); 
    
        try {
            prof = (ProfesorImpl) encontrado.buscar(dni);
            String msg = new Gson().toJson(prof);
            exchange.sendResponseHeaders(200, msg.length());
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
            os.close();

        } catch (BuscarProfesorEx e) {
            System.out.println(e.getMessage());
            String msg = e.getMessage();
            exchange.sendResponseHeaders(400, msg.length());
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
            os.close();
        }
            
    }

}
