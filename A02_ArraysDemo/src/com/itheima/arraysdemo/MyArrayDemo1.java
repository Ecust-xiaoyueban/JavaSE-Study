package com.itheima.arraysdemo;
import java.util.Arrays;
public class MyArrayDemo1 {
    public static void main(String[] args) {
        /*
        public static String toString(数组)   把数组拼接成一个字符串
        public static int binarySearch(数组，查找的元素)    二分法查找元素
        public static int[] copyOf(原数组，新数组长度)
        public static int[] copyOfRange(原数组，起始索引，结束索引)  拷贝数组
        public static void fill(数组，元素)  填充数组
        public static void sort(数组)     按照默认的方式进行数组排序
        public static void sort(数组,排序规则)    按照指定的规则排序
        */
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr,5));
    }
}
