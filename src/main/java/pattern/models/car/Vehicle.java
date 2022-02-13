package pattern.models.car;

import pattern.models.car.engine.IEngine;

import java.io.Serializable;

public abstract class Vehicle implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1761283874855886409L;

    protected Integer Id;

    protected IEngine engine;

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public abstract void startEngine();


}
