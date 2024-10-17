package Strategy;

public class GoogleMaps {

    public void getPath(String src, String dest , TravelMode travelMode){
//        if(travelMode.equals(TravelMode.WALK)){
////            an algo which will find the way
//
//        } else if (travelMode.equals(TravelMode.BIKE)){
//            //       an algo which will find the way
//
//        } else if (travelMode.equals(TravelMode.CAR)){
//            //            an algo which will find the way
//
//        }
        PathCalculatorStrategyFactory
                .getPathCalculatorStrategy(travelMode)
                .calculatePath(src, dest);
    }
}
