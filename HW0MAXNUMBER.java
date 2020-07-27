package com.company;

public class HW0MAXNUMBER {

    public static int maxer(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
    public static int max(int[] m) {
        int m_length = m.length;
        for (int i = 0; i < m_length-1; i++) {
            m[i + 1] = maxer(m[i], m[i+1]);
        }
        return m[m_length-1];
    }


    public static void main(String[] args) {

        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.print(max(numbers));
    }
}
