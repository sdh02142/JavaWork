package ex0813.exam05;

public class Applicant <P> {
	private P p;
	
	Applicant(){}
	Applicant(P p){
		this.p = p;
	}
	public P getP() {
		return p;
	}

	public void setP(P p) {
		this.p = p;
	}
}
