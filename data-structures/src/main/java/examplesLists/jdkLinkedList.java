package examplesLists;

import java.util.Iterator;
import java.util.LinkedList;

public class jdkLinkedList {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4527);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        for (Employee employee : list) {
            System.out.println(employee);
            System.out.println(" ");
        }

        list.add(billEnd);
        for (Employee employee : list) {
            System.out.println(employee);
        }
//        for (Employee employee: list){
//            System.out.println(employee);
//        }
    }
}
