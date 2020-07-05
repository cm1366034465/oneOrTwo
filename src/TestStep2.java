import org.junit.Test;

public class TestStep2 {
    // 项目经理修改内容提交+1
    @Test
    public void test(){
        long start = System.currentTimeMillis();
        System.out.println(loop(71));//165580141  斐波那契数列 int最多存储到71项，第72项已经超出int表示的数据范围了。
        long end = System.currentTimeMillis();
        System.out.println(end-start);//<1ms
    }


    public int loop(int n){
        if(n<1){
            throw new IllegalArgumentException(n + "不能小于1");
        }
        if(n==1 || n==2){
            return n;
        }


        int one = 2;//初始化为走到第二级台阶的走法
        int two = 1;//初始化为走到第一级台阶的走法
        int sum = 0;


        for(int i=3; i<=n; i++){
            //最后跨2步 + 最后跨1步的走法
            sum = two + one;
            two = one;
            one = sum;
        }
        return sum;
    }
}