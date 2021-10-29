package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {
        Name gipsz = new Name("Gipsz", null, "Jakab");
        Name bodon = new Name("Zsíros", "B.", "Ödön", Title.MR);
        Name house = new Name("House", "", "Gregory", Title.DR);

        System.out.println(gipsz.concatNameHungarianStyle());
        System.out.println(gipsz.concatNameWesternStyle());
        System.out.println(bodon.concatNameHungarianStyle());
        System.out.println(bodon.concatNameWesternStyle());
        System.out.println(house.concatNameHungarianStyle());
        System.out.println(house.concatNameWesternStyle());
    }
}
