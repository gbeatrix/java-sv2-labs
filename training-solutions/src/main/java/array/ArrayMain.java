package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] days = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        System.out.println(days[1]);
        System.out.println(days.length);

        int[] exps = new int[5];
        exps[0] = 1;
        for(int i=1; i<exps.length; i++){
            exps[i] = 2*exps[i-1];
        }
        for(int exp : exps){
            System.out.print(exp + " ");
        }
        System.out.println();

        boolean[] alts = new boolean[6];
        alts[0] = false;
        for(int i=1; i<alts.length; i++){
            alts[i] = !alts[i-1];
        }
        for(boolean alt : alts){
            System.out.print(alt + " ");
        }
    }
}
