package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        Address address = new Address("Budapest", "1154", "Bezerédj Pál utca", 54);
        Details details = new Details("Eladó a XV. kerületben a Bezerédj Pál utcában egy 2 lakásos házban egy 52 nm-es tégla építésű felújított lakás...", address, 52, 380);
        RealEstate realEstate = new RealEstate("Csendes környéken eladó...", 45_000_000, details);

        System.out.println(realEstate);
    }
}
