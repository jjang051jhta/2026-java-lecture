package review.static01;

public class MathArrayUtils {
    private MathArrayUtils() {
    }

    public static int sum(int [] values) {
        int total = 0;
        for(int num:values) {
            total+=num;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }
    //3,2,4,4,5
    public static int min(int[] values) {
        int minValue = values[0];
        for(int value:values) {
            if(minValue > value) {
                minValue = value;
            }
        }
        return minValue;
    }
    public static int max(int[] values) {
        int maxValue = values[0];
        for(int value:values) {
            if(maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }

}
