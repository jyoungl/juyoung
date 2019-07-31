
public class Car {
	private boolean state;
	private int gas;
	private iCommend exception;
	
	public Car(int gas) {
		this.gas = gas;
		this.state =true;
	}
	
	public iCommend getException() {
		return this.exception;
	}
	
	public void setException(iCommend exception) {
		this.exception = exception;
	}
	
	public void setState(boolean state) {
		this.state = state;
	}
	
	public void setGas(int gas) {
		this.gas = gas;
	}
	
	public boolean getState() {
		return this.state;
	}
	
	public int getGas() {
		return this.gas;
	}
	
	public void run() {
		while(this.state) {
			System.out.println("현재 달리는 중... 남은 연료: " + this.gas);
			this.gas--;
			
			try {
			if(this.gas == 0) {
				throw (HasMoreGasException)exception;
				}
			}
			catch(HasMoreGasException e) {
				e.execute();
			}
			
			try {
				Thread.sleep(1000L);
			}catch(InterruptedException e) {}
		}
	}
}