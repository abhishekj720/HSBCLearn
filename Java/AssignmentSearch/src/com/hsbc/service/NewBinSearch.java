package com.hsbc.service;

import java.util.Arrays;

public class NewBinSearch extends NewSearch {
	
	private String a[];
	
	public NewBinSearch(){
		a = null ;
	}
	
	public NewBinSearch(String a[]){
		super();
		this.a = a;
	}

	public boolean search(String a[],String ele) {
		Arrays.sort(a);
		if(Arrays.binarySearch(a, ele)>0) {
			return true;
		}
		
		return false ;
	}
	
	public boolean search2(String a[],String ele) {
		return super.search(a,ele);
	}
	public void display(String d) {
		 
		if(d == "ASC") {
			Arrays.sort(a);
			System.out.print(a );
		}
		else
		{	Arrays.sort(a);
		
			String[] f = a;
			//System.out.println(a);
			for(int i=f.length-1;i>=0;i--) {
				System.out.print(f[i] );
			}
			
		}
	}
	
	public void display2(String a[]) {
		super.display(a);
	}
}
