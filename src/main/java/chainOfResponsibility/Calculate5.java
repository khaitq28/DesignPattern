package chainOfResponsibility;

public class Calculate5 extends CalculateToReturn {


    public void calculate(int amount) {

        int remain = amount % 5;
        int count  = amount / 5;

        System.out.println("Number of 5 dollars: " + count);

        if (remain > 0)
            getCalculateToReturn().calculate(remain);
    }
}
