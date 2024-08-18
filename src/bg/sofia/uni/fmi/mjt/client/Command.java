package bg.sofia.uni.fmi.mjt.client;

import static bg.sofia.uni.fmi.mjt.client.CommandType.*;

public class Command {
    public static CommandType parse(String command) {
        if (command == null || command.isBlank()) {
            //or throw illegalArgumentException
            return UNKNOWN;
        }

        command = command.trim();

        if (command.startsWith(DISCONNECT.getText())) {
            return DISCONNECT;
        }

        if (command.startsWith(GET_FOOD_BY_BARCODE.getText())) {
            return GET_FOOD_BY_BARCODE;
        } else if (command.startsWith(GET_FOOD_REPORT_BY_FCD_ID.getText())) {
            return GET_FOOD_REPORT_BY_FCD_ID;
        } else if (command.startsWith(GET_FOOD_BY_NAME.getText())) {
            return GET_FOOD_BY_NAME;
        }

        return UNKNOWN;
    }

    private Command() {
        // don't want instances of this class
    }
}
