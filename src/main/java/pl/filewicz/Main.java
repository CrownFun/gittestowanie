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

        System.out.println("1");
        System.out.println("2");
        System.out.println("3");

        System.out.println("4");
        System.out.println("65");
        System.out.println("6");

        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
    }
}
