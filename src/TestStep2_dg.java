import org.junit.Test;

public class TestStep2_dg {
    @Test
    public void test() {
        //165580141  斐波那契数列 int最多存储到46项，第47项已经超出int表示的数据范围了。
        long start = System.currentTimeMillis();
        int loop = loopF(46);
        System.out.println("loop = " + loop);
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
    }


    public int loop(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("参数小于1");
        }
        if (n == 1 || n == 2) {
            return n;
        }
        int one = 1;
        int two = 2;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = one + two;
            one = two;
            two = sum;
        }
        return sum;
    }

    public int loopF(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("参数小于1");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int one = 1;
        int two = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = one + two;
            one = two;
            two = sum;
        }
        return sum;
    }
}