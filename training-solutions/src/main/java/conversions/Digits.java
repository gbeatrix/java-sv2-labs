package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {
    private List<Integer> attr = new ArrayList<>();

    public static void main(String[] args) {
        Digits digits = new Digits();
        digits.addDigitsToList("2021. október 29-én, pénteken 11:15-kor írom ezt.");
        System.out.println(digits.getAttr());
    }

    public void addDigitsToList(String text){
        char[] textAsCharArray = text.toCharArray();
        for(char c : textAsCharArray){
            if(Character.isDigit(c)){
                attr.add(Integer.parseInt(""+c));
            }
        }
    }

    public List<Integer> getAttr() {
        return attr;
    }
}
