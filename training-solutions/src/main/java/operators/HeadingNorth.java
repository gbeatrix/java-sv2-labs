package operators;

public class HeadingNorth {
    public int getNumberOfNewDirections(){
        int angle = 0;
        int k;
        for(k = 1 ; angle%360 != 0 || k == 1; k++){
            angle += k*10;
        }
        return --k;
    }

    public static void main(String[] args) {
        HeadingNorth headingNorth = new HeadingNorth();
        System.out.println(headingNorth.getNumberOfNewDirections());
    }
}
