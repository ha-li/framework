import java.util.*;

/**
 * Created by hlieu on 11/11/16.
 */
public class ListTester {

    public static void testList() {
        List<List> lister = new ArrayList<List>();
        lister.add(lister);

        List innerList = new Vector();
        lister.add(innerList);
    }

    public static void testSet() {
        Set<Set> treeSet = new TreeSet();
        treeSet.add(treeSet);
    }

    public static void testCollection (Collection collection) {
        try {
            collection.add(null);
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testList();
        try {
            testSet();
        }catch (Exception e) {
            e.printStackTrace();
        }

        List testList = new ArrayList();
        Set testSet = new TreeSet();
        testCollection(testList);
        testCollection(testSet);
    }
}
