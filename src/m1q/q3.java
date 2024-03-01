package m1q;
import java.util.regex.Matcher;  // validation got output
import java.util.regex.Pattern;
 
class TransactionParty
{
    String seller;
    String buyer;
 
    public TransactionParty(String seller, String buyer) 
    {
        this.seller = seller;
        this.buyer = buyer;
    }
}
 
class Receipt
{
    TransactionParty transactionParty;
    String productsQR;
 
    public Receipt(TransactionParty transactionParty, String productsQR)
    {
        this.transactionParty = transactionParty;
        this.productsQR = productsQR;
    }
}
 
class GenerateReceipt  
{
    public int verifyParty(Receipt r) 
    {
        String sellerRegex = "^[a-zA-Z'\\- ]+$";
        Pattern pattern = Pattern.compile(sellerRegex);
        Matcher sellerMatcher = pattern.matcher(r.transactionParty.seller);
 
        Matcher buyerMatcher = pattern.matcher(r.transactionParty.buyer);
 
        if (sellerMatcher.matches() && buyerMatcher.matches()) 
        {
            return 2; // Both names are valid
        } else if (sellerMatcher.matches() || buyerMatcher.matches()) 
        {
            return 1; // Only one name is valid
        } else {
            return 0; // Both names are invalid
        }
    }
 
    public String calcGST(Receipt r)
    {
        String[] products = r.productsQR.split("@");
 
        int GST_Rate = 12;
        int GST = 0;
 
        for (String product : products) {
            String[] rateQuantity = product.split(",");
            int rate = Integer.parseInt(rateQuantity[0]);
            int quantity = Integer.parseInt(rateQuantity[1]);
            GST += rate * quantity;
        }
 
        GST = (GST * GST_Rate) / 100;
 
        return Integer.toString(GST);
    }
}
    public class q3{
    public static void main(String[] args) 
    {
        TransactionParty party = new TransactionParty("John Doe", "Jane Smith");
        Receipt receipt = new Receipt(party, "250,10@100,3@50,7");
 
        GenerateReceipt generator = new GenerateReceipt();
        int partyVerificationResult = generator.verifyParty(receipt);
        String GSTValue = generator.calcGST(receipt);
 
        System.out.println("Party Verification Result: " + partyVerificationResult);
        System.out.println("GST Value: " + GSTValue);
    }
}