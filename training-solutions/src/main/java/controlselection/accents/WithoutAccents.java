package controlselection.accents;

public class WithoutAccents {
    public char convertToCharWithoutAccents(char c){
        String vowels = "áÁéÉíÍóöőÓÖŐúüűÚÜŰ";
        String convertTo = "aAeEiIoooOOOuuuUUU";
        int pos = vowels.indexOf(c);
        if(pos>=0) {
            return convertTo.charAt(pos);
        } else {
            return c;
        }
    }
}
