package dailyChallenges;

import exampleHashtables.ChainedHashtable;

import java.util.*;

public class HashChallengeMain {

    public static void main(String[] args) {

            LinkedList<ChallengeEmployeeHash> employees = new LinkedList<>();
            employees.add(new ChallengeEmployeeHash("Jane", "Jones", 123));
            employees.add(new ChallengeEmployeeHash("John", "Doe", 5678));
            employees.add(new ChallengeEmployeeHash("Mike", "Wilson", 45));
            employees.add(new ChallengeEmployeeHash("Mary", "Smith", 5555));
            employees.add(new ChallengeEmployeeHash("John", "Doe", 5678));
            employees.add(new ChallengeEmployeeHash("Bill", "End", 3948));
            employees.add(new ChallengeEmployeeHash("Jane", "Jones", 123));

            employees.forEach(e -> System.out.println(e));

        HashMap<Integer, ChallengeEmployeeHash> employeeTable = new HashMap<>();
        ListIterator<ChallengeEmployeeHash> iterator = employees.listIterator();
        List<ChallengeEmployeeHash> remove = new ArrayList<>();

        while (iterator.hasNext()){
            ChallengeEmployeeHash challengeEmployeeHash = iterator.next();
            if (employeeTable.containsKey(challengeEmployeeHash.getId())){
                remove.add(challengeEmployeeHash);
            }
            else{
                employeeTable.put(challengeEmployeeHash.getId(), challengeEmployeeHash);
            }
        }

        for (ChallengeEmployeeHash challengeEmployeeHash: remove){
            employees.remove(challengeEmployeeHash);
        }

        System.out.println("------------------");
        employees.forEach(e -> System.out.println(e));



//        int[] nums = new int[10];
//        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
//        for (int i = 0; i < numsToAdd.length; i++) {
//            nums[hash(numsToAdd[i])] = numsToAdd[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
        }

        public static int hash(int value) {
            return Math.abs(value % 10);
        }
    }
