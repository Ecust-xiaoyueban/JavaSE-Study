package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A02_Iterator {
    public static void main(String[] args) {
        //1、创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        System.out.println(coll);
        //2、获取迭代器对象
        Iterator<String> it = coll.iterator();//迭代器指向集合的0索引处
        while(it.hasNext()){
            //next方法的两件事情：获取当前元素及移动指针
            String str = it.next();
            if("bbb".equals(str)){
                it.remove();
            }
        }
        System.out.println(coll);



    }
}
