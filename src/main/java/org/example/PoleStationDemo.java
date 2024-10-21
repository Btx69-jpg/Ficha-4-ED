package org.example;

import Parte2.Ex5.Driver;
import Parte2.Ex5.PoleStation;

public class PoleStationDemo {
    public static void main(String[] args) {

        PoleStation station = new PoleStation();
        station.addDriver(new Driver("Juan", 2));
        station.addDriver(new Driver("Pedro", 3));
        station.addDriver(new Driver("Maria", 1));
        station.addDriver(new Driver("Luis", 4));
        station.addDriver(new Driver("Ana", 5));
        station.addDriver(new Driver("Carlos", 6));
        station.addDriver(new Driver("Laura", 7));
        station.addDriver(new Driver("Jorge", 8));
        station.addDriver(new Driver("Sofia", 9));
        station.addDriver(new Driver("Marta", 10));

        Driver[] drivers = station.getDrivers();
        for (Driver driver : drivers) {
            System.out.println(driver.getName() + " - " + driver.getnPoles());
        }

    }
}
