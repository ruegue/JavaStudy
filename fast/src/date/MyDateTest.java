package date;


class MyDate{
	int year;
	int month;
	int day;
	
	public MyDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
		
	}

	@Override
	public int hashCode() {
		return year*10000+month*100+day;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate day = (MyDate)obj;
			if(this.year == day.year && this.month == day.month && this.day == day.day)
				return true;
		}
		return false;
	}
}

public class MyDateTest {

	public static void main(String[] args) {
		MyDate day1 = new MyDate(1992,10,4);
		MyDate day2 = new MyDate(1992,10,4);
		
		
		System.out.println(day1.equals(day2));
		System.out.println(day1.hashCode());
	}

}
