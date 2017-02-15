package src.java02.less03;

public class AddRecord {

    private String number;

    public AddRecord(String number) {

        this.number = number;

    }

    public String getNumbers() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number: " + number;
    }

}
