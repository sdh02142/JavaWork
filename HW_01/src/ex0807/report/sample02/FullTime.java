package ex0807.report.sample02;

public class FullTime extends Employee {
	private int salary;
	private int bonus;
	
	public FullTime() {
		super();
	}
	
	public FullTime(int empNo, String eName, String job, int mgr, String hireDate, String deptName, int salary,	int bonus) {
		super(empNo, eName, job, mgr, hireDate, deptName);
		this.salary = salary;
		this.bonus = bonus;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public void message() {
		System.out.println(super.geteName() + "사원은 정규직입니다.");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" | ");
		builder.append(salary);
		builder.append(" | ");
		builder.append(bonus);
		return builder.toString();
	}
}
