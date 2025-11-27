package ua.opnu.task1;

public class MyOptional<T> {

    private T value;
    private boolean present;

    public MyOptional() {
        this.present = false;
        this.value = null;
    }

    public MyOptional(T value) {
        if (value == null) {
            throw new IllegalArgumentException("MyOptional does not accept null");
        }
        this.value = value;
        this.present = true;
    }

    public boolean isPresent() {
        return present;
    }

    public boolean isEmpty() {
        return !present;
    }

    public T get() {
        if (!present) {
            throw new IllegalStateException("Value is not present");
        }
        return value;
    }

    public T orElse(T defaultValue) {
        if (present) return value;
        return defaultValue;
    }

    @Override
    public String toString() {
        if (present) {
            return "MyOptional[value=" + value + "]";
        } else {
            return "MyOptional[empty]";
        }
    }
}