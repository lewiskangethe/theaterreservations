package com.pluralsight;

public class CarExample2 {
    public static void main(String[] args) {
        CarExample car1 = new CarExample();
        car1.setMake("Nissan");
        car1.setModel("Altima");

        System.out.println(car1.getMake()+" "+car1.getModel());

        CarExample car2 = new CarExample();
        car2.setMake("Kia");
        car2.setModel("Seltos");

        System.out.println(car2.getMake()+" "+car2.getModel());


    }
}
