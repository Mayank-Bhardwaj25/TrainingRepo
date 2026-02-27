package UniversityExamManagementSystem;

public class MidTermExam  extends ExamProcess{

	public MidTermExam() {
		super("XXXX");
	}

	@Override
	void conductExam(Student std) {
		// TODO Auto-generated method stub
		System.out.println("Conducting Mid term exam for" +std.name);
		
	}

	@Override
	int evaluate(Student std) {
		// TODO Auto-generated method stub
		System.out.println("Evaluating MidTerm papers");
		return 55;
	}


}
