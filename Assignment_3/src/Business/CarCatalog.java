/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dedhi
 */
//reation of arrayList that stores car objects
public class CarCatalog {
    private ArrayList<Car> carCatalog;
    public static Date lastUpdate;
    
    public CarCatalog(){
        carCatalog = new ArrayList<Car>();
    }

    public ArrayList<Car> getCarCatalog() {
        return carCatalog;
    }

    //Setter and getter methods of each attribute
    public void setCarCatalog(ArrayList<Car> carCatalog) {
        this.carCatalog = carCatalog;
    }
    
    public static Date getLastUpdate() {
        return lastUpdate;
    }

    public static void setLastUpdate(Date lastUpdate) {
        CarCatalog.lastUpdate = lastUpdate;
    }
    
    //Getting first available car
    public Car getFirstCar(){
        for(Car c : getCarCatalog()){
            if(c.isAvailability()){
                return c;
            }
        }
        return null;        
    }
    
    //Creation of new car object and adding it to the arrayList
    public Car addCar(){
        Car car = new Car();
        carCatalog.add(car);
        return car;
    }
    
    //Deleting the car object selected by the user
    public void deleteCar(Car car){
        carCatalog.remove(car);
    }
    
}
