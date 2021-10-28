package chars;

public class Words {
    public String pushWord(String word){
        char[] wordAsCharArray = word.toCharArray();
        for (int i = 0; i < wordAsCharArray.length; i++) {
            wordAsCharArray[i]++;
        }
        return new String(wordAsCharArray);
    }

    public static void main(String[] args) {
        Words words = new Words();
        System.out.println(words.pushWord("alma"));
    }
}
