package UniversityExamManagementSystem;

public class LabExam extends ExamProcess{

	public LabExam(String examCode) {
		super(examCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	void conductExam(Student std) {
		// TODO Auto-generated method stub
		System.out.println("Conducting Lab Practicals for " +std.name);
		
	}

	@Override
	int evaluate(Student std) {
		// TODO Auto-generated method stub
		System.out.println("Evaluating Lab Performance");
		return 40;
	}
	

}
