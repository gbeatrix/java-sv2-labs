package operators;

public class Operators {
    public boolean isEven(int n){
        return n%2==0;
    }

    public String getResultOfDivision(int number, int divisor){
        String result = number + " / " + divisor + " = ";
        result += number/divisor;
        result += ", maradék: " + (number%divisor);
        return result;
    }

    public String isNull(String s){
        return (s==null)?"null értékű":"nem null értékű";
    }

    public boolean isEmpty(String s){
        return s == null || s.equals("");
    }
}
