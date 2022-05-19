//1. Create a java program that prints numbers 1 to 10.
//2. Create a Jenkins job (JOB1) to compile the java program.
//3. Copy this job to another Jenkins job (JOB2) that prints the numbers.
//4. Create a third Jenkins job (JOB3) to print that both the above jobs have run successfully.
//5. The numbers have to be printed every 3 minutes and 30 seconds.



public class Numbers
{
	public static void main(String args[])
	{
		//loop counter initialisation
		int i=1;

		//print statement
		System.out.println("Output is : ");

		//loop to print 1 to 10.
		while(i<=10)	
		{
			System.out.println(i);
			i++;
		}
	}
}