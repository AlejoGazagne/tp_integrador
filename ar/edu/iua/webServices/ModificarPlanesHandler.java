package ar.edu.iua.webServices;

import com.sun.net.httpserver.HttpHandler;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.negocio.academico.plan.ModificarPlanEx;
import ar.edu.iua.negocio.academico.plan.ModificarPlanesImpl;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;

public class ModificarPlanesHandler implements HttpHandler{

    public void handle(HttpExchange exchange) throws IOException {

        //String protocol = exchange.getProtocol();
        //String verb = exchange.getRequestMethod();
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
        Plan[] modificarArray = new Gson().fromJson(body, Plan[].class); 
        List<Plan> modificadoList = Arrays.asList(modificarArray);
        ModificarPlanesImpl modificarPlanes = new ModificarPlanesImpl();
    
        String msg = "";
        try {
            modificarPlanes.modificar(modificadoList);
            msg = "200: Se creo el plan.";
            exchange.sendResponseHeaders(200,msg.length());
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
            os.close();
        } catch (ModificarPlanEx e) {
            System.out.println(e.getMessage());
            msg = e.getMessage();
            exchange.sendResponseHeaders(400,msg.length());
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
            os.close();
        }
    }
    
}