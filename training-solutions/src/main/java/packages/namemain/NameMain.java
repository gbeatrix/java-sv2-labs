package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {
    public static void main(String[] args) {
        Prefix pre = new Prefix("Mr.");
        FirstName first = new FirstName("Jakab");
        LastName last = new LastName("Gipsz");

        System.out.println(pre.getPre()+" "+first.getFirst()+" "+last.getLast());
    }
}
