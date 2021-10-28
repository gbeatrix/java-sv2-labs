package chars;

public class Whitespace {
    public String makeWhitespaceToStar(String text){
        char[] textAsCharArray = text.toCharArray();
        for (int i = 0; i < textAsCharArray.length; i++) {
            if(Character.isWhitespace(textAsCharArray[i])){
                textAsCharArray[i] = '*';
            }
        }
        return new String(textAsCharArray);
    }

    public static void main(String[] args) {
        Whitespace whitespace = new Whitespace();
        System.out.println(whitespace.makeWhitespaceToStar("The quick brown fox\njumps over the lazy dog."));
    }
}
