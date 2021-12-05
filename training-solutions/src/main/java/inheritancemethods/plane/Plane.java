package inheritancemethods.plane;

public class Plane {
    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("Gipsz Jakab", 35000);
        System.out.println(passenger1.getName());
        System.out.println(passenger1.getPriceOfPlaneTicket());

        PriorityPassenger priorityPassenger = new PriorityPassenger("Major Anna", 35000, 100);
        System.out.println(priorityPassenger.getName());
        System.out.println(priorityPassenger.getPriceOfPlaneTicket());
        System.out.println(priorityPassenger.getPercent());

        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("Remek Elek", 35000, 100);
        System.out.println(firstClassPassenger.getName());
        System.out.println(firstClassPassenger.getPriceOfPlaneTicket());
        System.out.println(firstClassPassenger.getPercent());
        System.out.println(firstClassPassenger.getExtraCharge());
    }
}
