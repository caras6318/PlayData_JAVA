package com.kjh;

public class RunnableClass implements RunnableTest{
	int cnt = 0;
	int num = 0;
	boolean timeout = false;
	public RunnableClass() {
		// TODO Auto-generated constructor stub
	}
	public RunnableClass(int cnt){
		this.cnt = cnt;
	}
	
	@Override
	public void run(){
		while(!timeout) {
			try {
			//timeout => false ! => true
				Thread.sleep(3000);
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
			num++;
			if(cnt <= num) {
				timeout = true;
			}
			System.out.print(Thread.currentThread().getName()+ " --- "+num);
		}
	}

}	
