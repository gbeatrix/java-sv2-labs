package stringbasic.characters;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérek egy szót: ");
        String word = scanner.nextLine();

        System.out.println("Betűzzed ezt a szót: " + word);
        System.out.println("Minden betű után nyomj entert, az utolsó karakter után kétszer.");
        String nextCh = scanner.nextLine();
        String solution = "";
        for( ; nextCh.length()==1; ){
            solution += nextCh;
            nextCh = scanner.nextLine();
        }
        char[] solutionChars = solution.toCharArray();

        for(char c : solutionChars){
            System.out.print(c+" ");
        }
        System.out.println();

        System.out.println("A tanuló által beírt szó: " + solution);
        System.out.println(word.equals(solution)?"A megoldás helyes!":"Ez most nem sikerült.");
    }
}
