
//Driver class
public class CustomerInformation
{   
    //Declaration of the instance variables
    private String custId;
    private String custName;
    private String custNum;
    private int tixQtt;
    private double tixAmount;
    private String purchaseDate;
    private boolean paid;

    // Constructor without parameters
    public CustomerInformation() 
    {
        custId = "";
        custName = "";
        custNum = "";
        tixQtt = 0;
        tixAmount = 0.00;
        purchaseDate = "";
    }//end of constructors without parameters

    // Normal constructor with parameters
    public CustomerInformation(String custId, String custName, String custNum, int tixQtt,
                               double tixAmount, String purchaseDate)
    {
        this.custId = custId;
        this.custName = custName;
        this.custNum = custNum;
        this.tixQtt = tixQtt;
        this.tixAmount = tixAmount;
        this.purchaseDate = purchaseDate;
    }//end of constructors with parameters

    //Mutator/setter for all attributes
    public void setCustomerInfromation(String custId, String custName, String custNum, int tixQt,
                                       double tixAmount, String purchaseDate)
    {
        this.custId = custId;
        this.custName = custName;
        this.custNum = custNum;
        this.tixQtt = tixQtt;
        this.tixAmount = tixAmount;
        this.purchaseDate = purchaseDate;
    }//end of mutator for all attributes

    // Mutator/setter to change the object state
    public void setCustId(String custId) 
    {
        this.custId = custId;
    }//end of setCustId

    public void setCustName(String custName) 
    {
        this.custName = custName;
    }//end of setCustName

    public void setCustNumber(String custNum) 
    {
        this.custNum = custNum;
    }//end of setCustNum
    
    public void setTixQtt(int tixQtt) 
    {
        this.tixQtt = tixQtt;
    }//end of setCustNum
    
    public void setTixAmount(double tixAmount) 
    {
        this.tixAmount = tixAmount;
    }//end of setCustNum
    
    public void setPurchaseDate(String purchaseDate) 
    {
        this.purchaseDate = purchaseDate;
    }//end of setCustNum

    // Retriever / Accessor for each data member 
    public String getCustId() 
    {
        return custId;
    }//end of getCustId

    public String getCustName() 
    {
        return custName;
    }//end of getCustName

    public String getCustNum() 
    {
        return custNum;
    }//end of getCustNum
    
    public int getTixQtt() 
    {
        return tixQtt;
    }//end of getTixQtt
    
    public double getTixAmount() 
    {
        return tixAmount;
    }//end of getTixAmount
    
    public String getPurchaseDate() 
    {
        return purchaseDate;
    }//end of getPurchaseDate

    // toString() method / to print the result
    public String toString() //overriding method 
    {
        return ("Customer ID: " + custId + "\n"
                + "Name: " + custName + "\n"
                + "Contact Number: " + custNum + "\n"
                + "Ticket Quantity: " + tixQtt + "\n"
                + "Ticket Amount: " + tixAmount + "\n"
                + "Purchase Date: " + purchaseDate + "\n"
                + "Paid: " + (paid ? "Yes" : "No") + "\n");
    }//end of toString

    public boolean isPaid() {
        return paid;
    }
    
    public void setPaid(boolean paid) {
        this.paid = paid;
    }
    
    public boolean GetPaidCustomers(boolean paid) {
        return paid;
    }
    
}//end of class