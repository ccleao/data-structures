package exampleHashtables;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashtable(){
        hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++){
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, HashEmployee hashEmployee){
        int hashedKey = hashkey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, hashEmployee));
    }

    public HashEmployee get(String key){
        int hashedKey = hashkey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        while (iterator.hasNext()){
            storedEmployee = iterator.next();
            if (storedEmployee.key.equals(key)){
                return storedEmployee.hashEmployee;
            }
        }
        return null;
    }
    public HashEmployee remove(String key) {
        int hashedKey = hashkey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        int index = -1;
        while (iterator.hasNext()) {
            storedEmployee = iterator.next();
            index++;
            if (storedEmployee.key.equals(key)) {
                break;
            }
        }
        if (storedEmployee == null)
            return null;
        else {
            hashtable[hashedKey].remove(index);
            return storedEmployee.hashEmployee;
        }
    }
    private int hashkey(String key){
//        return key.length() % hashtable.length;
        return Math.abs(key.hashCode() % hashtable.length);
    }
    public void printHashtable(){
        for (int i = 0; i < hashtable.length; i++){
            if (hashtable[i].isEmpty()){
                System.out.println("Position " + i + ": empty");
            }
            else {
                System.out.print("Position " + i + ": ");
                ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
                while (iterator.hasNext()){
                    System.out.print(iterator.next().hashEmployee);
                    System.out.print(" --> ");
                }
                System.out.println("null");
            }
        }

    }
}
