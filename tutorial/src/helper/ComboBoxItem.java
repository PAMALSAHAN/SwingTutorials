package helper;

public class ComboBoxItem {
    int key;
    String value;

    public ComboBoxItem(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString(){
        return value;
    }
}
