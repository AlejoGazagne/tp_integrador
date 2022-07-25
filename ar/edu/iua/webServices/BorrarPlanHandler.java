package ar.edu.iua.webServices;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.negocio.academico.plan.BorrarPlanEx;
import ar.edu.iua.negocio.academico.plan.BorrarPlanImpl;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.Map;

public class BorrarPlanHandler implements HttpHandler{

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
        BorrarPlanImpl borrarPlan = new BorrarPlanImpl();
        int anio = Integer.parseInt(params.get("anio"));
        PlanImpl borrar = new PlanImpl();
        
        borrar.setAnio(anio);
        try {
            boolean ok = false;
            ok = borrarPlan.borrar(borrar);
            if(ok==true){
                String msg = "Se borro el plan con exito: " + ok;
                exchange.sendResponseHeaders(200, msg.length());
                OutputStream os = exchange.getResponseBody();
                os.write(msg.getBytes());
                os.close();
            }
        } catch (BorrarPlanEx e) {
            System.out.println(e.getMessage());
            String msg = e.getMessage();
            exchange.sendResponseHeaders(400, msg.length());
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
            os.close();
        }

    }

    
    
}
