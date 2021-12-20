package schoolrecords;

import java.util.List;

public class Math {
    public double floor(double value, int precision) {
        return ((long) (value * java.lang.Math.pow(10, precision))) / java.lang.Math.pow(10d, precision);
    }

    public double getAvg(List<Double> values) {
        if (values.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.size();
    }
}
