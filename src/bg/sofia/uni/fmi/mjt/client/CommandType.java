package bg.sofia.uni.fmi.mjt.client;

public enum CommandType {
    GET_FOOD_BY_NAME("get-food"),
    GET_FOOD_REPORT_BY_FCD_ID("get-food-report"),
    GET_FOOD_BY_BARCODE("get-food-by-barcode"),
    DISCONNECT("disconnect"),
    UNKNOWN("unknown");

    private final String text;
    CommandType(String text1) {
        text = text1;
    }

    public String getText() {
        return text;
    }
}
