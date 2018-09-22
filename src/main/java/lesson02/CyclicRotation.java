package lesson02;

public class CyclicRotation {

    public int[] solution(int[] xs, int k) {
        if (xs.length == 0) return xs;
        if ((k %= xs.length) == 0) return xs;

        reverse(xs, 0, xs.length);
        reverse(xs, 0, k);
        reverse(xs, k, xs.length);

        return xs;
    }

    private void reverse(int[] ref, int from, int to) {
        for (int i = from, j = to - 1; i < j; i++, j--) {
            swap(ref, i, j);
        }
    }

    private void swap(int[] ref, int i, int j) {
        int tmp = ref[i];
        ref[i] = ref[j];
        ref[j] = tmp;
    }
}
