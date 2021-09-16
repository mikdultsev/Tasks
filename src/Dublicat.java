

import java.util.*;

public class Dublicat {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<String>();
        lst.add("one");
        lst.add("one");
        lst.add("two");
        lst.add("three");
        lst.add("three");
        lst.add("three");
        Set<String> a = new HashSet<String>();
        a.addAll(lst);
        lst.clear();
        lst.addAll(a);
        System.out.println("Modified array is" + lst);
    }
}