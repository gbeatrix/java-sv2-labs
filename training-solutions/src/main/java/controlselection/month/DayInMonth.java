package controlselection.month;

public class DayInMonth {
    public int numberOfDays(int year, String month){
        switch(month.toLowerCase()){
            case "április", "június", "szeptember", "november":
                return 30;
            case "január", "március", "május", "július", "augusztus", "október", "december":
                return 31;
            case "február":
                if(year%4==0 && (year%100!=0 || year%400==0)){
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }
}
