package conventions;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg az autó típusát: ");
        String carType = scanner.nextLine();
        System.out.print("Add meg a motor típusát: ");
        String engineType = scanner.nextLine();
        System.out.print("Add meg az ajtók számát: ");
        int doors = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Add meg a személyek számát: ");
        int persons = scanner.nextInt();
        scanner.nextLine();

        Car car = new Car(carType, engineType, doors, persons);

        System.out.print("Add meg a modell nevét: ");
        String modelName = scanner.nextLine();
        car.addModelName(modelName);

        System.out.println("típus: " + car.getCarType());
        System.out.println("motor: " + car.getEngineType());
        System.out.println("ajtók: " + car.getDoors());
        System.out.println("személyek: " + car.getPersons());

        car.setCarType("Ford T-modell");
        car.setEngineType("négyhengeres");
        car.setDoors(2);
        car.setPersons(2);

        System.out.println();
        System.out.println("típus: " + car.getCarType());
        System.out.println("motor: " + car.getEngineType());
        System.out.println("ajtók: " + car.getDoors());
        System.out.println("személyek: " + car.getPersons());
    }
}
