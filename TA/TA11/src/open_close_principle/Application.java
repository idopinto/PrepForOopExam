package open_close_principle;

public class Application {
    public double getTotalVolume(GeoObjects[] geo_objects)
    {
        // Initially initializing sum to zero
        double vol_sum = 0;

        // Iterating using for each loop
        for (GeoObjects geo_obj : geo_objects) {
            vol_sum += geo_obj.getVolume();
        }

        return vol_sum;
    }
}
