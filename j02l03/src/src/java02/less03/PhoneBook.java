package src.java02.less03;

import java.util.*;

public class PhoneBook {

    private Map<String, ArrayList<AddRecord>> map;

    public PhoneBook() {
        this.map = new TreeMap<>();
    }

    public void addRecord(String name, String phone) {
        ArrayList<AddRecord> phoneRecords = map.get(name);
        if (phoneRecords != null) {
            phoneRecords.add(new AddRecord(phone));
        } else {
            phoneRecords = new ArrayList<>();
            phoneRecords.add(new AddRecord(phone));
            this.map.put(name, phoneRecords);
        }
    }

    public void getPhonesByName(String name) {
        System.out.println(name + "'s phones: ");
        for (AddRecord record : map.get(name)) {
            System.out.println(record.getNumbers());
        }
        System.out.println();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, ArrayList<AddRecord>> entry : map.entrySet()) {
            sb.append(String.format("%s, %d record%s: \n",
                            entry.getKey(),
                            entry.getValue().size(),
                            (entry.getValue().size() == 1) ? "" : "s"));
            for (AddRecord record : entry.getValue()) {
                sb.append(record);
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}