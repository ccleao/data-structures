package dailyChallenges;

//          Insertion Sort replacing for loop with recursion

public class challengeTwo {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        insertionSort(intArray, intArray.length);

        for (int j : intArray) {
            System.out.println(j);
        }
    }

    public static void insertionSort (int[] input, int numItens){
        if (numItens < 2){
            return;
        }
        insertionSort(input, numItens -1);

        int newElement = input[numItens -1];

        int i;

        for (i = numItens -1; i > 0 && input[i - 1] > newElement; i--){
            input[i] = input[i -1];

        }

        input[i] = newElement;
    }
}
