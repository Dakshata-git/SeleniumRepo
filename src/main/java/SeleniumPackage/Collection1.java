package SeleniumPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection1 {

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();

        a.add("Avela");
        a.add("Nic");
        a.add("Tebogo");
        a.add("kera");
        a.add("Pardon");


        Iterator itr = a.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}
