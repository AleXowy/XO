package XO2;

public enum StatusCodes {
FORBIDDEN(403);

    private final int code;

    public int getCode() {
        return code;
    }

    StatusCodes(int code) {
        this.code = code;
    }
}
