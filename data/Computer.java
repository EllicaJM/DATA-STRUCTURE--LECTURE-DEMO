/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author User
 */
public class Computer {
    String brand;
    String cpu;
    

    public Computer(String brand, String cpu) {
        this.brand = brand;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer{" + "brand = " + brand + ", cpu = " + cpu + '}';
    }
}
