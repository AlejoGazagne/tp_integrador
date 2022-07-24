package ar.edu.iua.webServices;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.negocio.academico.plan.BuscarPlanEx;
import ar.edu.iua.negocio.academico.plan.BuscarPlanesImpl;




public class BuscarPlanesHandler implements HttpHandler {
   
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

    //como lo escribiria el profe
    //http://localhost:8080/buscar?termino=asdas

    private void executeResponse(HttpExchange exchange,Map<String, String> params,String body) throws IOException{
        BuscarPlanesImpl buscadorPlanes = new BuscarPlanesImpl();
        List<PlanImpl> planesEncontrados = new ArrayList<>();
        Gson gson = new Gson();
        String termino = params.get("terms");
        
        try {
            planesEncontrados = buscadorPlanes.buscar(termino.toString());
            String msg = gson.toJson(planesEncontrados);
            exchange.sendResponseHeaders(200, msg.length());
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
            os.close();
            
        } catch (BuscarPlanEx e) {
            System.out.println(e.getMessage());
            String msg = e.getMessage();
            exchange.sendResponseHeaders(400, msg.length());
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
            e.printStackTrace();
        }
    }



}
