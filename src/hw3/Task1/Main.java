package hw3.Task1;


import hw3.Task1.Car.Bus;
import hw3.Task1.Car.Truck;
import hw3.Task1.License.LicenseC;
import hw3.Task1.License.LicenseD;
import hw3.Task1.Car.Car;
import hw3.Task1.License.LicenseB;

import java.util.Set;

public class Main {



    public static void main(String[] args) {



        Mechanic<Car> mechanic1 = new Mechanic<Car>("Andrey", "Andreev", "Motor");
        Mechanic<Truck> mechanic2 = new Mechanic<Truck>("Vitia", "Viktorov", "CarFIX");
        Mechanic<Bus> mechanic3 = new Mechanic<Bus>("Ivan", "Ivanov", "Mischlen");

        Sponsor sponsor1 = new Sponsor("CarDrive", 150_000);
        Sponsor sponsor2 = new Sponsor("Formula", 120_000);
        Sponsor sponsor3 = new Sponsor("Monster", 170_000);


        Bus bus1 = new Bus("Паз", "т34-100", 2.5);
        bus1.addDriver(new LicenseD("Pasha", 4.0));
        bus1.addMechanic(mechanic3);
        bus1.addSponsor(sponsor2);
        System.out.println();

        Bus bus2 = new Bus("Man", "Voyager", 6.2);
        Bus bus3 = new Bus("Volkswagen", "Transporter", 5.5);
        Bus bus4 = new Bus("Ford", "Transit", 4.5);

        Car car1 = new Car("Lada", "Niva", 1.6);
        car1.addDriver(new LicenseB("Ivan", 10.0));
        car1.addMechanic(mechanic1);
        car1.addSponsor(sponsor2, sponsor2, sponsor1);
        System.out.println();
        Car car2 = new Car("Lada", "Vesta", 1.6);
        Car car3 = new Car("Volvo", "s60", 2.4);
        Car car4 = new Car("Volkswagen", "Jetta", 1.8);

        Truck truck1 = new Truck("Scania", "VF-100", 12.0);
        truck1.addDriver(new LicenseC("Pasha", 4.0));
        truck1.addMechanic(mechanic2, mechanic2, mechanic1, mechanic1);
        truck1.addSponsor(sponsor3, sponsor1);
        System.out.println();
        Truck truck2 = new Truck("Kamaz", "KZ10", 10.0);
        Truck truck3 = new Truck("MAN", "JetFly", 11.0);
        Truck truck4 = new Truck("Dodge", "Ram", 6.0);

        LicenseB ivan = new LicenseB("Ivan", 5.0);
        LicenseD pasha = new LicenseD("Pasha", 4.0);
        LicenseC vitia = new LicenseC("Vitia", 10.0);


        Set<Transport> transports = Set.of(car1, truck1, bus1);
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(car1);
        serviceStation.addTruck(truck1);
        serviceStation.service();
        serviceStation.service();



        for (Transport transport : transports) {
            printTransport(transport);
        }
    }

    private static void printTransport(Transport transport) {
        System.out.println("Информация по автомобилю: " + transport.getBrand() + transport.getModel());
        System.out.println("Водители: " + transport.getDrivers());
        System.out.println("Механики: " + transport.getMechanics());
        System.out.println("Спонсоры: " + transport.getSponsors());

        System.out.println();
    }
}