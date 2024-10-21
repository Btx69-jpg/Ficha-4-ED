package Parte2.Ex5;

import Parte1.Ex2.DoublyOrderedList;

import org.junit.Test;

import java.util.EmptyStackException;
import java.util.Iterator;

public class PoleStation {
    private DoublyOrderedList<Driver> drivers;

    public PoleStation() {
        drivers = new DoublyOrderedList<>();
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public Driver[] getDrivers() throws NullPointerException {
        /*
        Driver[] driversArray = new Driver[this.drivers.size()];
        Iterator<Driver> iterator = this.drivers.iterator();
        for (int i = 0; iterator.hasNext() ; i++){
            driversArray[i] = iterator.next();
        }

        return driversArray;

         */

        Driver[] driversArray = new Driver[this.drivers.size()];
        Iterator<Driver> iterator = this.drivers.iterator();
        int i = 0;

        if (iterator == null){
            throw new NullPointerException("Iterator cannot be null");
        }

        while (iterator.hasNext()) {  // Use 'while' para iterar enquanto houver elementos
            driversArray[i++] = iterator.next();  // Preenche o array e incrementa i
        }

        //porque necessaria esta linha de codigo para obter o ultimo elemento? preferivel alterar codigo ou manter assim?
        driversArray[i] = drivers.last();

        return driversArray;
    }

    public Driver removeDriver(Driver driver) throws NullPointerException  {
        if (driver == null){
            throw new NullPointerException("Driver cannot be null");
        }
        if (driver.equals(drivers.first())){
            return drivers.removeFirst();
        }else if (driver.equals(drivers.last())){
            return drivers.removeLast();
        }
        return drivers.remove(driver);

    }

    public int getNumberOfDrivers() {
        return drivers.size();
    }
}
