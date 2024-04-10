import java.io.*;

class A {
    int x = 10;

    void disp() {
        System.out.println("inside parent");
    }
}

class B extends A {
    void disp() {
        super.disp();
    }

    void print() {
        System.out.println(super.x);
    }
}

public class Main_A {
    public static void main(String[] args) {
        // Create objects and call methods here for testing
        B b = new B();
        b.disp();
        b.print();
    }
}
