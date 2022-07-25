package ar.edu.iua.webServices;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.negocio.academico.plan.BorrarPlanEx;
import ar.edu.iua.negocio.academico.plan.BorrarPlanesImpl;

public class BorrarPlanesHandler implements HttpHandler {

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
        List<PlanImpl> borrados = new ArrayList<>();
        
        for (Map.Entry<String, String> entry : params.entrySet()) {
            PlanImpl plan = new PlanImpl();
            plan.setAnio(Integer.parseInt(entry.getValue()));
            borrados.add(plan);
        }

        BorrarPlanesImpl borrador = new BorrarPlanesImpl();
        try {
            borrador.borrar(borrados);
            String msg = "200: Se borraron los planes";
            exchange.sendResponseHeaders(200, msg.length());
            OutputStream os = exchange.getResponseBody();
            os.write(msg.getBytes());
            os.close();
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
