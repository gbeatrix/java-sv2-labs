package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> colors = new ArrayList<>();

    public static void main(String[] args) {
        Capsules capsules = new Capsules();

        capsules.addFirst("piros");
        capsules.addLast("lila");
        capsules.addFirst("sárga");
        capsules.addLast("kék");

        System.out.println(capsules.getColors());
        capsules.removeFirst();
        System.out.println(capsules.getColors());
        capsules.removeLast();
        System.out.println(capsules.getColors());
    }

    public void addLast(String item) {
        colors.add(item);
    }

    public void addFirst(String item) {
        colors.add(0, item);
    }

    public void removeFirst() {
        colors.remove(0);
    }

    public void removeLast() {
        colors.remove(colors.size()-1);
    }

    public List<String> getColors(){
        return colors;
    }
}
