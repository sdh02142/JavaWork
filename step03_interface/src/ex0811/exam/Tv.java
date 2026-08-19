package ex0811.exam;

public class Tv extends Elec implements ElecFunction{
	private int channel;
	
	public Tv() {}	
	public Tv(int channel) {
		super();
		this.channel = channel;
	}
	public Tv(String code, int cost, int channel) {
		super(code, cost);
		this.channel = channel;
	}

	@Override
	public void start() {
		System.out.println(super.getCode() + "의 " + getClass().getSimpleName() + "을(를) " + this.channel + "을 본다.");
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
		builder.append(" | channel : ");
		builder.append(channel);
		return builder.toString();
	}
}
