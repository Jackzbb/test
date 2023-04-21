/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:jack
 * Date:2023-04-19
 * Time:23:17
 */
//不依赖对象
class Person{

    public String name;
    public int age;

    public static int count;

    public void eat(){
        System.out.println(name+" 正在吃饭");
    }
    public void sleep(){
        System.out.println(name+" 正在睡觉");
    }

}

public class Test23 {
    public static void main(String[] args) {
        Person.count++;
        System.out.println(Person.count);
        System.out.println("================");
        Person.count++;
        System.out.println(Person.count);

    }
}
//通过对象的引用来访问我的方法。
/*
public class Test23 {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 10;
        person.name = "zhangsan";
        System.out.println(person.age);
        System.out.println(person.name);
        person.eat();
        person.sleep();
    }
}*/
