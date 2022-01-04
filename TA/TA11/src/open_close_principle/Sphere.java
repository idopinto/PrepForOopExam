package open_close_principle;

public class Sphere extends GeoObjects{

    public double radius;

    @Override
    public double getVolume() {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }
}
