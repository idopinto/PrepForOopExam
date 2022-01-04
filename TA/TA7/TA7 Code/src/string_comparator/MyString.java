package string_comparator;

import java.util.Comparator;

public class MyString {
    String data;

    public MyString(String s){
        data = s;
    }

    public static class LengthComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            if (o1.length()<o2.length())
                return -1;
            if (o1.length()>o2.length())
                return 1;
            return 0;
        }
    }

    public static class LexicComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            // if 01 is strictly first in dictionary order return -1
            // if 01 is strictly last in dictionary order return 1
            return 0;
        }
    }


}
