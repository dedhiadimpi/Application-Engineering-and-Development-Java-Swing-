/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author dedhi
 */
//Car Object class with its attributes
public class Car {
    private String brand;
    private String manufacturerName;
    private int modelNumber;
    private int serialNumber;
    private int yearOfManufacture;
    private String city;
    private int numberOfSeats;
    private String color;
    private String maintenanceCertificate;
    private String driverName;
    private boolean availability;
    
    public Car(){
        
    }
    
    public Car(String brand, String manufacturerName, int modelNumber, int serialNumber, int yearOfManufacture, String city, int numberOfSeats,
            String color, String maintenanceCertificate, String driverName, boolean availability){
        this.brand = brand;
        this.manufacturerName = manufacturerName;
        this.modelNumber = modelNumber;
        this.serialNumber = serialNumber;
        this.yearOfManufacture = yearOfManufacture;
        this.city = city;
        this.numberOfSeats = numberOfSeats;
        this.color = color;
        this.maintenanceCertificate = maintenanceCertificate;
        this.driverName = driverName;
        this.availability = availability;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaintenanceCertificate() {
        return maintenanceCertificate;
    }

    public void setMaintenanceCertificate(String maintenanceCertificate) {
        this.maintenanceCertificate = maintenanceCertificate;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    
    public String toString(){
       return this.getBrand();
    }
}
