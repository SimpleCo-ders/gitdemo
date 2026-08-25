package java_basics;

class run {

    String brand;
    int year;

    run(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

public class Car {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        run c = new run("BMW", 2027);
        System.out.println(c.brand + c.year);
    }
}