package util;

/**
 * Created by Adservio on 06/02/2019.
 */
public enum OperationType {

    CREDIT("C"),
    DEBIT("D");

    private String type;

    private OperationType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
