package abstractfactory;

public class USPTire implements Tire {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing tires for US standards");
    }
}