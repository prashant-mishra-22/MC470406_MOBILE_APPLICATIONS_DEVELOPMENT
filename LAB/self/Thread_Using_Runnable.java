// thread using runnable

//start()
//run()
//sleep()

class MyThread implements Runnable{
	Thread t;
	public MyThread(){
		t= new Thread(this,"Demo");
		System.out.println("Child Thread : "+t);
		t.start();
	}
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println("Child Thread : "+i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
			System.out.println("Exiting Child Thread ");
		}
	}
}

public class Thread_Using_Runnable{
	public static void main(String args[]){
		new MyThread();
		try{
			for(int i=5;i>0;i--){
				System.out.println("Main Thread : "+i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}
}

			