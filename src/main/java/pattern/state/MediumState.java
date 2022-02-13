package pattern.state;

public class MediumState implements State {


	public void pull(Engine engine) {
		engine.setState(new HightState());
		System.out.println("go to HIGHT pattern.state");
	}

}
