package pl.filewicz;

public class Main {

    private static int number = 10;

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(number);
        Putin putin = new Putin();
        Logitech logitech = new Logitech();
        Dell dell = new Dell();
        Sony sony = new Sony();
        HP hp = new HP();
        hp.hello();
        dell.dell();
        logitech.hell();
        putin.hello();
        sony.hello();

    }
}
