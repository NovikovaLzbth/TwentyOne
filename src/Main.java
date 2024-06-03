import java.util.ArrayList;
import java.util.List;

abstract class Transport{
    String name;
    List <String> accessories = new ArrayList();

    public String toString(){
        return "Средство перевозки: " + name + "\n" + accessories;
    }
}

    class Truck extends Transport{
    public Truck(){
        name = "Грузовик";
        accessories.add("Перевозка по дороге");
    }
}

class Airplane extends Transport{
    public Airplane(){
        name = "Самолет";
        accessories.add("Перевозка по воздуху");
    }
}

class Ship extends Transport{
    public Ship(){
        name = "Корабль";
        accessories.add("Перевозка по морю");
    }
}

abstract class TransportFactory{
    public abstract Transport createTransport();

}

class TruckFactory extends TransportFactory{
    public Transport createTransport(){
        return new Truck();
    }

}

class AirplaneFactory extends TransportFactory{
    public Transport createTransport(){
        return new Airplane();
    }

}

class ShipFactory extends TransportFactory {
    public Transport createTransport() {
        return new Ship();
    }

}

public class Main {
    public static void main(String[] args) {
        TransportFactory truckfactory = new TruckFactory();
        TransportFactory airplanefactory = new AirplaneFactory();
        TransportFactory shipfactory = new ShipFactory();

        Transport truck = truckfactory.createTransport();
        Transport airplane = airplanefactory.createTransport();
        Transport ship = shipfactory.createTransport();

        System.out.println(truck);
        System.out.println(airplane);
        System.out.println(ship);
    }
}