import java.util.Arrays;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:jack
 * Date:2023-04-17
 * Time:21:32
 */
public class Test7 {public static void main(String[] args) {
    int[][] array = new int[2][];
        /*array[0] = new int[2];
        array[1] = new int[4];*/
    array[0] = new int[]{11,22,33,44};
    array[1] = new int[]{111,221,331,441,999,888,777};
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            System.out.print(array[i][j]+" ");
        }
        System.out.println();
    }
        /*System.out.println(array3[0]);
        System.out.println(array3[1]);*/
}

    public static void main6(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("=============");
        for (int[] ret : array) {
            for (int x : ret) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println("=============");
        System.out.println(Arrays.deepToString(array));
        /*System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));*/
    }

    public static void main5(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("=============");
        int[][] array2 = new int[][]{{1,2,3},{4,5,6}};

    }
    public static void func(int[] array) {
        int left = 0;
        int right = array.length-1;
        while (left < right) {
            while (left < right && array[left]%2 != 0) {
                left++;
            }
            while (left < right &&  array[right]%2 == 0) {
                right--;
            }
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
        }
    }

    public static int binarySearch(int[] array,int key) {
        int left = 0;
        int right = array.length-1;
        while (left <= right) {
            int mid = (left+right) / 2;
            if(array[mid] < key) {
                left = mid+1;
            }else if(array[mid] > key) {
                right = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void bubbleSort1(int[] array) {
        //此时最外层控制的就是趟数
        for (int i = 0; i < array.length-1; i++) {
            //-i 每一次比上一次上一个比较
            boolean flg = false;
            for (int j = 0; j < array.length-1-i; j++) {// 0 < 4
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg == false) {
                return;
            }
        }
    }

    public static void bubbleSort(int[] array) {
        //此时最外层控制的就是趟数
        for (int i = 0; i < array.length-1; i++) {
            //-i 每一次比上一次上一个比较
            for (int j = 0; j < array.length-1; j++) {// 0 < 4
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static int[] findTarget(int[] array,int target) {
        int[] ret = {-1,-1};
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] + array[j] == target) {
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return ret;
    }

    public static int findNum(int[] array) {
        int ret = array[0];
        for (int i = 1; i < array.length; i++) {
            ret ^= array[i];
        }
        return ret;
    }


    public static int findMoreNum(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }

    public static int findMoreNum2(int[] array) {
        int count = 0;
        int tmp = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] == tmp) {
                count++;
            }else if(array[i] != tmp) {
                count--;
            }
            if(count == 0) {
                tmp = array[i];
                count++;
            }
        }
        return tmp;
    }

    public static boolean func3(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                count++;
                if(count == 3) {
                    return true;
                }
            }else {
                count = 0;
            }
        }
        return false;
    }

    public static void swap(int[] array,int i,int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length-1;
        while (left < right) {
            swap(array,left,right);
            left++;
            right--;
        }
    }

    public static void main4(String[] args) {
        int[] array = {6,5,5,1};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void main3(String[] args) {
        int[] array = {10,3,3,5,10};//1+2+3 = 6   3+1+2 = 6
        int ret = findNum(array);
        System.out.println(ret);
    }

    public static void main2(String[] args) {
        int[] array = new int[10_0000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        long start = System.currentTimeMillis();
        bubbleSort(array);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    public static void main1(String[] args) {
        int[] array = {2,4,16,18,10};
        bubbleSort(array);//2  4  10  16  18
        System.out.println(Arrays.binarySearch(array, 18));
        //System.out.println(binarySearch(array, 18));
    }
}
