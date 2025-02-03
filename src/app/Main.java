package app;

public class Main {
    private static double CONV_M = 1.6093;

    public static void main(String[] args) {
        System.out.println("My SSH app");
        double ml = 12;
        double kilometr = convMileToKilomtr(ml);
        System.out.println("Result is " + kilometr + " kilometriv");
    }

    private static double convMileToKilomtr(double ml) {
        return ml * CONV_M;
    }
}
