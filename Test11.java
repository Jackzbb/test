/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:jack
 * Date:2023-04-17
 * Time:0:07
 */
public class Test11 {public static void main(String[] args) {
   /* int[] array = {12, 24, 3, 8, 6};
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
        if (flg == false){
            break;
        }
    }
    System.out.println("从小到大排序后的结果是: "+Arrays.toString(array));
}*/

   /* public static int search(int[] array,int key) {
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
    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length-1;
        int tmp = 0;
        while (left < right) {
            tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] array1 = {12,24,3,8,6};
        System.out.println("逆置之前的数组："+ Arrays.toString(array1));
        reverse(array1);
        System.out.println("逆置之后的数组："+ Arrays.toString(array1));

    }}
