package UniversityExamManagementSystem;

public class FinalExam extends ExamProcess{

	

	public FinalExam(String examCode) {
		super(examCode);
	}

	@Override
	void conductExam(Student std) {
		// TODO Auto-generated method stub
		System.out.println("Conducting Final Exams... for" +std.name);
		
	}

	@Override
	int evaluate(Student std) {
		// TODO Auto-generated method stub
		System.out.println("Evaluating final papers");
		return 80;
	}

	
}
