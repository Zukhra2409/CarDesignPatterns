package abstractfactory;

public class Main {
    public static void main(String[] args) {
        CarFactoryAbstract europeFactory = new EuropeCarFactory();
        Engine europeEngine = europeFactory.createEngine();
        Tire europeTire = europeFactory.createTire();
        europeEngine.design();
        europeTire.manufacture();

        CarFactoryAbstract uspFactory = new USPCarFactory();
        Engine uspEngine = uspFactory.createEngine();
        Tire uspTire = uspFactory.createTire();
        uspEngine.design();
        uspTire.manufacture();
    }
}