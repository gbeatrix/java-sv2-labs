package formatlocaleprintf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Run {
    private List<Double> kms;
    private String name;

    public Run(String name) {
        this.kms = new ArrayList<>();
        this.name = name;
    }

    public void addRun(double km){
        kms.add(km);
    }

    public String printFormattedRunText(){
        Date date = new Date();
        if(kms.isEmpty()) {
            return String.format("Kedves %s! A mai dátum: %tF. Ezen a héten még nem futottál. Igyekezz jobban!", name, date);
        } else {
            return String.format("Kedves %s! A mai dátum: %tF. Ezen a héten ez a(z) %d. futásod. Most %.1f km-t futottál. Csak így tovább!", name, date, kms.size(), kms.get(kms.size() - 1));
        }
    }

    public static void main(String[] args) {
        Run run = new Run("Kiss Béla");
        System.out.println(run.printFormattedRunText());
        run.addRun(3);
        System.out.println(run.printFormattedRunText());
        run.addRun(6.76);
        System.out.println(run.printFormattedRunText());
        run.addRun(9.82);
        System.out.println(run.printFormattedRunText());
        run.addRun(12.8);
        System.out.println(run.printFormattedRunText());
    }
}
