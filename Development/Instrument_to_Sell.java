 
/**
 * Write a description of class Instrument_to_Sell here.
 *
 * @author (Rohit Ratna Shakya)
 * @version (NP01CP4A210237 )
 */
public class Instrument_to_Sell extends Instrument
{
    private double Price;
    private String Sell_date;
    private double discount_percent;
    private boolean Is_Sold;
    
    // from the question the constructor accepts two parameter which are mentioned below.
    public Instrument_to_Sell(String Instrument_Name, double Price)
    {
        //call the parent class we use the syntax
        super(Instrument_Name);
        this.Price = Price;
        this.Sell_date = "";
        this.discount_percent = 0.0;
        this.Is_Sold = false;
    }
    
    //Use of getters method (also know as accessor method)
    public double getPrice()
    { 
        return this.Price;
    }
    
    public String getSell_date()
    {
        return this.Sell_date;
    }
    
    public double getdiscount_percent()
    {
        return this.discount_percent;
    }
    
    public boolean getIs_Sold()
    {
        return this.Is_Sold;
    }
    
    
    //using setters method (also know as mutator method)
    public void setPrice (double Price)
    { 
        if(this.getIs_Sold() == false)
        {
            this.Price = Price;
        }
        else
        {
            System.out.println("Not possible to change the price as the instrument has been sold");
        }
    }
    
    public void setSell_date (String Sell_date)
    {
        this.Sell_date = Sell_date;
    }
    
    public void setdiscount_percent (double discount_percent)
    {
        this.discount_percent = discount_percent;
    }
    
    public void setIs_Sold (Boolean Is_Sold)
    {
        this.Is_Sold = Is_Sold;  
    }
    
    /*
     * An appropriate message will show if the Instrument is already sold along with the custome details
     * If the instrument is available then Customer detail, sell date, discount percent is needed to be updated
     * Customer details are called form super syntax
     * Price is calculated by the  given formula below.
     */
    public void Instrument_Sell(String Customer_Name,String Customer_Mobile_Number,
                                int Customer_PAN,String Sell_date , double discount_percent)
    {
        if(this.Is_Sold== true)
        {
            System.out.println("Already the instrument bought by:" + Customer_Name);
            System.out.println("The Customers mobile number is:" + Customer_Mobile_Number);
            System.out.println("The Customers PAN number is " + Customer_PAN);
        }
        
        else
        {
            super.setCustomer_Name (Customer_Name);
            super.setCustomer_Mobile_Number (Customer_Mobile_Number);
            super.setCustomer_PAN (Customer_PAN);
            this.setSell_date (Sell_date);
            this.setdiscount_percent(discount_percent);
            this.setPrice( this.Price - ((this.discount_percent/100) * this.Price));
            this.Is_Sold = true;
        }
    }
        
    /*
     * Same method is used here in display i.e"public void display" as in Instrument Class
     * Price of the instrument is displayed
     * If the instrument is sol then the sold date along with customer details is displayed.
     */
    public void display()
    {
        super.display();
        System.out.println("Instruments final price is NRs." + this.getPrice());
        
        if(this.getIs_Sold() == true)
        {
            System.out.println("Customers Name:" +  this.getCustomer_Name());
            System.out.println("Mobile Number:" + this.getCustomer_Mobile_Number());
            System.out.println("Customers PAN:" + this.getCustomer_PAN());
            System.out.println("Sold Date:"  + this.Sell_date);
        }
    }
}