package mulitiTherading;

class Course{
	private int id;
	private String name;
	private double fee;
	
	public Course(int id,String name,double fee) {
		this.id=id;
		this.name=name;
		this.fee=fee;
	} 
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getFee() {
		return fee;
	}
}
class Offer{
	private String offerText;
	
	public Offer(String offerText){
		this.offerText=offerText;
	}
	public String getOfferText() {
		return offerText;
	}
}
class EducationInstitute{
	private Course[] courses;
	private Offer[] offers;	
	public EducationInstitute() {
		courses = new Course[] {
				new Course(1,"mathmatics",1000),
				new Course(2,"Science",1200.00),
				new Course(3,"English",900.0)
		};
		
		offers = new Offer[] {
				new Offer("Special discount : get 20% off on all courses"),
				new Offer("limited time offer : enroll in any two courses and get one course free!")
		};
	}
	public Course[] getCourses() {
		return courses;
	}
	public Offer[] getOffers() {
		return offers;
	}
	public synchronized void enrollStudentCourse(int courseId,String studentName) {
		for(Course course : courses) {
			if(course.getId() == courseId) {
				System.out.println(studentName + "has enrolled int the course: "+course.getName());
				return;
			}
		}
		System.out.println("course id: "+courseId+" not found for: "+studentName);
	}
}
class Student extends Thread{
	private String name;
	private EducationInstitute institute;
	
	public Student (String name,EducationInstitute institute) {
		this.name=name;
		this.institute=institute;
	}
	
	public void viewCoursesAndFees() {
		System.out.println("available courses :");
		for(Course course : institute.getCourses()) {
			System.out.println(course.getId() + " ."+course.getName() + "- fee: RS. : "+ course.getFee());
		}
	}
	public void viewOffers() {
		System.out.println("\n ongoning offers :");
		for(Offer offer : institute.getOffers()) {
			System.out.println(offer.getOfferText());
		}
	}
	public void enrollInCourse(int courseId) {
		institute.enrollStudentCourse(courseId, name);
	}
	@Override
	public void run() {
		viewCoursesAndFees();
		viewOffers();
		enrollInCourse(1+(int)(Math.random()*3));
	}
}
public class MainClass {
	public static void main(String[] args) throws InterruptedException {
		EducationInstitute institute = new EducationInstitute();
		Student shivendra = new Student("shivendra",institute);
		Student omkar = new Student("omkar",institute);
		shivendra.start();
		shivendra.join();
		omkar.start();
		
	}
}
