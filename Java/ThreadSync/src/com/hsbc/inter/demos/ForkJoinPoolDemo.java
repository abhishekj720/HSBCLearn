package com.hsbc.inter.demos;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyTask task = new MyTask(1, 250);
		ForkJoinPool pool = new ForkJoinPool();
		Integer retTask = pool.invoke(task);
		
        System.out.println(retTask);
        int n=250;
        System.out.println(n*(n+1)/2);
	}

}

class MyTask extends RecursiveTask<Integer>{
     private int endIndex;
     private int startIndex;
     public static int res;
     
	 public MyTask(int startIndex, int endIndex) {
		super();
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}


	@Override
	protected Integer compute() {
		int sum =0;
		int threshold=99;
		int length= endIndex - startIndex;
		
		if(length <= threshold) {
			if (startIndex+threshold > endIndex)
				for(int i=startIndex;i<=endIndex; ++i)
					sum += i;
			else
				for(int i=startIndex;i<=startIndex+threshold; ++i)
					sum += i;
			System.out.println("a " + sum);
			
			return sum;
		}else {
		MyTask task1 = new MyTask(1,100);
		task1.fork();	
		MyTask task2 = new MyTask(101,200);	
		task2.fork();
		MyTask task3 = new MyTask(201,250);	
		task3.fork();
		res =  task1.join()+ task2.join() + task3.join();;
		
		return res;
		}
	}
	
}