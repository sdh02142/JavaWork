package ex0813.exam05;

public class Course {
	public void register01(Applicant<?> applicant) {
		System.out.println(applicant.getP().getClass().getSimpleName() + " - register01");
	}

	public void register02(Applicant<? super Worker> applicant) {
		System.out.println(applicant.getP().getClass().getSimpleName() + " - register02");
	}

	public void register03(Applicant<? extends Student> applicant) {
		System.out.println(applicant.getP().getClass().getSimpleName() + " - register03");
	}
}
