class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        for (; ; ) {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));

            if (slow == fast) {
                break;
            }
        }

        return slow == 1;
    }

    private int sumOfSquares(int n) {
        int squareSum = 0;

        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            squareSum += r * r;
        }

        return squareSum;
    }
}