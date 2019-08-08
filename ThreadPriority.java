package thread;

import java.lang.Thread.State;

//Thread.MAX_PRIORITY value is 10
//Thread.MIN_PRIORITY value is 1
//Thread.NORM_PRIORITY value is 5
		
class NewThread2 implements Runnable{
	String name; //name of Thread
	Thread t;
	
	NewThread2(String threadname,int priority){
		name=threadname;
		t = new Thread(this,name);
		System.out.println("New thread:"+t);
	
		t.start();
		t.setPriority(priority);
	}
	
	public void run(){
		try
		{
			for(int i=50;i>0;i--)
			{
			System.out.println(t.getName()+":"+i);
			//Thread.sleep(50);
			}
		}catch(Exception ie)
		{
		System.out.println("Exception:");
		ie.printStackTrace();
		}
		System.out.println(name+" Exiting");
	}
}


public class ThreadPriority {
	
	public static void main(String args[])
	{
	//start the threads

	NewThread2 nt2=new NewThread2("Ganga",Thread.MIN_PRIORITY);
	NewThread2 nt3=new NewThread2("Cauvery",3/*Thread.NORM_PRIORITY*/);
	NewThread2 nt1=new NewThread2("Yamuna",Thread.MAX_PRIORITY);
		
	try
	{
	State st =	nt1.t.getState();
	System.out.println("State of Thread1:"+st.name());
	System.out.println("State of Thread2:"+nt2.t.getState().name());
	System.out.println("State of Thread3:"+nt3.t.getState().name());
	
	
	nt1.t.join();
	nt2.t.join();
	nt3.t.join();
	
	
	//current thread is suspended until nt1, nt2, nt3 Threads complete the execution
	
	}catch(Exception ien)
	{
	System.out.println("main thread Interrupted");
	}
	
	
	System.out.println("Thread One Alive?"+nt1.t.isAlive());
	System.out.println("Thread Two Alive?"+nt2.t.isAlive());
	//System.out.println("Thread Three Alive?"+nt3.t.isAlive());
	
	System.out.println("Main thread has exited");
	
	System.out.println("main thread Exiting");
	}

}

