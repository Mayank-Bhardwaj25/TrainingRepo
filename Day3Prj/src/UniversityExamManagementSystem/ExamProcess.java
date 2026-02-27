package UniversityExamManagementSystem;

public abstract class ExamProcess {
	static final int passMarks = 40;
	final  String examCode;
	
	public ExamProcess(String examCode) {
		super();
		this.examCode = examCode;
	}
	
	boolean ValidateEligibility(Student std) {
		return std.attendPer >= UniversityRules.minAttendPer;
	}
	
	String allocateHallTicket(Student std) {
		return UniversityRules.generateHallTicket();
	}
	abstract void conductExam(Student std);
	abstract int evaluate(Student std);
	
	//declaring some methods final because i do not want them to be overridden
	final void publishResult(Student std, int marks) {
		if(marks >= passMarks) {
			System.out.println(std.name+ "PASSED WITH MARKS: " +marks);
		}
		
		else {
			System.out.println(std.name + " FAILED WITH MARKS: "+ marks);
		}
	}

	
	final void ExamProcessSteps(Student std) {
		if(!ValidateEligibility(std)) {
			System.out.println(std.name+ " is NOT eligible due to low attendance");
			return;
		}
		String hallTicket = allocateHallTicket(std);
		System.out.println("Here is the HallTicket :-" +hallTicket);
		conductExam(std);
		int marks = evaluate(std);
		publishResult(std, marks);
	}
	

}
