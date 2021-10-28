package chars;

public class LettersAndDigits {
    public void printLetterOrDigit(String text){
        char[] textAsCharArray = text.toCharArray();
        String msg;
        for(char c : textAsCharArray){
            msg = c + ": ";
            if (Character.isAlphabetic(c)){
                msg += "betű";
            } else if (Character.isDigit(c)){
                msg += "számjegy";
            } else {
                msg += "egyéb";
            }
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        LettersAndDigits lettersAndDigits = new LettersAndDigits();

        lettersAndDigits.printLetterOrDigit("bfa68fF;X");
    }
}
