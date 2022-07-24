package ar.edu.iua.webServices;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.Map;

//import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.negocio.academico.plan.BuscarPlanEx;
import ar.edu.iua.negocio.academico.plan.BuscarPlanImpl;

import com.google.gson.Gson;



public class BuscarPlanHandler implements HttpHandler {

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
        BuscarPlanImpl encontrado = new BuscarPlanImpl();
        //Gson gson = new Gson();
        int anio = Integer.parseInt(params.get("anio"));
        PlanImpl plan = new PlanImpl(); 
        
        try {
            plan = (PlanImpl) encontrado.buscar(anio);
        } catch (BuscarPlanEx e) {
            System.out.println(e.getMessage());
            String msg = e.getMessage();
            exchange.sendResponseHeaders(400, msg.length());
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
         
        }
        Gson gson = new Gson();
        String msg = gson.toJson(plan);
        exchange.sendResponseHeaders(200, msg.length());
        OutputStream os = exchange.getResponseBody();
        os.write(msg.getBytes());
        os.close();
    }

}
