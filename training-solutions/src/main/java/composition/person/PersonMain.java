package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Minta Áron", "012345XX");
        Address address = new Address("HU", "Érd", "Kutyavári utca 40.", "2030");

        System.out.println("ország: " + address.getCountry());
        System.out.println("város: " + address.getCity());
        System.out.println("utca, házszám: " + address.getStreetAndNumber());
        System.out.println("irányítószám: " + address.getZipCode());
        System.out.println(person.personToString());
        System.out.println();

        person.correctData("Gipsz Jakab", person.getIdentificationCard());
        address.correctData("HU", "Budapest", "Kossuth Lajos tér 1-3.", "1055");
        person.moveTo(address);

        System.out.println("név: " + person.getName());
        System.out.println("személyi igazolvány szám: " + person.getIdentificationCard());
        System.out.println("cím: " + person.getAddress().addressToString());
    }
}
