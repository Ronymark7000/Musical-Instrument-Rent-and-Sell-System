 
/**
 * Write a description of class Instrument_to_Rent here.
 *
 * @author (Rohit Ratna Shakya)
 * @version (NP01CP4A210237 )
 */
public class Instrument_to_Rent extends Instrument
{
   private int Charge_Per_Day;
   private String Date_of_Rent;
   private String Date_of_Return;
   private int Number_of_days;
   private boolean Is_rented;
   
   /*
    * To keep two parameters, Instrument_Name and Charge_Per_Day from the above declared values in the constructer.
    * "super" constructor is used to use the variables
    */
   public Instrument_to_Rent(String Instrument_Name, int Charge_Per_Day)
   {
       // to call the parent class i.e "Instrument" we use syntax "super"
       super(Instrument_Name);
       this.Charge_Per_Day = Charge_Per_Day;
       //Date_of_Rent and Date_of_Return are set null 
       this.Date_of_Rent = "";
       this.Date_of_Return = "";
       //Number of days is to be kept zero and Is_rented be false
       this.Number_of_days = 0;
       this.Is_rented = false;
   }
   
   
   //Use of getters method (also know as accessor method)
   public int getCharge_Per_Day()
    { 
        return this.Charge_Per_Day;
    }

   public String getDate_of_Rent()
    {
        return this.Date_of_Rent;
    }
    
   public String getDate_of_Return()
    {
        return this.Date_of_Return;
    }
    
   public int getNumber_of_days()
    {
        return this.Number_of_days;
    }

   public boolean getIs_rented()
    {
        return this.Is_rented;
    }
   
   
   //using setters method (also know as mutator method)
   public void setCharge_Per_Day(int Charge_Per_Day)
   {
       this.Charge_Per_Day= Charge_Per_Day;   
   }
    
    public void setDate_of_Rent(String Date_of_Rent)
    {
        this.Date_of_Rent= Date_of_Rent;   
    }
    
    public void setDate_of_Return(String Date_of_Return)
    {
        this.Date_of_Return= Date_of_Return;   
    }
    
    public void setNumber_of_days(int Number_of_days)
    {
        this.Number_of_days= Number_of_days;   
    }
    
    public void setIs_rented(boolean Is_rented)
    {
        this.Is_rented= Is_rented;   
    }
    
    //all the parameters are new here....
    /*
     * Parameter Name - "Instrument_Rent" & Return type - void
     * The six attributes used here are set as parameter
     * When Is_rented is true, a message with customers details will be displayed
     * When Is_rented is false 
     */
    public void Instrument_Rent(String nCustomer_Name, String nCustomer_Mobile_Number,int nCustomer_PAN, 
    String nDate_of_Rent, String nDate_of_Return, int nNumber_of_days)
    {
        if(this.Is_rented == true)
        {
            System.out.println("Currently, the instrument is not available. It has already been rented by:");
            System.out.println("Customer Name:" + getCustomer_Name());
            System.out.println("Customer Mobile no:" + getCustomer_Mobile_Number());
            System.out.println("Return date:" + getDate_of_Return());
        }
        else if(this.Is_rented == false)
        {
            super.setCustomer_Name(nCustomer_Name); // Parent class "Instrument", we take Customer name and set it in the new parameter
            super.setCustomer_Mobile_Number(nCustomer_Mobile_Number);
            super.setCustomer_PAN(nCustomer_PAN);
            this.setDate_of_Rent(nDate_of_Rent);
            this.Date_of_Return= (nDate_of_Return);
            this.Number_of_days= (nNumber_of_days);
            this.Is_rented= true;
            
            System.out.println("Customer Name:"  + this.getCustomer_Name());
            System.out.println("Customer Mobile Number:" + this.getCustomer_Mobile_Number());
            System.out.println("Customer Permanent Account Number:" + this.getCustomer_PAN());
            System.out.println("Date of Return:" + this.Date_of_Return);
            System.out.println("Date of Renting:" + this.Date_of_Rent);
            System.out.println("Total Number of days:" + Number_of_days);
            
            int Total_charge = Number_of_days * Charge_Per_Day;
            
            System.out.println("Total charge: NRs" + Total_charge);
            
        }
    }
    
    /*
     * Parameter Name - "Return" & Return type - void
     * Here if the Instrument is not rented by anyone then is displays "The instrument is rented"
     * And if the Instrument is rented by a customer then the customer details will be displayed and the value in "Is_rented" will be set to false.
     * other details like PAN no will be set 0, return adn renting date also be set null.
     */
    public void Return()
    {
        if(Is_rented == false)
        {
            System.out.println("The instrument is available");
        }
        else
        {
            super.setCustomer_Name("");
            super.setCustomer_Mobile_Number("");
            super.setCustomer_PAN(0);
            this.Date_of_Return="";
            this.Date_of_Rent="";
            this.Number_of_days=0;
            this.Is_rented= false;
        }
    }
    
    /*
     * Parameter Name - "Display" & Return type - void
     * "super" syntax is used to call the method super class that is the parent class "Instrument"
     * If the instrument is rented then customers details along with renting and return date will be displayed.
     */
    public void display()
    {
        super.display();
        
        if(Is_rented == true)
        {
            System.out.println("Customer Name:" + getCustomer_Name());
            System.out.println("Customer Mobile no:" + getCustomer_Mobile_Number());
            System.out.println("Customer PAN:" + getCustomer_PAN());
            System.out.println("Instrument Renting Date" + Date_of_Rent);
            System.out.println("Instrument Return Date" + Date_of_Return);
        }
    }
}