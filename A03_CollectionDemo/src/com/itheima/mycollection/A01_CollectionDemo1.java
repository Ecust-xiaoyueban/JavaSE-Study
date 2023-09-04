package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {
//        多态的方式创建Collection对象
        Collection<String> coll = new ArrayList<>();
        //1、添加元素
        coll.add("aaa");
        System.out.println(coll);
        coll.add("bbb");
        System.out.println(coll);

        //2、清空
        coll.clear();
        System.out.println(coll);

        //3、删除
        coll.add("aaa");
        System.out.println(coll);
        coll.remove("aaa");
        System.out.println(coll);

        System.out.println(coll.isEmpty());
    }
}
