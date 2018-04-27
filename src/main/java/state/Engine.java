package state;

public class Engine {
	
	private State state;
	
	public Engine() {
		this.state =new OffState();
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public void nexState(){
		state.pull(this);
	}

}
