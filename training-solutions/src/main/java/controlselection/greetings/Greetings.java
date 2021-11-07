package controlselection.greetings;

public class Greetings {
    public String greet(int hour, int min){
        int[] limits = { 0, 5*60+1, 9*60+1, 18*60+31, 20*60+1, 24*60 };
        int i = 0;
        while(i<limits.length && (hour*60+min >= limits[i])){
            i++;
        }
        switch(i){
            case 1, 5: return "jó éjt";
            case 2: return "jó reggelt";
            case 3: return "jó napot";
            case 4: return "jó estét";
            default: return null;
        }
    }
}
