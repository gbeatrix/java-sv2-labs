package stringconcat.nameconcat;

public class Name {
    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title){
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public Name(String familyName, String middleName, String givenName){
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public String concatNameWesternStyle(){
        String result = "";
        result += title==null?"":title.getValue()+" ";
        result += empty(givenName)?"":givenName;
        result += empty(middleName)?"":" "+middleName;
        result += empty(familyName)?"":" "+familyName;
        return result;
    }

    public String concatNameHungarianStyle(){
        String result = "";
        result = result.concat(title==null?"":title.getValue()+" ");
        result = result.concat(empty(familyName)?"":familyName);
        result = result.concat(empty(middleName)?"":" "+middleName);
        result = result.concat(empty(givenName)?"":" "+givenName);
        return result;
    }

    private boolean empty(String s){
        return s==null || "".equals(s);
    }
}
