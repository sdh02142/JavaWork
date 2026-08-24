package ex0824;

/**
*
	1)동기화 없이 실행 → 공유 데이터에 여러 스레드가 접근할 때 발생하는 문제 확인
	2)synchronized 적용 → 한 번에 하나의 스레드만 임계영역에 진입함을 확인
	                       하지만 실행 순서는 원하는 대로 제어되지 않음을 확인
	3) wait() 적용 → 자기 차례가 아니면 lock을 반납하고 대기
	   notify() 적용 → 작업 완료 후 상대 스레드를 깨움
	         마지막으로 notifyAll()과 notify() 차이 설명

    synchronized는 "동시에 못 들어오게 하는 것",
   wait()/notify()는 "스레드 실행 순서를 협력적으로 제어하는 것"

* */

public class SynchronizedExam {
	public static void main(String[] args) {
		System.out.println("====== main start ======");
		
		Bank bank = new Bank();
		
		CustomThread th1 = new CustomThread(bank, "입금자", true);
		CustomThread th2 = new CustomThread(bank, "인출자", false);
		
		th1.start();
		th2.start();
		
		System.out.println("====== main end ======");
	}
}

class Bank{
	int bal;
	
	/**
     * synchronized
     * - 한 스레드가 이 메서드를 실행하는 동안 Bank 객체의 lock을 획득한다.
     * - 다른 스레드는 같은 객체의 synchronized 영역에 동시에 들어올 수 없다.
     *
     * wait()
     * - 현재 스레드를 WAITING 상태로 보내고, 가지고 있던 lock을 반납한다.
     *
     * notify(), notifyAll()
     * - wait() 중인 스레드를 깨운다.
     * - 단, 깨어난 스레드는 즉시 실행되는 것이 아니라 lock을 다시 획득한 뒤 실행된다.
     *
     * 주의
     * - wait(), notify(), notifyAll()은 반드시 해당 객체의 synchronized 영역 안에서 호출해야 한다.
     *//**
     * synchronized
     * - 한 스레드가 이 메서드를 실행하는 동안 Bank 객체의 lock을 획득한다.
     * - 다른 스레드는 같은 객체의 synchronized 영역에 동시에 들어올 수 없다.
     *
     * wait()
     * - 현재 스레드를 WAITING 상태로 보내고, 가지고 있던 lock을 반납한다.
     *
     * notify(), notifyAll()
     * - wait() 중인 스레드를 깨운다.
     * - 단, 깨어난 스레드는 즉시 실행되는 것이 아니라 lock을 다시 획득한 뒤 실행된다.
     *
     * 주의
     * - wait(), notify(), notifyAll()은 반드시 해당 객체의 synchronized 영역 안에서 호출해야 한다.
     */
	
	public synchronized void bc(String name, boolean b) {
		if(b) {
			while(bal == 1) {
				System.out.println(name + " wait(). balance : " + bal);
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.print(name + "'s balance : "+  bal + " / ");
			bal++;
			System.out.println(name + "'s balance up : "+  bal);
		} else {
			while(bal == 0) {
				System.out.println(name + " wait(). balance : " + bal);
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.print(name + "'s balance : "+  bal + " / ");
			bal--;
			System.out.println(name + "'s balance down : "+  bal);
		}
		notifyAll(); // wait()에 의해 대기 중인 thread 호출
	}
}

class CustomThread extends Thread{
	Bank bank;
	String name;
	boolean b;
	
	public CustomThread(Bank bank, String name, boolean b) {
		super(name);
		
		this.bank = bank;
		this.name = name;
		this.b = b;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			bank.bc(name, b);
		}
		System.out.println(name + "'s Thread over");
	}
}