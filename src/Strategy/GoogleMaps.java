package Strategy;

public class GoogleMaps {
    void findPathByMode(TravelMode travelMode) {
        PathCalcStrategy p = PathCalculatorStrategyFactory.findPathCalcStrategyByMode(travelMode);
        p.findPath();
    }

}
