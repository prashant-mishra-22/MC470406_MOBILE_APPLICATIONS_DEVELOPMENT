//write a program to create multiple threads using Runnable interface



class MyThread implements Runnable{
	Thread t;

	public MyThread(){
		t= new Thread(this,"Demo");
		//System.out.println("Child Thread : "+t);
		t.start();
	}
	public MyThread(String d){
		t= new Thread(this,d);
		//System.out.println("Child Thread : "+t);
		t.start();
	}
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println("Thread Name: "+Thread.currentThread().getName());
				Thread.sleep(100);
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}


public class Q3{
	public static void main(String[] args){
		MyThread obj=new MyThread();
		MyThread t1 = new MyThread("IOT");
		MyThread t2 = new MyThread("DS");
		MyThread t3 = new MyThread("BE");
		try{
			for(int i=5;i>0;i--){
				System.out.println("Thread Name: "+Thread.currentThread().getName());
				Thread.sleep(100);
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}