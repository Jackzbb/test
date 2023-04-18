/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:jack
 * Date:2023-04-18
 * Time:22:33
 */
class person {
    public String name;
    public String age;

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}

    class WashMachine {
        public String brand; // 品牌
        public String type; // 型号
        public double weight; // 重量
        public double length; // 长
        public double width; // 宽
        public double height; // 高
        public String color; // 颜色

        public void washClothes() { // 洗衣服
            System.out.println("洗衣功能");
        }

        public void dryClothes() { // 脱水
            System.out.println("脱水功能");
        }

        public void setTime() { // 定时
            System.out.println("定时功能");
        }
    }

    class Phone {
        public String brand; // 品牌
        public String type; // 型号
        public double weight; // 重量
        public double length; // 长
        public double width; // 宽
        public double height; // 高
        public String color; // 颜色
        public String screen;//屏幕
        //.............

        public void movie() {
            System.out.println("看电影");
        }

        public void call() {
            System.out.println("打电话");
        }
    }

        class Person {
            public String name;//null
            public int age;

            public void eat() {
                System.out.println("吃饭！");
            }

            public void sleep() {
                System.out.println(name + "睡觉!");//引用. xxxxx
            }


        }

        public class Test21 {
            public static void main(String[] args) {
                Person[] person1 = new Person[3];

            }

            public static void main2(String[] args) {
                String s = null;
                System.out.println(s.length());
                String str = new String("hello");
                String str2 = "hello";
            }

            public static void main3(String[] args) {
                Person person1 = new Person();
                person1.age = 10;
                person1.name = "张三";
                person1.sleep();

                System.out.println(person1.name + " " + person1.age);


                Person person2 = new Person();
                person2.age = 18;
                person2.name = "李四";
                person2.sleep();

                System.out.println(person2.name + " " + person2.age);

                Person person3 = new Person();
                Person person4 = new Person();
                Person person5 = new Person();
                Person person6 = new Person();

            }

            public static void main1(String[] args) {
                //通过关键字 new 实例化一个Phone对象
                Phone phone = new Phone();
                Person person = new Person();
                WashMachine washMachine = new WashMachine();

            }
        }


