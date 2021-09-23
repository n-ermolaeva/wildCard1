public class Stats<T extends Number> {
    T[] nums;

    Stats(T[] o) {
        nums = o;
    }

    public double average() {
        double sum = 0.0;
        for (T num : nums) {
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }

    public boolean sameAvg(Stats<?> ob) {
        return average() == ob.average();
    }

//    public boolean sameAvg(Stats<T> ob) {
//        return average() == ob.average();
//    }

}