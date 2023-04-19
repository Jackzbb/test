/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:jack
 * Date:2023-04-19
 * Time:20:27
 */
class person {
    public String name;
    public String age;
    public void eat(){
        System.out.println(name+ "正在吃饭！");
    }
    public void show(){
        System.out.println("姓名:"+name+"年龄:"+age);
    }
}
public class Test22 {
    public static void main(String[] args) {
        person person1= new person();
        person1.name = "张三  ";
        person1.age = "10";
        System.out.println(person1.name);
        System.out.println(person1.age);
        person1.show();
        System.out.println("=============");
        person person2 = new person();
        person2.name = "里斯  ";
        person2.age = "110";
        System.out.println(person2.name );
        System.out.println(person2.age );
        person2 .show();

    }

}

