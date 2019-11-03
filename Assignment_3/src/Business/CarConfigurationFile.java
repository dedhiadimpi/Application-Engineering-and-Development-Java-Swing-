/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author dedhi
 */
public class CarConfigurationFile {
    
    public CarConfigurationFile(CarCatalog carCatalog){
        //Creation of Car objects with attributes
        ArrayList<Car> carArr = carCatalog.getCarCatalog();
        carArr.add(new Car("Audi","Volkswagen",34567,12345,2010,"Boston",4,"Blue","expired","John",true));
        carArr.add(new Car("BMW","BMW",12378,23456,2017,"Cambridge",6,"White","expired","Smith",true));
        carArr.add(new Car("Toyota","Toyota Motor Corporation",23670,34567,2018,"Quincy",7,"Gray","notexpired","Alex",true));
        carArr.add(new Car("GMC","General Motors Company",23509,45678,2016,"Boston",6,"Black","notexpired","Julien",true));
        carArr.add(new Car("Toyota","Toyota Motor Corporation",14235,56789,2010,"Somerville",4,"Blue","notexpired","John S.",true));
        carArr.add(new Car("BMW","BMW",11134,67890,2016,"Boston",7,"White","expired","Martin",false));
        carArr.add(new Car("Audi","Volkswagen",33359,89012,2015,"Boston",6,"Gray","expired","Joseph",false));
        carArr.add(new Car("GMC","General Motors Company",32466,90123,2015,"Somerville",7,"Red","notexpired","James",false));
        carArr.add(new Car("BMW","BMW",33568,97635,2015,"Cambridge",4,"Black","notexpired","Victoria",false));
        carArr.add(new Car("Audi","Volkswagen",12667,16093,2010,"Quincy",6,"Blue","notexpired","Kal",false));
        Calendar now = Calendar.getInstance(); 
        CarCatalog.setLastUpdate(now.getTime());
    }
    
}
