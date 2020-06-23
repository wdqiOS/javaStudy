// 多维数组
public class ArrayInArrayDemo {
    public static void main(String[] args) {
        /*
        // 静态初始化二维数组
        int[][] arr = new int[][] {
            {1, 2, 3},
            {4, 5},
            {6}
        };
        // 动态初始化
        int[][] arr1 = new int[3][5]; // 创建一个长度为3的二维数组，每一个元素（一维数组）的长度为5
        System.out.println(arr1.length);
        */
       int[][] arr = new int[][] {
            {1, 2, 3},
            {4, 5},
            {6}
        };
        // 二位数组遍历，针对于N维数组需要N层循环
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

        // 杨辉三角例子：
        int lines = 10;
        int[][] arrs = new int[lines][lines];
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {
                if (i == 0) {
                    arrs[i] = new int[]{1};
                } else if(i == 1) {
                    arrs[i] = new int[]{1,1};
                } else {
                    int[] temp = arrs[i-1];
                    int[] tempArr = new int[i+1];
                    for (int k = 0; k < tempArr.length; k++) {
                        if (k == 0 || k == (tempArr.length - 1)) {
                            tempArr[k] = 1;
                        } else {
                            tempArr[k] = temp[k-1] + temp[k];
                        }
                    }
                    arrs[i] = tempArr;
                }

            }
        }
        printArrayInArray(arrs);

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    static void printArrayInArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}