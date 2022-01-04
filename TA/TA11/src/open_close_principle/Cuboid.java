package open_close_principle;

public class Cuboid extends GeoObjects{

    public double length;
    public double breadth;
    public double height;

    @Override
    public double getVolume() {
        return length * breadth * height;
    }
}
