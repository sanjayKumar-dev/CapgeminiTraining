import java.util.Calendar;

public class cal {
	int day;
	int month;
	int year;
	Calendar c;
	public cal(Calendar c)
	{
		day = c.get(Calendar.DAY_OF_MONTH);
        month = c.get(Calendar.MONTH);
        year = c.get(Calendar.YEAR);
        this.c = c;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	public String getCal() {
		String str = Integer.toString(day)+"-"+Integer.toString(month)+"-"+Integer.toString(year);
		return str;
	}
	
}
