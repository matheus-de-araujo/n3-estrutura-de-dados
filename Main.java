import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[100];

        // Populo o vetor aleatoriamente
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }

        int pair = findThePair(array, 0, -1);

        System.out.println("O par é: " + pair);
    }

    public static int findThePair(int array[], int index, int pair) {

        if (index == array.length) {
            return pair;
        }

        if(array[index]%2 == 0) {
            if(array[index] > pair) {
                pair = array[index];
            }
        }

        pair = findThePair(array, index + 1, pair);

        return pair;
    }
}