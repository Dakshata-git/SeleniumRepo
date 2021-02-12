package SeleniumPackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkListClass {
    public static void main(String[] args) {
        List<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        Iterator itr = a.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        a.remove(2);

        Iterator itr1 = a.iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }

    }
}
