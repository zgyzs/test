package com.zgy.pojo;

public class Commodity implements Comparable<Commodity>{
	private Integer id;
	private String name;
	
	public Commodity(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Commodity o) {
		if (this.id>o.id) {
			return 1;
		}else if(this.id<o.id){
			return -1;
		}
		return 0;
	}
	
}
