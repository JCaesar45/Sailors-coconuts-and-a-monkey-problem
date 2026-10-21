public final class SplitCoconuts {
    private SplitCoconuts() {}

    public static long solve(int n) {
        if (n < 1) throw new IllegalArgumentException("n must be positive");
        long base = 1L;
        for (int i = 0; i < n; i++) {
            base = Math.multiplyExact(base, n);
        }
        if ((n & 1) == 1) {
            return base - (n - 1);
        }
        return Math.multiplyExact((long)(n - 1), base - 1);
    }

    public static boolean verify(long start, int n) {
        long pile = start;
        for (int i = 0; i < n; i++) {
            if ((pile - 1) % n != 0) return false;
            pile = pile - 1 - (pile - 1) / n;
        }
        return pile % n == 0;
    }

    public static void main(String[] args) {
        for (int k = 1; k <= 10; k++) {
            long a = solve(k);
            System.out.println(k + " -> " + a + "  verified=" + verify(a, k));
        }
    }
}
