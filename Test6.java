/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:jack
 * Date:2023-04-17
 * Time:0:13
 */
public class Test6 {public static void main(String[] args) {
    int[] arr = {3, 2, 6, 1, 7};
    //找出一个int数组中最大值的索引下标
    int maxIndex = 0;//用来接收最大值的下标的
    /**
     * i=0 0<4 true arr[0] <arr[0] false i++
     * i=1 1<4 true arr[0] <arr[1] false i++ maxIndex=0
     * i=2 2<4 true arr[0]<arr[2] true maxIndex=2 i+=
     * i=3 3<4 true arr[2]<arr[3] false maxIndex=2 i++
     * i=4 4<4 false 循环结束
     *
     */
    for (int i = 0; i < arr.length; i++) {
        if (arr[maxIndex] < arr[i]) {
            maxIndex = i;
        }
    }
    System.out.println(maxIndex);
}
}

