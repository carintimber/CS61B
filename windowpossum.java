package com.company;

public class windowpossum {

    public static void windowPosSum(int[] a, int n) {

        int len = a.length;
        for (int i = 0; i < len; i++) {
            if (a[i] < 0) {
                continue;
            }
            else if (i + n > len - 1 ) {
                int m = len - i - 1;
                int num = 0;
                for (int j = 0; j <= m; j++) {
                    num = num + a[i+j];
                }
                a[i] = num;
            }
            else {
                int num = 0;
                for (int j = 0; j <= n; j++) {
                    num = num + a[i+j];
               }
                a[i] = num;
            }
        }
    }

    public static void main(String[] args) {

        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }

}
