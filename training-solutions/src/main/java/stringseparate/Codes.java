package stringseparate;

import java.util.Arrays;
import java.util.List;

public class Codes {
    public String getCodesStartWithLetter(List<String> codes){
        StringBuilder sb = new StringBuilder("Betűvel kezdődő kódok: ");
        boolean first = true;
        for (String code : codes){
            if(Character.isAlphabetic(code.charAt(0))) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(", ");
                }
                sb.append(code);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        List<String> codeList = Arrays.asList("áíűő123", "T57fbj", "57fbj", "xtcu45", "1xtcu45", "f578GVHd");
        Codes codes = new Codes();
        System.out.println(codes.getCodesStartWithLetter(codeList));
    }
}
