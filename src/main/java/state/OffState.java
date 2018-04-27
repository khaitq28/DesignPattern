package state;

public class OffState implements State{

	public void pull(Engine engine) {
		engine.setState(new LowState());
		System.out.println("go to LOW state");

	}

}
