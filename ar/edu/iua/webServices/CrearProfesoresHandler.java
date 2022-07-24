package ar.edu.iua.webServices;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import ar.edu.iua.modelo.academico.profesores.ProfesorImpl;
import ar.edu.iua.negocio.academico.profesor.CrearProfesorEx;
import ar.edu.iua.negocio.academico.profesor.CrearProfesoresImpl;

public class CrearProfesoresHandler implements HttpHandler{
    public void handle(HttpExchange exchange) throws IOException {
        String contextPath = exchange.getHttpContext().getPath();

        URI uri = exchange.getRequestURI();

        String path = uri.toString().replaceFirst(contextPath, "");
        Map<String, String> params = UtilServices.readParamsQuery(path);

        String body = UtilServices.readBody(exchange);

        try{
            executeResponse(exchange, params, body);
        }catch(Exception e){
            System.out.println(e.getMessage());
            String msg = "504 ERROR INTERNO";
            exchange.sendResponseHeaders(504,msg.length());
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
            os.close();
        }
        
    }

    private void executeResponse(HttpExchange exchange,Map<String, String> params,String body) throws IOException{
        ProfesorImpl[] creadoArray = new Gson().fromJson(body, ProfesorImpl[].class); 
        List<ProfesorImpl> creadoList = Arrays.asList(creadoArray);
        CrearProfesoresImpl crearProfesores = new CrearProfesoresImpl();
    
        String msg = "";
        try {
            crearProfesores.crear(creadoList);
            msg = "200: Se crearon los profesores.";
            exchange.sendResponseHeaders(200,msg.length());
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
            os.close();
        } catch (CrearProfesorEx e) {
            System.out.println(e.getMessage());
            msg = e.getMessage();
            exchange.sendResponseHeaders(400,msg.length());
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
            os.close();
        }
    }

    
}
