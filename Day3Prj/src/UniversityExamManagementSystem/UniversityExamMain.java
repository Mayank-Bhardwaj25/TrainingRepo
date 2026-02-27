package UniversityExamManagementSystem;

public class UniversityExamMain {
	
	public static void main(String[] args) {
		Student s1 = new Student("909", "Mayank", 90);
		Student s2= new Student("707", "Gaurav", 65);
		
		ExamProcess lab = new LabExam("LAB506");
		ExamProcess midTerm = new MidTermExam();
		ExamProcess finalExam = new FinalExam("FIN506");
		
		System.out.println("---MidTerm Exams ---");
		midTerm.ExamProcessSteps(s1);
		System.out.println( "---Lab Exam---");
		lab.ExamProcessSteps(s2);
		
		System.out.println("----Final Exams");
		finalExam.ExamProcessSteps(s2);
		
	}

}
