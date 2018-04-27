package chainOfResponsibility;

public class Calculate2 extends CalculateToReturn {

    public void calculate(int amount) {

            int remain = amount % 2;
            int count  = amount / 2;

            System.out.println("Number of 2 dollars: " + count);

            if (remain > 0) {
                System.out.println("The remainder is : " + remain);
            }
    }
}
