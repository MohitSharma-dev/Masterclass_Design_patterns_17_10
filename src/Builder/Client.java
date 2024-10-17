package Builder;

public class Client {
    public static void main(String[] args) {
//        NetworkRequest networkRequest = new NetworkRequest();
//        Not a good thing
//        networkRequest.setBody("");
//        networkRequest.setMethod("GET");

//        NetworkRequestBuilder networkRequestBuilder = new NetworkRequestBuilder();
        NetworkRequest networkRequest =
                NetworkRequest
                        .getBuilder()
                        .setUrl("Https://")
                        .setMethod("GET")
                        .setTimeout(30)
                        .build();

//            NetworkRequest networkRequest1 = new NetworkRequest(new);
//        NetworkRequest networkRequest = new NetworkRequest(networkRequestBuilder);


    }
}
