package Lab02_01.dp.tdtu;

public class StudentList {
	private Student[] student;
	private int count;
	private ISortStrategy sortStrategy;
	public Student[] getStudent() {
		return student;
	}
	public void setStudent(Student[] student) {
		this.student = student;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public ISortStrategy getSortStrategy() {
		return sortStrategy;
	}
	public void setSortStrategy(ISortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}
	
	public void addStudent(Student student) {
		student.addElement(student,st1);
	}
	
	public void sort() {
		//
	}
	
	public void display() {	
		//
	}
	
	
}
