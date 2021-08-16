package module1.practice.StringManipulation;


import java.util.*;
import java.lang.*;
import java.util.regex.*;

class TransactionParty {

     String seller;
    String buyer;

    public TransactionParty(String seller, String buyer)
    {
      this.seller=seller;
      this.buyer=buyer;
    }

    public TransactionParty()
    {

    }


}

class Receipt{

 TransactionParty transactionParty;
  String productsQR;

  public Receipt(TransactionParty transactionParty, String productsQR)
  {
    this.transactionParty=transactionParty;
    this.productsQR=productsQR;
  }
    
  public Receipt()
  {

  }  
}


class GenerateReceipt{

	public int verifyParty(Receipt r)
	{
		int count =0;
	     String regex = "^[A-Z]{1}[a-z]*[\\s]*[A-Z]{1}[a-z]*[\\'\\-]*[A-Z]*[a-z]*$";
	     if(Pattern.matches(regex,r.transactionParty.buyer))
	     {
	       count++;
	     }
	     if(Pattern.matches(regex,r.transactionParty.seller))
	     {
	       count++;
	     }
	     return count;
	}

	public String calcGST(Receipt r)
	{
		String [] bill = r.productsQR.split("@");
	    Integer sum =0;
	    for(String s : bill)
	    {
	      sum+=(Integer.parseInt(s.split(",")[0])*Integer.parseInt(s.split(",")[1]));
	      //System.out.println(sum);
	    }
	    Integer gst = ((sum*12)/100);
		return gst.toString();
	}
    
}
class Practice_doselect_8{
  public static void main(String[] args){
    
	  TransactionParty tp = new TransactionParty();
	  Receipt rr = new Receipt(tp,"250,10@100,3@50,7");
	  GenerateReceipt gr = new GenerateReceipt();
	  System.out.println(gr.calcGST(rr));
  }
}