package dailyChallenges;


//Change radix sort to string array and sort.
public class challengeThree {
    public static void main(String[] args) {

        String[] stringArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        radixSort(stringArray, 26, 5);

        for (var j : stringArray) {
            System.out.println(j);
        }
    }

    public static void radixSort(String[] input, int radix, int width) {
        for (int i = width -1; i >= 0; i--) {
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(String[] input, int position, int radix) {

        int numItens = input.length;
        int[] countArray = new int[radix];

        for (String value : input) {
            countArray[getIndex(position, value)]++;
        }
        //Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItens];
        for (int tempIndex = numItens - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getIndex(position, input[tempIndex])]] = input[tempIndex];
        }

        System.arraycopy(temp, 0, input, 0, numItens);

    }
    public static int getIndex (int position, String value){
        return value.charAt(position) - 'a';
    }
}
