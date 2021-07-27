package cd.rr.trader;

public class StockPortfolio {
    //attributes
    //value -> an attribute of type double that holds the value of the portfolio
    //transferFee -> a static attribute set initially to $10 that is removed from the value with every transfer
    public static double valueOfPortfolio ;//1
    public static double transferFee = 10;
    public static double amount;

    //methods
//getValue() -> should return the value of the portfolio
//transfer(amount) -> should add the provided amount, which could be negative or positive, to the value
//applyChange(percentage) -> should increase/decrease the value by the percentage provided i.e. $100 with -20% change => $80


    public StockPortfolio(double valueOfPortfolio, double transferFee, double amount) {

    }
   public static double getValue(){
       System.out.println();
       return valueOfPortfolio;

   }

   public static void setValueOfPortfolio(double valueOfPortfolio){


   }
   public static void transfer(double amount){
        StockPortfolio.transferFee = transferFee;
   }
     public double applyChange(){
        return valueOfPortfolio * transferFee;

     }


}