package exampleHashtables;

public class MainSimpleHashtable {
    public static void main(String[] args) {

        HashEmployee janeJones = new HashEmployee("Jane", "Jones", 123);
        HashEmployee johnDoe = new HashEmployee("John", "Doe", 4567);
        HashEmployee marySmith = new HashEmployee("Mary", "Smith", 22);
        HashEmployee mikeWilson = new HashEmployee("Mike", "Wilson", 3245);
        HashEmployee billEnd = new HashEmployee("Bill", "End", 78);

        SimpleHashtable ht = new SimpleHashtable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);

        ht.printHashtable();

        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
        System.out.println("Retrieve key Mary: " + ht.get("Smith"));

        ht.remove("Wilson");
        ht.remove("Jones");
        ht.printHashtable();

        System.out.println("Retrieve key Mary: " + ht.get("Smith"));

    }
}
