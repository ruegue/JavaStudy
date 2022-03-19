package javaCh6;

public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+(kor+eng+math)+","+Math.round((kor+eng+math)/3f*10)/10f;
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	public float getAverage() {
		return Math.round((kor+eng+math)/3f*10)/10f;
	}
	
	Student(String name, int ban, int no,int kor, int eng,int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	Student(){}
}
