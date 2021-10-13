package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();

        client.setName("Bea");
        client.setYear(1985);
        client.setAddress("Budapest");

        System.out.println("név: " + client.getName());
        System.out.println("szül. év: " + client.getYear());
        System.out.println("cím: " + client.getAddress());

        client.migrate("Tápiószentmárton");
        System.out.println("új cím: " + client.getAddress());
    }
}
