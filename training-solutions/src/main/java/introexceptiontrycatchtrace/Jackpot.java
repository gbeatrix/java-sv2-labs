package introexceptiontrycatchtrace;

public class Jackpot {
    public static void main(String[] args) {
        try {
            System.out.println("A mai nyertes: " + new Winner().getWinner() + ". Gratulálunk!");
        }
        catch (NullPointerException err) {
            System.out.println("Ma nem nyert senki.");
        }
    }
}
