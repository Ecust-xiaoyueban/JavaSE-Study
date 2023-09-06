package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class A03_CollectionDemo2 {
    public static void main(String[] args) {
        //增强for遍历
        //for(数据类型，变量名：集合/数组){}
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");
        //利用增强for来遍历
        for(String s:coll){
            System.out.println(s);
        }
        //lambda表达式遍历
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
