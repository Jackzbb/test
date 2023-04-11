/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:jack
 * Date:2023-04-11
 * Time:10:09
 */
public class Test01 {
    public static void main1(String[] args) {//main1意思为解除主函数，方便创建新的主函数；     以下为增量运算符
        System.out.println(10%3);//%为求除出结果余数   输出结果1
        System.out.println(10%-3);//输出结果1
        System.out.println(-10%3);//输出结果-1
        System.out.println(-10%-3);//输出结果-1

    }
    //注意：所有的关系运算符的运算结果都是布尔类型，不是true就是false，不可能是其他值。

    public static void main2(String[] args) {
        int a = 10;
        //int b =a++;b=a;a = a+1;后置++   当++出现在变量后，会先做赋值运算，再自加1
        int b = ++a;//a = a+1;b=a;前置++  当++出现在变量前，会先自加一，在做赋值运算；
        a+=1;//a=a+1;
        System.out.println(a);//输出结果a=11,b=10;
        //注意：所有的关系运算符的运算结果都是布尔类型，不是true就是false，不可能是其他值。
    }

    public static void main3(String[] args) {//以下为增量运算符
        short sh = 12;
        //sh = sh + 2;2为int类型，sh为short类型，不够4个字节，需要进行强转，可能会遭遇数据丢失；
        sh +=2;
        System.out.println(sh);//输出结果14
    }
    //自增自减运算
    public static void main4(String[] args) {

        int a =1;
        int b =2;
        System.out.println(a ==1 && b ==2);//&&,短路与，两边都是ture,结果才是ture
        System.out.println(a ==116515  || b ==2);//||，短路或，又一边是ture,结果就是ture
    }//总结\n使用短路与 && 的时候，当左边的表达式为false的时候，右边的表达式不执行\n使用短路或 || 的时候当左边的表达式结果是true的时候，
     // 右边的表达式不执行\n注意：逻辑运算符两边要求都是布尔类型，并且最终的运算结果也是布尔类型。

    public static void main5(String[] args) {

        int m = 10;
        //m += 10; 类似于 m = m + 1;------->注意是类似！！！！

        // 实际不同：
       // i = i + 10; 和 i += 10;一样吗？
        byte i = 10;

        i += 10;//----->没报错
        //其实 x += 1 等同于：x = (byte)(x + 1);

       // i = i + 10;---->错误: 不兼容的类型: 从int转换到byte可能会有损失
        //编译器检测到x + 1是int类型，int类型不可以直接赋值给byte类型的变量x！
       // 详见Java类型转换的时候需要遵循的规则第六点

        i += 190; // i = (byte)(i + 190);
        System.out.println(i); // 44 （当然会自动损失精度了。）


    }

    public static void main6(String[] args) {
        int x = 10;
        int y = 11;
        System.out.println(x < y | x > y++); //teur
        // 通过这个测试得出：x > y++ 这个表达式执行了。
        System.out.println(y); // 12

        //测试短路或||
        int m = 10;
        int n = 11;
        // 使用短路或||的时候，当左边的表达式为true的时候，右边的表达式不执行
        // 这种现象被称为短路。
        System.out.println(m < n || m > n++);
        System.out.println(n); // 11

    }

    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        // 这里的 + 两边都是数字，所以加法运算
        int c = a + b;
        System.out.println(a + "+" + b + " = "  + a + b);//100+200=100200;  作用1：字符串拼接
        System.out.println(a + "+" + b + " = "  + (a + b));//100+200=300;   作用2：求和\n
        System.out.println(c);
        //当 + 运算符两边都是数字类型的时候，求和。\n当 + 运算符两边的“任意一边”是字符串类型，那么这个+会进行字符串拼接操作。
        //遵循“自左向右”的顺序依次执行。（除非额外添加了小括号，小括号的优先级高）




    }





}
