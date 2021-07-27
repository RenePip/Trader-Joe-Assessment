package cd.rr.trader;

public class Main {
         /*Perform the following steps in main()
Create a new portfolio
Transfer an initial $100 into the portfolio
Deposit $120 more dollars into the portfolio
Apply a change of 5% to the portfolio
Withdraw all the money in the portfolio.
Apply a change of -10% to the portfolio
Deposit all the money back into the portfolio
Apply a change of 5% to the portfolio
Withdraw all the money back out
If Joe started with 220 dollars, what was his profit at the end?*/

    public static double getValue(double getValue) {
        return 0;
    }
    public static void main(String[] args) {
        StockPortfolio sp = new StockPortfolio(0,10,100);
        System.out.println("Create a new portfolio:" + 100);
        System.out.println(+ 120);
        StockPortfolio.setValueOfPortfolio(0.05);
        System.out.println(220-220);
        StockPortfolio.setValueOfPortfolio(-0.10);
        System.out.println(0+220);
        StockPortfolio.setValueOfPortfolio(0.05);
        System.out.println(220-220);


    }

}
