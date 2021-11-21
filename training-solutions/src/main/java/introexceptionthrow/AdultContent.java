package introexceptionthrow;

public class AdultContent {
    public static void main(String[] args) {
        String format = "%s (%d)%n";
        Adult adult23 = new Adult("Gipsz Jakab", 23);
        System.out.printf(format, adult23.getName(), adult23.getAge());
        Adult adult11 = new Adult("Minta Áron", 11);
        System.out.printf(format, adult11.getName(), adult11.getAge());
        Adult adult32 = new Adult("Remek Elek", 32);
        System.out.printf(format, adult32.getName(), adult32.getAge());
    }
}
