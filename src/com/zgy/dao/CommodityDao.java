package com.zgy.dao;

import java.util.ArrayList;
import java.util.List;

import com.zgy.pojo.Commodity;

public class CommodityDao {
	public  void read(Integer start, Integer end,Integer BUFF_LEN) {
		List<Commodity> list = new ArrayList<Commodity>();//总商品信息
		for (int i = 0; i < 3000; i++) {
			list.add(new Commodity(i, "张三"+i));
		}
		List<Commodity> lists = new ArrayList<Commodity>();//每次读取的50个商品
		for (int i = start; i < end; i++) {
			if(end-start==BUFF_LEN){
				lists.add(list.get(i));
			}
			
		}
		System.out.println(lists.toString());
	}
}
