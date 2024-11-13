package utilityClasses;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/**
	 * This method is used for getting a random Number
	 * 
	 * @return
	 */
	public int getRandomNumber() {
		Random random = new Random();
		int ranNum = random.nextInt(5000);
		return ranNum;
	}

	/**
	 * This method is used for getting the system date in "yyyy-mm-dd" format
	 * 
	 * @return
	 */
	public String getSystemDateYYYYMMDD() {

		Date dateObj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(dateObj);
		return date;

	}
	/**
	 * This method is used for fetching the current Time
	 * 
	 * @return
	 */
	public String getCurrentTime() {
		String time = new Date().toString().replace(" ", "_").replace(":", "_");
		return time;
	}

	/**
	 * This method is used for getting a required date
	 * 
	 * @param days
	 * @return
	 */
	public String getRequiredDateYYYYMMDD(int days) {
		Date dateObj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.format(dateObj);
		Calendar cal = sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String reqdate = sdf.format(cal.getTime());
		return reqdate;

	}
}
