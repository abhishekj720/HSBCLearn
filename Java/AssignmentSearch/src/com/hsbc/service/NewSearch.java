package com.hsbc.service;

public class NewSearch {
		
	private String a[];
	
	NewSearch(){
		a = null;
	}
	
	NewSearch(String a[]){
		this.a = a;
	}
	
	
	public boolean search(String a[],String ele)
	{
		for(int i=0;i<a.length-1;i++) {
			if(ele.equals(a[i])) {
				return true ;
			}
		}
		return false ;
	}
	
	public void display(String a[]) {
//		System.out.print(a);
		for(int i=0;i<a.length-1;i++) {
			System.out.print(a[i]);
		}
	}
}
