package defaultconstructor.date;

public class SimpleDateFormatter {
    CountryCode countryCode;

    public SimpleDateFormatter() {
        countryCode = CountryCode.HU;
    }

    public String formatDateString(SimpleDate simpleDate) {
        return formatDateStringByCountryCode(countryCode, simpleDate);
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        String formatString = "%d-%d-%d";
        switch (countryCode) {
            case EN:
                return String.format(formatString, simpleDate.getDay(), simpleDate.getMonth(), simpleDate.getYear());
            case HU:
                return String.format(formatString, simpleDate.getYear(), simpleDate.getMonth(), simpleDate.getDay());
            case US:
                return String.format(formatString, simpleDate.getMonth(), simpleDate.getDay(), simpleDate.getYear());
            default:
                return null;
        }
    }
}
