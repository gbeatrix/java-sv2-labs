package typeconversion;

public class Conversion {
    public double convertDoubleToDouble(double x){
        int y = (int)x;
        return y;
    }

    public byte[] convertIntArrayToByteArray(int[] arr){
        byte[] result = new byte[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0 && arr[i]<128){
                result[i] = (byte)arr[i];
            } else {
                result[i] = (byte)-1;
            }
        }
        return result;
    }

    public int getFirstDecimal(double num){
        double frac = num - (int)num;
        frac *= 10;
        return (int)frac;
    }
}
