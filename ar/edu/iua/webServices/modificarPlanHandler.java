package ar.edu.iua.webServices;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.Map;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.negocio.academico.plan.BuscarPlanEx;
import ar.edu.iua.negocio.academico.plan.BuscarPlanImpl;
import ar.edu.iua.negocio.academico.plan.ModificarPlanEx;
import ar.edu.iua.negocio.academico.plan.ModificarPlanImpl;

public class modificarPlanHandler implements HttpHandler{
    
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
        
        ModificarPlanImpl modificarPlan = new ModificarPlanImpl();
        int anio = Integer.parseInt(params.get("anio"));
        int modificacion = Integer.parseInt(params.get("modif"));
        BuscarPlanImpl buscarPlan = new BuscarPlanImpl();
        PlanImpl plan = null;

        try {
            plan = (PlanImpl) buscarPlan.buscar(anio);
            plan.setAnio(modificacion);
            modificarPlan.modificar(plan);
            String jsonEstrinj = plan.fullToJson();
            exchange.sendResponseHeaders(200, jsonEstrinj.length());
            OutputStream os = exchange.getResponseBody();
            os.write(jsonEstrinj.getBytes());
            os.close();
            
        } catch (BuscarPlanEx | ModificarPlanEx e) {
            System.out.println(e.getMessage());
            exchange.sendResponseHeaders(204, 0);
        }

        
    }
}
