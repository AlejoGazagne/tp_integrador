package ar.edu.iua.webServices;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import com.sun.net.httpserver.HttpExchange;

public class UtilServices {
    
    public static Map<String, String> readParamsQuery(String path) throws IOException {

        Map<String, String> params = new HashMap<>();

        String[] tmp = path.split("\\?");
        if (tmp.length > 1) {
            String[] paramsStrings = tmp[1].split("&");
            for (String paramString : paramsStrings) {
                String[] keyValue = paramString.split("=");
                params.put(keyValue[0], keyValue[1]);
            }

        }

        return params;
    }

    public static String readBody(HttpExchange exchange) throws IOException {
        InputStream inputStream = exchange.getRequestBody();
        return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
    }
    
}
