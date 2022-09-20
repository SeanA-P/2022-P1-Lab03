// Lab03vst.java
// Student starting version of the Lab03 assignment.
// Resave this program as Lab03v80 for the 80 point version.
// Resave this program as Lab03v100 for the 100 point version.
// I am half asleep

public class Lab03vst
{
	public static void main(String[] args)
	{
      System.out.println("Lab03, 80 Point Version\n");
	  int s = 10000;
			  System.out.println("Starting seconds: " + s);
	  int h = s / 3600;
			  System.out.println("Hours: " + h);
					  int sec = s % 3600;
							  int m = sec / 60;
			System.out.println("Minutes: " + m);
			int ces = sec % 60;
			System.out.println("Seconds: " + ces);
	}
// ces is a dumb variable but it's sec backwards
}