import java.util.Arrays;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:jack
 * Date:2023-04-17
 * Time:23:46
 */
public class Test { public static int find(int[] array,int val) {
    for (int i = 0; i < array.length; i++) {
        if(array[i] == val) {
            return i;
        }
    }
    return -1;
}

    public static void main(String[] args) {
        int[] array1 = {1,12,3,14};
        int ret = find(array1,14);
        System.out.println(ret);
    }

    public static void main22(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = array1.clone();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("===========");
        array2[0] = 199;
        System.out.println(Arrays.toString(array1));//1 2 3 4
        System.out.println(Arrays.toString(array2));// 199 2 3 4
    }

    public static void main21(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {1,2,31,4};
        //System.out.println(array1 == array2);
        System.out.println(Arrays.equals(array1,array2));


        int[] array3 = new int[10];
        Arrays.fill(array3,1,3,-1);//[1,3)
        System.out.println(Arrays.toString(array3));


    }
}
