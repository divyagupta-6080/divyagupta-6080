package com.mph;

public class Calculate {

	/*public int add(int... number) {
		int result=0;
		for(int i : number)
		{
			result += i;
		}
		
		return result;
	}
	
	public int sum(int a , int b) {
		return a+b;
	}*/
	public int multiply(int... number) {
		int result=1;
		for(int i : number)
		{
			try {
				Thread.sleep(500);
				result *= i;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return result;
	}
	public static void main(String[] args) {
		Calculate c = new Calculate();
		////System.out.println(c.add(12,12));
		//System.out.println(c.add(10,20));
		//System.out.println(c.add(1,2,3,4));
		System.out.println(c.multiply(2,5,4));
	}

}
