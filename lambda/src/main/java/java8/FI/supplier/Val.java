package java8.FI.supplier;

public class Val {
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Val(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Val{" +
                "value='" + value + '\'' +
                '}';
    }
}
