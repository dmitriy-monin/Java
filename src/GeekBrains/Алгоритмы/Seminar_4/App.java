package GeekBrains.Алгоритмы.Seminar_4;

public class App {
    public static void main(String[] args) {

        MyRBTree myRBTree = new MyRBTree();
        myRBTree.add(10);
        myRBTree.add(15);
        myRBTree.add(1);
        myRBTree.add(500);

        Node node = myRBTree.getRoot();
        System.out.println(node);


//        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
//        myHashMap.put(1, "Value 1");
//        myHashMap.put(2, "Value 2");
//        myHashMap.put(3, "Value 3");
//        myHashMap.put(1, "Value 4");
//
//        boolean removeRes1 = myHashMap.remove(2);
//        boolean removeRes2 = myHashMap.remove(2);
//
//        String res1 = myHashMap.get(3);
//        String res2 = myHashMap.get(2);
//        String res3 = myHashMap.get(243);
    }
}
