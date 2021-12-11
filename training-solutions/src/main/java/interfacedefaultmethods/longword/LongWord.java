package interfacedefaultmethods.longword;

import java.nio.file.Paths;
import java.util.List;

public class LongWord implements FileOperations {
    @Override
    public String getLongWord() {
        StringBuilder sb = new StringBuilder();
        List<String> contents = readFromFile(Paths.get("src/test/resources/longword.txt"));
        for (String line : contents) {
            sb.append(line.charAt(0));
        }
        sb.append(contents.get(contents.size() - 1).substring(1));
        return sb.toString();
    }
}
