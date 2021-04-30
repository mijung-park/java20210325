package p15.textbook.ex10;

public class Student implements Comparable<Student> {
	public String id;
	public int score;
	
	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}
	
	public int compareTo(Student o) {
	
		return this.score - o.score;
	}
	
}
