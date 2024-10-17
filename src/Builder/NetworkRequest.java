package Builder;

import java.util.HashMap;
import java.util.Map;

public class NetworkRequest {
    private String url;
    private String method;
    private HashMap<String, String> headers;
    private String body;
    private int timeout;

    private NetworkRequest(NetworkRequestBuilder networkRequestBuilder){
        this.url = networkRequestBuilder.getUrl();
        this.method = networkRequestBuilder.getMethod();
        this.headers = networkRequestBuilder.getHeaders();
        this.body = networkRequestBuilder.getBody();
        this.timeout = networkRequestBuilder.getTimeout();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(HashMap<String, String> headers) {
        this.headers = headers;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public static NetworkRequestBuilder getBuilder(){
        return new NetworkRequestBuilder();
    }

    public static class NetworkRequestBuilder {
        private String url;
        private String method;
        private HashMap<String, String> headers;
        private String body;
        private int timeout;

        public String getUrl() {
            return url;
        }

        public String getMethod() {
            return method;
        }

        public HashMap<String, String> getHeaders() {
            return headers;
        }

        public String getBody() {
            return body;
        }

        public int getTimeout() {
            return timeout;
        }

        public NetworkRequestBuilder setUrl(String url) {
            this.url = url;
            return this;
        }

        public NetworkRequestBuilder setMethod(String method) {
            this.method = method;
            return this;
        }

        public NetworkRequestBuilder setHeaders(HashMap<String, String> headers) {
            this.headers = headers;
            return this;
        }

        public NetworkRequestBuilder setBody(String body) {
            this.body = body;
            return this;
        }

        public NetworkRequestBuilder setTimeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public NetworkRequest build(){
//        validations can come over here
            if(body.isEmpty() && method.equals("POST")){
                throw new IllegalArgumentException("You must specify a body");
            }
            return new NetworkRequest(this);
        }
    }

    //    Bad way you have to create a lot of instructors
//    public NetworkRequest(String url, String method, Map<String, String> headers, String body, int timeout) {
//
//    }
//
//    NetworkRequest(String url, String method, Map<String, String> headers, String body) {
//
//    }
//
//    NetworkRequest(String url, String method, Map<String, String> headers) {}
}
