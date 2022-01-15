package collectionsqueue;

import java.util.*;

public class Vaccination {
    public Queue<Integer> getVaccinationOrder(List<Person> people) {
        Queue<Integer> result = new PriorityQueue<>();
        for (Person person : people) {
            int age = person.getAge();
            if (age >= 18 && age <= 65) {
                result.add(age);
            }
        }
        return result;
    }

    public Queue<ComparablePerson> getVaccinationOrder1(List<ComparablePerson> people) {
        Queue<ComparablePerson> result = new PriorityQueue<>();
        for (ComparablePerson person : people) {
            int age = person.getAge();
            if (age >= 18 && age <= 65) {
                result.add(person);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<ComparablePerson> comparablePeople = new LinkedList<>();
        comparablePeople.add(new ComparablePerson("Anna", 43));
        comparablePeople.add(new ComparablePerson("Béla", 23));
        comparablePeople.add(new ComparablePerson("Cecil", 73));
        comparablePeople.add(new ComparablePerson("Dénes", 13));
        comparablePeople.add(new ComparablePerson("Edit", 53));
        comparablePeople.add(new ComparablePerson("Ferenc", 33));
        comparablePeople.add(new ComparablePerson("Géza", 43));
        comparablePeople.add(new ComparablePerson("Hugó", 56));
        comparablePeople.add(new ComparablePerson("Ilona", 46));

        List<Person> people = new LinkedList<>();
        people.addAll(comparablePeople);

        Queue<Integer> vaccinationOrder = new Vaccination().getVaccinationOrder(people);
        System.out.println(vaccinationOrder);
        Iterator<Integer> it = vaccinationOrder.iterator();
        while (it.hasNext())
            System.out.print(it.next()+", ");
        System.out.println();
        while(!vaccinationOrder.isEmpty())
            System.out.print(vaccinationOrder.poll()+", ");
        System.out.println();

        Queue<ComparablePerson> vaccinationOrder1 = new Vaccination().getVaccinationOrder1(comparablePeople);
        System.out.println(vaccinationOrder1);
        Iterator<ComparablePerson> it1 = vaccinationOrder1.iterator();
        while (it1.hasNext())
            System.out.print(it1.next()+", ");
        System.out.println();
        while(!vaccinationOrder1.isEmpty()){
            System.out.print(vaccinationOrder1.poll()+", ");
        }
        System.out.println();
    }
}
