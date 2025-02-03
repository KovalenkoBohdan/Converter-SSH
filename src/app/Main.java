package app;

public class Main {
    private static double CONV_M = 1.6093;
    private static double CONV_K = 0.6213711922;

    public static void main(String[] args) {
        System.out.println("My SSH app");
        double ml = 10;
        double km = 16;
        double kilometr = convMileToKilomtr(ml);
        double mile = convKilometrToMile(km);
        System.out.println("Result is " + kilometr + " kilometriv and " + mile + " mile");
    }

    private static double convKilometrToMile(double km) {
        return km * CONV_K;
    }

    private static double convMileToKilomtr(double ml) {
        return ml * CONV_M;
    }
}
