package abstractfactory;

public class EuropeTire implements Tire {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing tires for Europe standards");
    }
}