package lesson01;

public class BinaryGap {

    public int solution(int n) {
        String bits = Integer.toBinaryString(n);
        int max = 0;
        int cur = 0;

        for (char bit : bits.toCharArray()) {
            switch (bit) {
                case '0':
                    cur += 1;
                    break;
                case '1':
                    if (cur > max) {
                        max = cur;
                    }
                    cur = 0;
                    break;
            }
        }

        return max;
    }
}
