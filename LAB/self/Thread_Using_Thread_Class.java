// thread using thread class

class MyThread extends Thread {
	public MyThread(){
		super("Demo Thread ");
		start();
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
		}
	}
}

public class Thread_Using_Thread_Class{
	public static void main(String[] args){
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

		
