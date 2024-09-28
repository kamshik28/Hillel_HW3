package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter app - ver 1.0");
        double F = 98.6;
        double C = FtoC(F);
        System.out.println(F + " Fahrenheit is " + C + " Celsius.");

        C = 37;
        F = CtoF(C);
        System.out.println(C + " Celsius is " + F + " Fahrenheit.");


    }
    public static double FtoC(double F) {
        return (F - 32) * 5/9;
    }
    public static double CtoF(double C) {
        return (C * 9/5) + 32;
    }

}