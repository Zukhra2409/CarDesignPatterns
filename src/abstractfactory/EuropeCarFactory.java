package abstractfactory;

public class EuropeCarFactory implements CarFactoryAbstract {
    @Override
    public Engine createEngine() {
        return new EuropeEngine();
    }

    @Override
    public Tire createTire() {
        return new EuropeTire();
    }
}