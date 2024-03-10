/**
* <h1><b>Display the current time<b></h1>
*
* The Actual Time program calculates and displays the actual
* time in 24 hours format. For that, it uses the currentTimeMillis()
* method to calculate the time elapsed in milliseconds since 01/01/1970 00:00:00 GMT.
*
* @author           Leandro Crisol Lo Presti
* @version          1.0
* @since            09/02/2024
* @module           Introduction to Programming (BSHCE1)
* @student_number   23156503
*/

public class ActualTime {
	public static void main (String[] args) {
		final long time_in_milliseconds = System.currentTimeMillis();
		int seconds;
		int hours;
		int minutes;
		/**
		* We can reduce the milliseconds taking off whole days to get the actual time of today.
		* 1 day has 24 hours, multiplying those hours by 60 and the result by 60 again, we get how many seconds
		* a day has. If we multiply the seconds of a day by 1.000, we get how many milliseconds a day has.
		*
		* The modulus of the actual time in milliseconds divided by the milliseconds a day has, gives as reminder
		* how many milliseconds have elapsed since the last midnight. Dividing those milliseconds of "today's time" by 1.000
		* we turn them into seconds.
		*/
		seconds = (int)(time_in_milliseconds%(24*60*60*1000)/1000);

		hours = seconds / 3600; // turns seconds into hours

		minutes = (seconds % 3600) / 60; // converts the remaining seconds less than an hour into minutes

		seconds = (seconds % 3600) % 60; // stores the remaining seconds less than an hour AND less than a minute

		System.out.printf("Current time is %02d:%02d:%02d  \n", hours, minutes, seconds);
	}
}
