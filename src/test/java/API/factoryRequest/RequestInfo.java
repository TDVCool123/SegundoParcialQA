package API.factoryRequest;

import java.util.HashMap;
import java.util.Map;

public class RequestInfo {
    private String url;
    private String body;
    private Map<String,String> headers= new HashMap<>();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }


    public RequestInfo setHeaders(String key,String value) {
        this.headers.put(key, value);
        return this;
    }
}
