public class WildCardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<>(inums);
        double i = iOb.average();
        System.out.println("iOb average is " + i);

        Double[] dnums = {1.1, 2.2, 3.3, 4.5, 5.4};
        Stats<Double> dOb = new Stats<>(dnums);
        double d = dOb.average();
        System.out.println("dOb average is " + d);

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fOb = new Stats<>(fnums);
        double f = fOb.average();
        System.out.println("fOb average is " + f);

        System.out.println("Averages of iob and dob ");
        if (iOb.sameAvg(dOb))
            System.out.println("are the same");
        else System.out.println("differ");

        System.out.println("Averages of iob and fob ");
        if (iOb.sameAvg(fOb))
            System.out.println("are the same");
        else System.out.println("differ");
    }
}
