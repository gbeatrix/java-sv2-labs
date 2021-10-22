package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    public static void main(String[] args){
        List<String> content = new ArrayList<>();
        content.add("mexikói zöldségkeverék");
        content.add("darált hús");
        content.add("fagyi");
        content.add("leveles tészta");
        content.add("sóska");
        System.out.println("A következő " + content.size() + " étel van a mélyhűtőben: " + content);
        content.remove("sóska");
        content.remove("darált hús");
        System.out.println("A következő " + content.size() + " étel van a mélyhűtőben: " + content);
    }
}
