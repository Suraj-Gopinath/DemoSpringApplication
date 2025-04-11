package org.example;

public class Dev {
    //    private int age;
    private Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

//    private Dev(int age) {
//        this.age = age;
//    }

//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build() {
        System.out.println("Working on a Spring Project!!");
        laptop.compile();
    }
}
