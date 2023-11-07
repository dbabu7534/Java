import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SubSets {
    static ArrayList<String> sets(String s, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }
        
        ArrayList<String> left = sets(s + up.charAt(0), up.substring(1));
        ArrayList<String> right = sets(s, up.substring(1));
        left.addAll(right);

        return left;
    }

    public static void main(String[] args) {
        String arr = "abc";
        ArrayList<String> result = sets("", arr);
        System.out.println(result);

        OwnSorting(result);
        System.out.println(result);
    }

    private static void OwnSorting(ArrayList<String> result) {

 //       result.removeIf((list)-> list.equals("a"));
        result.removeIf((list)-> list.isEmpty());

        Comparator<Object> com = new Comparator<>() {

            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;

                if (s1.length() > s2.length()) {
                    return 1;
                } else if (s1.length() < s2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort(result,com);
        //return result;
    }


}
