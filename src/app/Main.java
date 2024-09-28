package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter app - ver 1.0");
        double F = 98.6;
        double celsius = FtoC(F);
        System.out.println(F + " Fahrenheit is " + celsius + " Celsius.");

    }
    public static double FtoC(double F) {
        return (F - 32) * 5/9;
    }

}