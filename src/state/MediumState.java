package state;

public class MediumState implements State {

	@Override
	public void pull(Engine engine) {
		engine.setState(new HightState());
		System.out.println("go to HIGHT state");
	}

}
