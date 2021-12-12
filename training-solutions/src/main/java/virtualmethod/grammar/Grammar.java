package virtualmethod.grammar;

public class Grammar {
    public static void main(String[] args) {
        System.out.println(1);
        Verb phrasalVerbAsVerb = new PhrasalVerb("old", "meg");
        System.out.println(phrasalVerbAsVerb.getWord());

        System.out.println(2);
        Verb phrasalVerbWithSuffixAsVerb = new PhrasalVerbWithSuffix("old", "meg", "om");
        System.out.println(phrasalVerbWithSuffixAsVerb.getWord());

        System.out.println(3);
        Preposition phrasalVerbAsPreposition = new PhrasalVerb("old", "meg");
        System.out.println(phrasalVerbAsPreposition.getPreposition());
        System.out.println(phrasalVerbAsPreposition.getWholeWord());

        System.out.println(4);
        Preposition phrasalVerbWithSuffixAsPreposition = new PhrasalVerbWithSuffix("old", "meg", "om");
        System.out.println(phrasalVerbWithSuffixAsPreposition.getPreposition());
        System.out.println(phrasalVerbWithSuffixAsPreposition.getWholeWord());

        System.out.println(5);
        PhrasalVerb phrasalVerb = new PhrasalVerb("old", "meg");
        System.out.println(phrasalVerb.getWord());
        System.out.println(phrasalVerb.getPreposition());
        System.out.println(phrasalVerb.getWholeWord());

        System.out.println(6);
        PhrasalVerb phrasalVerbWithSuffixAsPhrasalVerb = new PhrasalVerbWithSuffix("old", "meg", "om");
        System.out.println(phrasalVerbWithSuffixAsPhrasalVerb.getWord());
        System.out.println(phrasalVerbWithSuffixAsPhrasalVerb.getPreposition());
        System.out.println(phrasalVerbWithSuffixAsPhrasalVerb.getWholeWord());

        System.out.println(7);
        Suffix phrasalVerbWithSuffixAsSuffix = new PhrasalVerbWithSuffix("old", "meg", "om");
        System.out.println(phrasalVerbWithSuffixAsSuffix.getSuffix());

        System.out.println(8);
        PhrasalVerbWithSuffix phrasalVerbWithSuffix = new PhrasalVerbWithSuffix("old", "meg", "om");
        System.out.println(phrasalVerbWithSuffix.getWord());
        System.out.println(phrasalVerbWithSuffix.getPreposition());
        System.out.println(phrasalVerbWithSuffix.getWholeWord());
        System.out.println(phrasalVerbWithSuffix.getSuffix());
    }
}
