 
/**
 * Write a description of class Instrument here.
 *
 * @author (Rohit Ratna Shakya)
 * @version (NP01CP4A210237 )
 */
public class Instrument
{
    private static int Instrument_ID;
    private String Instrument_Name;
    private String Customer_Name;
    private String Customer_Mobile_Number;
    private int Customer_PAN;
    
    /*
     * here Instrument_ID is incremented by 1 every time a new instrument is added
     * Instrument_Name is set as the parameter and initialized in the constructor
     */
    public Instrument(String Instrument_Name) // parameterized constrctor....initialized name of the constructers parameter.
    {
        Instrument.Instrument_ID = ++Instrument_ID;
        this.Instrument_Name = Instrument_Name;
        //Customer Name and Customer Mobile Number is to be kept null so no value is inserted.
        this.Customer_Name = ""; 
        this.Customer_Mobile_Number = "";
        //value of PAN is initilized to be Zero.
        this.Customer_PAN = 0;
    }
    
    //Use of getters method (also know as accessor method)
    public int getInstrument_ID() //Static variable
    {
        return this.Instrument_ID;
    }
    
    public String getInstrument_Name() //Instance variable
    {
        return this.Instrument_Name;
    }
    
    public String getCustomer_Name()
    {
        return this.Customer_Name;
    }
    
    public String getCustomer_Mobile_Number()
    {
        return this.Customer_Mobile_Number;
    }
    
    public int getCustomer_PAN()
    {
        return this.Customer_PAN;
    }
    
    
    
    //using setters method (also know as mutator method)
    public void setInstrument_ID(int Instrument_ID)
    {
        this.Instrument_ID = Instrument_ID;   
    }
    
    public void setInstrument_Name(String Instrument_Name)
    {
        this.Instrument_Name = Instrument_Name;
    }
    
    public void setCustomer_Name(String Customer_Name)
    {
        this.Customer_Name = Customer_Name;
    }
    
    public void setCustomer_Mobile_Number(String Customer_Mobile_Number)
    {
        this.Customer_Mobile_Number = Customer_Mobile_Number;
    }
    
    public void setCustomer_PAN(int Customer_PAN)
    {
        this.Customer_PAN = Customer_PAN;
    }
    
    
    /*
     * It Displays Instrument_Name and Instrument_ID
     *  to compare the value of the sring ".equals" is used
     */
    public void display()
    {
        // to display or show the  data in Instrument ID and Instrument Name
        System.out.println("Here the Instrument Id  is:" + this.Instrument_ID);
        System.out.println("And the Instrument Name is:" + this.Instrument_Name);
        
        //and to show whether the user has entered the value in othe remaining datas
        if (this.Customer_Name.equals("") && this.Customer_Mobile_Number.equals("") && Customer_PAN == 0)
        {
            //if value not entered in any one of the above datas then it show the following message
            System.out.println("Please enter the value in Customer Name, Customer Mobile_no or Customer_PAN as it is null or zero");
            
        }
        else
        {
            //if the value is entered then it show the entered data as output
            System.out.println("Customer_Name:" + this.Customer_Name);
            System.out.println("Customer_Mobile_Number:" + this.Customer_Mobile_Number);
            System.out.println("Customer_PAN_No:" + this.Customer_PAN);
        }
        
        
    }
}
