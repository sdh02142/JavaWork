package ex0811.exam;

public class Audio extends Elec implements ElecFunction{
	private int volumn;
	
	public Audio() {}	
	public Audio(int volumn) {
		super();
		this.volumn = volumn;
	}
	public Audio(String code, int cost, int volumn) {
		super(code, cost);
		this.volumn = volumn;
	}

	@Override
	public void start() {
		System.out.println(super.getCode() + "의 " + getClass().getSimpleName() + "을(를) " + this.volumn + "으로 듣는다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" | volumn : ");
		builder.append(volumn);
		return builder.toString();
	}
}
