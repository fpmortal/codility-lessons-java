package lesson02;

public class OddOccurrencesInArray {

    public int solution(int[] xs) {
        int odd = xs[0];

        for (int i = 1; i < xs.length; i++) {
            odd ^= xs[i];
        }

        return odd;
    }
}
