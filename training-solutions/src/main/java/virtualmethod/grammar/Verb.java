package virtualmethod.grammar;

public abstract class Verb {
    protected String word;

    protected Verb(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}
