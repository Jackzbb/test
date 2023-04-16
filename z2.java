/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:jack
 * Date:2023-04-16
 * Time:22:53
 */
public class z2 {/*public static void main1(String[] args) {
    int[] arr = {3, 2, 6, 1, 7};
    //找出一个int数组中最大值的索引下标
    int maxIndex = 0;//用来接收最大值的下标的
    *//**
     * i=0 0<4 true arr[0] <arr[0] false i++
     * i=1 1<4 true arr[0] <arr[1] false i++ maxIndex=0
     * i=2 2<4 true arr[0]<arr[2] true maxIndex=2 i+=
     * i=3 3<4 true arr[2]<arr[3] false maxIndex=2 i++
     * i=4 4<4 false 循环结束
     *
     *//*
    for (int i = 0; i < arr.length; i++) {
        if (arr[maxIndex] < arr[i]) {
            maxIndex = i;
        }
    }
    System.out.println(maxIndex);
}
}*/
    /*public static void main(String[] args) {
        minIndexOfArrays();
    }
    public static void minIndexOfArrays() {
        int[] arr = {1,2,23,5,6,7,8};
        int minIndex = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        System.out.println(minIndex);
    }
}*/
/*
public static void main(String[] args){
    //1.创建一个数组
    int[] array=new int[50];
    //2.将1-100之间的偶数存入数组内
    for(int i=0;i<array.length;i++){
        array[i]=2*i+2;
    }
    //3.输出验证看一看
    for(int v:array){
        System.out.println(v);
    }
}
}*/
/*public static void main(String[] args){
    //1.创建一个数组
    int[] array=new int[50];
    //2.将1-100之间的偶数存入数组内
    for(int i=0;i<array.length;i++){
        array[i]=2*i+2;
        System.out.println(array[i]);
    }
}
}*/
/*public static int search(int[] array,int key) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == key) {
            return i;
        }
    }
    return -1;  //返回值 因为数组下标没有负数
}
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int index = search(array,4);   //（array,数字）输入你想找的数字的下标
        if (index == -1) {
            System.out.println("没有你要找的关键字！");
        }else {
            System.out.println("找到了你要的关键字，下标是："+index);
        }
    }}*/
public static void main(String[] args) {
    int[] array = {12, 24, 3, 8, 6};
    for (int i = 0; i < array.length - 1; i++) {
        boolean flg = false;    //布尔型（boolean）它的取值只能是常量true或者false
        for (int j = 0; j < array.length - 1 - i; j++) {
            if (array[j] > array[j + 1]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                flg = true; //打个比方 2 1 3 4 5 最开始flg=false 2大于1进行了一次交换之后
            }             //flg=true  之后2不大于3  不再进行交换
        }
        if (flg == false) {
            break;
        }
    }
    System.out.println("从小到大排序后的结果是: " + Arrays.toString(array));
}
}
