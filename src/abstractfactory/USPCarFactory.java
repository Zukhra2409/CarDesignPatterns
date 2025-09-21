package abstractfactory;

public class USPCarFactory implements CarFactoryAbstract {
    @Override
    public Engine createEngine() {
        return new USPEngine();
    }

    @Override
    public Tire createTire() {
        return new USPTire();
    }
}