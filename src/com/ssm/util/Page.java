package com.ssm.util;

public class Page {
	int start=0;
	int last=0;
	int count=5;
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getLast() {
		return last;
	}
	public void setLast(int last) {
		this.last = last;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
//	求最后一页的第一项的位置
	public void calcuteLast(int total){
		if(0 == total % count){
			last=total-count;
		}else{
			last = total - total % count;
		}
	}
}
