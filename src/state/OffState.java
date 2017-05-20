package state;

public class OffState implements State{

	@Override
	public void pull(Engine engine) {
		engine.setState(new LowState());
		System.out.println("go to LOW state");

	}

}
