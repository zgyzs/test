package com.zgy.thread;

import com.zgy.dao.CommodityDao;

public class Commoditythread extends Thread{
	//每个线程读取的数量
	private final int BUFF_LEN = 50;    
	  //定义读取的起始点    
    private Integer start;    
    //定义读取的结束点    
    private Integer end;   
	
	public Commoditythread(Integer start, Integer end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		CommodityDao co = new CommodityDao();
		co.read(start, end, BUFF_LEN);
	}
	public static void main(String[] args) {
		Commoditythread ct = new Commoditythread(0, 50);
		Commoditythread ct1 = new Commoditythread(50,100);
		Commoditythread ct2 = new Commoditythread(100,150);
		Commoditythread ct3 = new Commoditythread(150,200);
		Commoditythread ct4 = new Commoditythread(200,250);
		Commoditythread ct5 = new Commoditythread(250,300);
		ct.start();
		ct1.start();
		ct2.start();
		ct3.start();
		ct4.start();
		ct5.start();
	}
}
