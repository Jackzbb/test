/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:jack
 * Date:2023-03-28
 * Time:14:10
 */
public class TestDemo8 {
    public static void main(String[] args) {
        System.out.println("hello");
        for (int i = 0; i < 10; i++) {
            System.out.println("ab,lm56cs");

        }

        long v = 15;
        int a = 10000;
        int b = 10000;
        int c = 10000;
        long m = 2;//8个字节位 64个比特位 不论在什么系统中都占用8个字节
        char i = 3;
        double z = 1.5;
        float s = 2;
        short k = 3276;//两个字节 16个比特位 不能赋值给负数
        int d = 100;
        byte w = 8;//8个比特位，最大值取-128到127
        //段落注释方放ctrl+short+/       单行注释ctrl+/
        System.out.println(w);


        System.out.println(d);
        System.out.println(Integer.MAX_VALUE );//Integer是int的强化版本
        System.out.println(Integer.MIN_VALUE - 1);
        System.out.println(a + b + c + m + i + z + s + k);
    }
}
