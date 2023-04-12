/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:jack
 * Date:2023-04-12
 * Time:10:21
 */
public class TestDemo05 {
    /*public static void main(String[] args) {
        int n = 10;
        //if里面只能是布尔表达式
        if(n % 2 == 0) {
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }

    }*/
    //java里面比较喜欢
    int x = 10;
//if(x == 10){
    //满足条件
    // }else{
    //不满足条件
    //}


    /*  public static void main(String[] args) {*/
       /* int year = 2000;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + "是闰年!");
            } else {
                System.out.println(year + "不是闰年!");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println(year + "是闰年!");
            } else {
                System.out.println(year + "不是闰年!");*/
       /* int year = 7;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + "是闰年");
            } *//*else {
                System.out.println(year + "吧是闰年");
            }*//*
        } else {
            if (year % 4 == 0) {
                System.out.println(year + "是闰年");
            } else {
                System.out.println(year + "不是闰年!");

            }
        }
    }
}
*/
    //求1到10的和
/*    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while(i <=10) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}*/

//求n的阶乘

    /*     public static void main(String[] args) {
           int j = 3;
           int ret = 0;
           int sum = 1;
           int i = 1;
           while(i<=j) {

           sum *=i;
           i++;
           }
           System.out.println(sum);

           }
   }
   */
/* public static void main(String[] args) {
     int num = 100;
     while (num <= 200) {
         if (num % 3 == 0) {
             System.out.println("找到了 3 的倍数, 为:" + num);
             break;
         }
         num++;
     }
 }}*/
// 执行结果
    //找到了 3 的倍数, 为:102
//求1到100之间的和

    //打印1-10
    public static void main(String[] args) {
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num <= 10);
    }
}





