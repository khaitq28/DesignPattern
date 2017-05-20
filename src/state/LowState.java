package state;

public class LowState  implements State {

	@Override
	public void pull(Engine engine) {
		engine.setState(new MediumState());
		System.out.println("go to MEDIUM state");

	}
}
