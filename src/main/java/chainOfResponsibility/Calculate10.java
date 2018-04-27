package chainOfResponsibility;

public class Calculate10 extends CalculateToReturn {


    public void calculate(int amount) {

        int remain = amount % 10;
        int count  = amount / 10;

        System.out.println("Number of 10 dollars: " + count);

        if (remain > 0)
           getCalculateToReturn().calculate(remain);
    }

}
