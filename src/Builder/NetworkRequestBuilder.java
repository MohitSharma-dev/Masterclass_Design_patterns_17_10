//package Builder;
//
//import java.util.HashMap;
//
//
//public class NetworkRequestBuilder {
//    private String url;
//    private String method;
//    private HashMap<String, String> headers;
//    private String body;
//    private int timeout;
//
//    public String getUrl() {
//        return url;
//    }
//
//    public String getMethod() {
//        return method;
//    }
//
//    public HashMap<String, String> getHeaders() {
//        return headers;
//    }
//
//    public String getBody() {
//        return body;
//    }
//
//    public int getTimeout() {
//        return timeout;
//    }
//
//    public NetworkRequestBuilder setUrl(String url) {
//        this.url = url;
//        return this;
//    }
//
//    public NetworkRequestBuilder setMethod(String method) {
//        this.method = method;
//        return this;
//    }
//
//    public NetworkRequestBuilder setHeaders(HashMap<String, String> headers) {
//        this.headers = headers;
//        return this;
//    }
//
//    public NetworkRequestBuilder setBody(String body) {
//        this.body = body;
//        return this;
//    }
//
//    public NetworkRequestBuilder setTimeout(int timeout) {
//        this.timeout = timeout;
//        return this;
//    }
//
//    public NetworkRequest build(){
////        validations can come over here
//        if(body.isEmpty() && method.equals("POST")){
//            throw new IllegalArgumentException("You must specify a body");
//        }
//        return new NetworkRequest(this);
//    }
//}
