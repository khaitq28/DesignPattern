package chainOfResponsibility;

public abstract class CalculateToReturn {

    private CalculateToReturn calculateToReturn;

    public void setNextCalculate(CalculateToReturn calculateToReturn) {

        this.calculateToReturn = calculateToReturn;
    }

    protected CalculateToReturn getCalculateToReturn() {
        return  calculateToReturn;
    }

    public abstract void calculate(int amount);

}
