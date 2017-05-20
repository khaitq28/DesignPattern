package state;

public class HightState implements State {

	@Override
	public void pull(Engine engine) {
		engine.setState(new OffState());
		System.out.println("go to OFF state");
	}
}
