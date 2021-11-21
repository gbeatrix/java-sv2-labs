package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {
    public static void main(String[] args) {
        List<String> z60 = Arrays.asList("Budapest-Keleti", "Kőbánya felső", "Rákos", "Sülysáp", "Szőlősnyaraló", "Tápiószecső", "Szentmártonkáta", "Nagykáta", "Tápiószentmárton", "Farmos", "Tápiószele", "Tápiógyörgye", "Újszász", "Zagyvarékas", "Szolnok");
        try {
            Files.write(Paths.get("roadmap.txt"), z60);
        } catch (IOException err) {
            err.getMessage();
            err.printStackTrace();
        }
    }
}
