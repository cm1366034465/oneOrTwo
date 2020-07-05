import org.junit.Test;

/**
 * 本类实现迭代法走梯子功能
 */
public class TestStep2_self {
    @Test
    public void test() {
        //165580141  斐波那契数列 int最多存储到72项，第73项已经超出int表示的数据范围了。
        long start = System.currentTimeMillis();
        int loop = loop(40);
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
        return loop(n - 2) + loop(n - 1);
    }
}