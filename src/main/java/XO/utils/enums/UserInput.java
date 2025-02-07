package XO.utils.enums;

public enum UserInput {
    USER_INPUT_1("1"),
    USER_INPUT_2("2"),
    USER_INPUT_3("3"),
    USER_INPUT_4("4"),
    USER_INPUT_5("5"),
    USER_INPUT_6("6"),
    USER_INPUT_7("7"),
    USER_INPUT_8("8"),
    USER_INPUT_9("9"),
    USER_INPUT_0("0");

    public String getUserInputValue() {
        return userInputValue;
    }

    final String userInputValue;

    UserInput(String userInputValue) {
        this.userInputValue = userInputValue;
    }
}
