// create a thread and run it using runnable

//start()
//run()
//sleep()

class MyThread implements Runnable{
	Thread t;

	public MyThread(){
		t= new Thread(this,"Demo");
		//System.out.println("Child Thread : "+t);
		t.start();
	}

	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println("Thread Name: "+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}

public class Thread_run_using_Runnable{
	public static void main(String args[]){
		try{
			MyThread obj = new MyThread();
			//Thread t=new Thread(obj,"IOT");
			//t.start();
			for(int i=5;i>0;i--){
				System.out.println("Thread Name : "+Thread.currentThread().getName());
				Thread.sleep(100);
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}

			