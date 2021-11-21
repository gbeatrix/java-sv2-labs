package introexceptioncheckedtrace;

import java.io.IOException;

public class Underground {
    public static void main(String[] args) {
        try {
            Operations op = new Operations();
            System.out.println(op.getDailySchedule(op.readFile()));
        }
        catch (IOException err){
            System.out.println(err.getMessage());
        }
    }
}
