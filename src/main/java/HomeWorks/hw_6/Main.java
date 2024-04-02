package HomeWorks.hw_6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Car car = new Car.Builder()
                .wheelCount(4)
                .maxSpeed(320)
                .engineType("gasoline")
                .brand("kia")
                .model("rio")
                .build();
        System.out.println(car);


//
//        Transport car1 = new Car(4, 250, "diesel", "BMW", "X5m");
//        Transport car2 = new Car(4, 200, "gas", "Honda", "Accord");
//        ServiceStation serviceStation = new ServiceStation();
//        car1.service();
//        Transport truck1 = new Truck(8, 160, "diesel", 20);
//        Transport truck2 = new Truck(8, 150, "diesel", 15);
//        Transport bike1 = new Bicycle(2, 40, "cross-country");
//        Transport bike2 = new Bicycle(3, 10, "baby-bike");
//
//        Transport[] wheeledTransports = new WheeledTransport[6];
////        wheeledTransports[0] = car1;
////        wheeledTransports[1] = car2;
//        wheeledTransports[2] = truck1;
//        wheeledTransports[3] = truck2;
//        wheeledTransports[4] = bike1;
//        wheeledTransports[5] = bike2;
//
//        for (Transport t : wheeledTransports) {
//            ServiceStation.visitServiceStation(t);
//        }
    }


}

