package Strategy;

public class PathCalculatorStrategyFactory {
    static PathCalculatorStrategy getPathCalculatorStrategy(TravelMode travelMode) {
        PathCalculatorStrategy pathCalculatorStrategy = null;
        if(travelMode.equals(TravelMode.WALK)){
          pathCalculatorStrategy = new WalkPathCalculatingStrategy();
        } else if (travelMode.equals(TravelMode.BIKE)){
            //       an algo which will find the way
            pathCalculatorStrategy = new BikePathCalculatingStrategy();
        } else if (travelMode.equals(TravelMode.CAR)){
            //            an algo which will find the way
            pathCalculatorStrategy = new CarPathCalculatingStrategy();
        }
        return pathCalculatorStrategy;
    }
}
