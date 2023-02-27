package exampleHashtables;

import exampleStack.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainJdkHashmap {
    public static void main(String[] args) {
        JdkEmployee janeJones = new JdkEmployee("Jane", "Jones", 123);
        JdkEmployee johnDoe = new JdkEmployee("John", "Doe", 4567);
        JdkEmployee marySmith = new JdkEmployee("Mary", "Smith", 22);
        JdkEmployee mikeWilson = new JdkEmployee("Mike", "Wilson", 3245);

        Map<String, JdkEmployee> hashMap = new HashMap<>();
        hashMap.put("jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);

//        Iterator<JdkEmployee> iterator = hashmap.values().iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.hasNext());

        hashMap.forEach((k, v) -> System.out.println("Key = " + k + ", Employee = " + v));
        }
    }

