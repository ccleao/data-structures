package examplesLists;

import javax.xml.stream.events.EndDocument;

public class doublyLinkedList {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        EmployeeLinkedList list = new EmployeeLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        list.printList();

        list.addBefore(billEnd, johnDoe);
        list.printList();

//        list.printList();
//        System.out.println(list.getSize());
//
//        Employee billEnd = new Employee("Bill", "End", 78);
//
//        list.addToEnd(billEnd);
//        list.printList();
//        System.out.println(list.getSize());
//
//        list.removeFromFront();
//        list.printList();
//        System.out.println(list.getSize());
//
//        list.removedFromEnd();
//        list.printList();
//        System.out.println(list.getSize());
    }
}
