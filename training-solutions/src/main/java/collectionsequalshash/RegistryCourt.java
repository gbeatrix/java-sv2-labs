package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {
    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("A Bt", "12321"));
        companies.add(new Company("B Kft", "1233"));
        companies.add(new Company("Cég Kft", "1234"));
        companies.add(new Company("D Zrt", "12345"));
        System.out.println(companies.contains(new Company("Cég Kft", "1234")));
        System.out.println(companies.contains(new Company("B Kft", "1234")));
        System.out.println(companies.contains(new Company("Cég Kft", "12345")));
        System.out.println(companies.contains(new Company("A Bt", "12321")));
        System.out.println(companies.contains(new Company("B Kft", "1233")));
        System.out.println(companies.contains(new Company("D Zrt", "12345")));
    }
}
