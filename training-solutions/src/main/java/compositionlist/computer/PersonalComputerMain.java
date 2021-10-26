package compositionlist.computer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer(new Cpu("Intel Core i3-10100F", 3.6));
        pc.addHardware(new Hardware("alaplap", "ASUS PRIME H410M-R"));
        pc.addHardware(new Hardware("meghajtó", "120GB Kingston SSD SATA3 2,5\" A400"));
        pc.addHardware(new Hardware("számítógépház", "Zalman S2 táp nélküli ablakos ház fekete"));
        pc.addHardware(new Hardware("tápegység", "Cooler Master 500W Elite V3 Series"));
        pc.addHardware(new Hardware("videókártya", "ASUS GeForce GT1030 2GB"));
        pc.addHardware(new Hardware("memória", "8GB 2666MHz DDR4 RAM Crucial CL19"));
        Software os = new Software("Debian GNU/Linux", 10.11);
        os.setNumberOfVersion(11.1);
        pc.addSoftware(os);
        pc.addSoftware(new Software("Oracle Java SE JDK", 17));
        pc.addSoftware(new Software("Maven", 3.8));
        pc.addSoftware(new Software("IntelliJ IDEA (Community Edition)", 2021.2));
        pc.addSoftware(new Software("Slack", 4.20));
        pc.addSoftware(new Software("Microsoft Teams", 1.4));

        System.out.println(pc);
        System.out.println(os);
        System.out.println(new Hardware("nyomtató", "Xerox B205"));
        System.out.println(pc.getCpu());
        System.out.println(pc.getHardwares());
        System.out.println(pc.getSoftwares());
    }
}
