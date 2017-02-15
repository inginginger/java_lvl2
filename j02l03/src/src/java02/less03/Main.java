package src.java02.less03;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] vocabulary = new String[12];
        vocabulary[0] = "data";
        vocabulary[1] = "type";
        vocabulary[2] = "value";
        vocabulary[3] = "code";
        vocabulary[4] = "type";
        vocabulary[5] = "node";
        vocabulary[6] = "wire";
        vocabulary[7] = "type";
        vocabulary[8] = "register";
        vocabulary[9] = "code";
        vocabulary[10] = "data";
        vocabulary[11] = "data";

        System.out.println(cntWords(vocabulary));

        PhoneBook pb = new PhoneBook();
        pb.addRecord("Johns", "+1-212-501-2244");
        pb.addRecord("Smulders", "+1-646-211-5820");
        pb.addRecord("Zilman", "+1-212-580-29-11");
        pb.addRecord("Johns", "+1-212-319-7382");
        pb.addRecord("Fox", "+1-212-332-5489");
        pb.addRecord("Janson", "+1-646-213-5467");
        pb.getPhonesByName("Fox");
        System.out.println(pb);
    }

    private static Map<String, Long> cntWords(String[] array) {
        Map<String, Long> result = new HashMap<>();
        for (String str : array) {
            if (str != null) {
                long cnt = 0;
                for (String nextStr : array) {
                    if (str.equals(nextStr)) {
                        cnt++;
                    }
                }
                result.put(str, cnt);
            }
        }
        return result;
    }

}