package ar.edu.iua.webServices;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.academico.profesores.Profesor;

import ar.edu.iua.negocio.academico.profesor.BuscarProfesorEx;
import ar.edu.iua.negocio.academico.profesor.BuscarProfesoresImpl;


import java.util.Map;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;


public class BuscarProfesoresHandler implements HttpHandler {
    
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

    private void executeResponse(HttpExchange exchange,Map<String, String> params,String body) throws IOException{
        BuscarProfesoresImpl buscadorProfes = new BuscarProfesoresImpl();
        String terminos = params.get("terms");
        Gson gson = new Gson();
        List<Profesor> profesEncontrados = new ArrayList<Profesor>();
        try {
            profesEncontrados = buscadorProfes.buscar(terminos.toString());
            String msg = gson.toJson(profesEncontrados);
            byte[] json = msg.getBytes("UTF-8");
            exchange.sendResponseHeaders(200, json.length);
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
            os.close();
            
        } catch (BuscarProfesorEx e) {
            System.out.println(e.getMessage());
            String msg = e.getMessage();
            exchange.sendResponseHeaders(400, msg.length());
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
            e.printStackTrace();
        }

    }
    
}
