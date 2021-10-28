package enumtype.university;

public enum University {
    ELTE("Eötvös Loránd Tudományegyetem"),
    BME("Budapesti Műszaki és Gazdaságtudományi Egyetem"),
    DE("Debreceni Egyetem"),
    PPKE("Pázmány Péter Katolikus Egyetem"),
    SZTE("Szegedi Tudományegyetem"),
    SE("Semmelweis Egyetem");

    private String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
