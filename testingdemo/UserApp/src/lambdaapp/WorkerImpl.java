package lambdaapp;

public class WorkerImpl {

	public static void executeApp(WorkerInterface worker) {
		
		worker.doSomeWork();
		
		
	}
	public static void main(String[] args) 
	{
		/*executeApp(new WorkerInterface() {
			
			@Override
			public void doSomeWork()
			{
				System.out.println("Doing some work wither inner clas");
			}
				
	
		
	
	*///}//);
		
		
	executeApp(() -> System.out.println("working with lambda"));
}
}
