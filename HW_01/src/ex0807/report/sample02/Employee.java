package ex0807.report.sample02;

public abstract class Employee {
	private int empNo;
	private String eName;
	private String job;
	private int mgr;
	private String hireDate;
	private String deptName;
	
	public Employee() {}
	
	public Employee(int empNo, String eName, String job, int mgr, String hireDate, String deptName) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.deptName = deptName;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public abstract void message();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(empNo);
		builder.append(" | ");
		builder.append(eName);
		builder.append(" | ");
		builder.append(job);
		builder.append(" | ");
		builder.append(mgr);
		builder.append(" | ");
		builder.append(hireDate);
		builder.append(" | ");
		builder.append(deptName);
		return builder.toString();
	}
}
