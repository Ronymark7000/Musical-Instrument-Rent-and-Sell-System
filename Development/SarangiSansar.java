 
/**
 * Write a description of class SarangiSansar here.
 * 
 * @author (Rohit Ratna Shakya)
 * @version (Coursework_2)
 */
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
public class SarangiSansar implements ActionListener
{
    JFrame frame;
    JLabel Title, Heading1, Heading2, subHeading1, subHeading2, instName, chargePerDay, custName, custMob, custPAN, rentDate, returnDate, noOfRentDays, sellName, price, scustName, scustMob, scustPAN, sellDate, discountPer;
    JButton rAdd, Rent, Return, Clear, sAdd, Sell, rDisplay, sDisplay;
    JTextField instNametxt, chargePerDaytxt, custNametxt, custMobtxt, custPANtxt, noOfRentDaystxt, sellNametxt, pricetxt, scustNametxt, scustMobtxt, scustPANtxt, discountPertxt ;   
    JComboBox Combo1, Combo2, Combo3, Combo11, Combo22, Combo33, Combo111, Combo222, Combo333;
    public SarangiSansar()
    {
        /*
        Assigning Frame 
         */
        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(1300,850);
        frame.setLayout(null);
        frame.setTitle("Sarangi Sansar - Instrument Sell and Rent");
        
        
        /*
          Setting up the Label
         */
        //Labels for all the headings
        Title = new JLabel("Sarangi Sansar");
        Heading1 = new JLabel("Instrument To Rent");
        Heading2 = new JLabel("Instrument To Sell");
        subHeading1 = new JLabel("Customer Rent Details");
        subHeading2 = new JLabel("Customer Sell Details");
        
        //Labels for Instrument to Rent 
        instName = new JLabel("Instrument Name :");
        chargePerDay = new JLabel("Charge Per Day :");
        custName= new JLabel("Customer Name :");
        custMob = new JLabel("Customer Mobile Number :");
        custPAN = new JLabel("Customer PAN Number :");
        rentDate = new JLabel("Rent Date :");
        returnDate = new JLabel("Return Date :");
        noOfRentDays = new JLabel("Number of Rent Days :");
        
        //Labels for Instrument to Sell
        sellName = new JLabel("Instrument Name :");
        price = new JLabel("Price :");
        scustName= new JLabel("Customer Name :");
        scustMob = new JLabel("Customer Mobile Number :");
        scustPAN = new JLabel("Customer PAN Number :");
        sellDate = new JLabel("Sell Date :");
        discountPer = new JLabel("Discount Percentage :");
        
        /*
         Setting up all the TextFields
         */
        //TextFileds for Instrument To Rent
        instNametxt = new JTextField();
        chargePerDaytxt = new JTextField();
        custNametxt = new JTextField();
        custMobtxt = new JTextField();
        custPANtxt = new JTextField();
        noOfRentDaystxt = new JTextField();
        
        //TextFileds for Instrument To Sell
        sellNametxt = new JTextField();
        pricetxt = new JTextField();
        scustNametxt = new JTextField();
        scustMobtxt = new JTextField();
        scustPANtxt = new JTextField();
        discountPertxt = new JTextField();
        
        /*
          Setting ComboBox with Array's
          First 3 combo box are for Rent date's Combo box
         */
        
        //Combo Box for Day
        String [] Day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        Combo1 = new JComboBox<String>(Day);
        
        //Combo Box for Months
        String [] Date = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        Combo2 = new JComboBox<String>(Date);
        
        //Combo Box for Year 
        String [] Year = {"2015","2016","2017","2018","2019","2020","2021","2022"};
        Combo3 = new JComboBox<String>(Year);
        
        /*
          These 3 are for Return date's Combo Box
         */
        Combo11 = new JComboBox<String>(Day);//Combo Box for Day
        Combo22 = new JComboBox<String>(Date);//Combo Box for Months
        Combo33 = new JComboBox<String>(Year);//Combo Box for Year 
        
        /*
         These 3 are for Sell date's Combo Box
         */
        Combo111 = new JComboBox<String>(Day);//Combo Box for Day
        Combo222 = new JComboBox<String>(Date);//Combo Box for Months
        Combo333 = new JComboBox<String>(Year);//Combo Box for Year 
        
        
        /*
         * JButton defined as global variable
          Creating all the Buttons needed in the GUI
         */
        rAdd = new JButton("Add to Rent");
        Rent = new JButton("Rent");
        Return = new JButton("Return");
        Clear = new JButton("Clear");
        sAdd = new JButton("Put on Sell");
        Sell = new JButton("Sell");
        rDisplay = new JButton("Display for Rent");
        sDisplay = new JButton("Display for Sell");
        
        
        /*
          Changing Background colors of all that is required
         */
        Color bgColor = new Color(197, 239, 253);
        frame.getContentPane().setBackground(bgColor);//Changing BgColor of Frame's Background 
        
        Color rAddBtn = new Color(223, 239, 240);
        rAdd.setBackground(rAddBtn);//Changing BgColor of Add to Rent Button
        
        Color RentBtn = new Color(223, 239, 240);
        Rent.setBackground(RentBtn);//Changing BgColor of Rent Button
        
        Color ReturnBtn = new Color(223, 239, 240);
        Return.setBackground(ReturnBtn);//Changing BgColor of Rent Button
        
        Color ClearBtn = new Color(223, 239, 240);
        Clear.setBackground(ClearBtn);//Changing BgColor of Clear Button
        
        Color sAddBtn = new Color(223, 239, 240);
        sAdd.setBackground(sAddBtn);//Changing BgColor of Put on Sell Button
            
        Color SellBtn = new Color(223, 239, 240);
        Sell.setBackground(SellBtn);//Changing BgColor of Sell Button
        
        Color rDisplayBtn = new Color(223, 239, 240);
        rDisplay.setBackground(rDisplayBtn);//Changing BgColor of Display for Rent Button
        
        Color sDisplayBtn = new Color(223, 239, 240);
        sDisplay.setBackground(sDisplayBtn);//Changing BgColor of Display for Sell Button
        
        //Setting up Fonts
        
        //changing fonts for all the headings
        Title.setFont(new Font("Helvetica BOLD", Font.BOLD, 30));
        Heading1.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
        Heading2.setFont(new Font("Helvetica BOLD", Font.BOLD, 20));
        subHeading1.setFont(new Font("Helvetica", Font.BOLD, 18));
        subHeading2.setFont(new Font("Helvetica", Font.BOLD, 18));
        
        //Changing fonts for all labels of Intrument to Rent
        instName.setFont(new Font("Helvetica", Font.BOLD, 16));
        chargePerDay.setFont(new Font("Helvetica", Font.BOLD, 16));
        custName.setFont(new Font("Helvetica", Font.BOLD, 16));
        custMob.setFont(new Font("Helvetica", Font.BOLD, 16));
        custPAN.setFont(new Font("Helvetica", Font.BOLD, 16));
        rentDate.setFont(new Font("Helvetica", Font.BOLD, 16));
        returnDate.setFont(new Font("Helvetica", Font.BOLD, 16));
        noOfRentDays.setFont(new Font("Helvetica", Font.BOLD, 16));
        
        //Changing fonts for all labels of Intrument to Sell
        sellName.setFont(new Font("Helvetica", Font.BOLD, 16));
        price.setFont(new Font("Helvetica", Font.BOLD, 16));
        scustName.setFont(new Font("Helvetica", Font.BOLD, 16));
        scustMob.setFont(new Font("Helvetica", Font.BOLD, 16));
        scustPAN.setFont(new Font("Helvetica", Font.BOLD, 16));
        sellDate.setFont(new Font("Helvetica", Font.BOLD, 16));
        discountPer.setFont(new Font("Helvetica", Font.BOLD, 16));
        
        /*
         Setting up ActionListener 
         */
        
        //ActionListener for Textfields
        chargePerDaytxt.addActionListener(this);
        
        //ActionListener for Buttons
        rAdd.addActionListener(this); 
        Rent.addActionListener(this); 
        Return.addActionListener(this);
        Clear.addActionListener(this);
        sAdd.addActionListener(this);
        Sell.addActionListener(this);
        rDisplay.addActionListener(this);
        sDisplay.addActionListener(this);
        
        /*
          Adding all JFrame's
         */
        //Frames of all the headings
        frame.add(Title);
        frame.add(Heading1);
        frame.add(Heading2);
        frame.add(subHeading1);
        frame.add(subHeading2);
        
        //Frames of Instrument To Rent
        frame.add(instName);
        frame.add(instNametxt);
        frame.add(chargePerDay);
        frame.add(chargePerDaytxt);
        frame.add(rAdd);
        frame.add(custName);
        frame.add(custNametxt);
        frame.add(custMob);
        frame.add(custMobtxt);
        frame.add(custPAN);
        frame.add(custPANtxt);
        frame.add(rentDate);
        frame.add(returnDate);
        frame.add(Combo1);
        frame.add(Combo2);
        frame.add(Combo3);
        frame.add(noOfRentDays);
        frame.add(Combo11);
        frame.add(Combo22);
        frame.add(Combo33);
        frame.add(noOfRentDaystxt);
        frame.add(Rent);
        frame.add(rDisplay);
        frame.add(Return);
        
        //Frames of Instrument To Sell
        frame.add(sellName);
        frame.add(sellNametxt);
        frame.add(price);
        frame.add(pricetxt);
        frame.add(sAdd);
        frame.add(scustName);
        frame.add(scustNametxt);
        frame.add(scustMob);
        frame.add(scustMobtxt);
        frame.add(scustPAN);
        frame.add(scustPANtxt);
        frame.add(sellDate);
        frame.add(Combo111);
        frame.add(Combo222);
        frame.add(Combo333);
        frame.add(discountPer);
        frame.add(discountPertxt);
        frame.add(Sell);
        frame.add(sDisplay);
        frame.add(Clear);
        
        /*
         Positioning the Co-ordinates of the Frames according to (x-axis, y-axis, width, height)
         */
        //Position of all the headings
        Title.setBounds(510, 20, 329, 57);
        Heading1.setBounds(250, 110, 235, 33);
        Heading2.setBounds(837, 110, 225, 33);
        subHeading1.setBounds(255, 320, 225, 34);
        subHeading2.setBounds(838, 320, 225, 34);
        
        //Positon of Instrument To Rent
        instName.setBounds(160, 160, 180, 22);
        instNametxt.setBounds(400, 160, 180, 32);
        chargePerDay.setBounds(160, 210, 180, 22);
        chargePerDaytxt.setBounds(400, 210, 180, 32);
        rAdd.setBounds(290, 262, 100, 35);
        Return.setBounds(340, 262, 75, 35);
        
        //Positon of Customer's Rent Detail
        custName.setBounds(160, 370, 180, 22);
        custNametxt.setBounds(400, 370, 180, 32);
        custMob.setBounds(160, 420, 240, 22);
        custMobtxt.setBounds(400, 420, 180, 32);
        custPAN.setBounds(160, 470, 240, 22);
        custPANtxt.setBounds(400, 470, 180, 32);
        rentDate.setBounds(160, 520, 180, 22);
        Combo1.setBounds(340, 520, 60, 25);
        Combo2.setBounds(410, 520, 75, 25);
        Combo3.setBounds(494, 520, 85, 25);
        returnDate.setBounds(160, 570, 180, 22);
        Combo11.setBounds(340, 570, 60, 25);
        Combo22.setBounds(410, 570, 75, 25);
        Combo33.setBounds(494, 570, 85, 25);
        noOfRentDays.setBounds(160, 620, 180,22);
        noOfRentDaystxt.setBounds(400, 620, 180, 32);
        Rent.setBounds(205, 670, 75, 35);
        rDisplay.setBounds(295, 670 ,130, 35);
        Return.setBounds(440, 670, 75, 35);
        
        //Position of Instrument To Sell
        sellName.setBounds(740, 160, 180, 22);
        sellNametxt.setBounds(960, 160, 180, 32);
        price.setBounds(740, 210, 180, 22);
        pricetxt.setBounds(960, 210, 180, 32);
        sAdd.setBounds(850, 263, 100, 35);
        
        //Position of Customer Sell Details
        scustName.setBounds(740, 370, 180, 22);
        scustNametxt.setBounds(960, 370, 180, 32);
        scustMob.setBounds(740, 420, 240, 22);
        scustMobtxt.setBounds(960, 420, 180, 32);
        scustPAN.setBounds(740, 470, 240, 22);
        scustPANtxt.setBounds(960, 470, 180, 32);
        sellDate.setBounds(740, 520 ,180, 22);
        Combo111.setBounds(900, 520, 60, 25);
        Combo222.setBounds(970, 520, 75, 25);
        Combo333.setBounds(1052, 520, 85, 25);
        discountPer.setBounds(740, 570, 180, 22);
        discountPertxt.setBounds(960, 570, 180, 32);
        Sell.setBounds(825, 670, 75, 35);
        sDisplay.setBounds(915, 670 ,120, 35);
        Clear.setBounds(1150, 750, 75, 35);
    }
    
    //Creating an array List
    ArrayList<Instrument> List = new ArrayList<Instrument>();
    
    /*
     Method to implement ActionListener
     */
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == rAdd)
        {            
            boolean ItemAdd = false; //setting the value of a new variable false for loop exectuion...
            
            /*
             Checking if the TextFields are filled or not
             */
            if(instNametxt.getText().isEmpty() || chargePerDaytxt.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "The required details must be filled up."); //Displays the message if the TextFields are left empty
            }
            else 
            {
                //exception handling begins
                try
                {
                    String Instrument_Name = instNametxt.getText();
                    int Charge_Per_Day = Integer.parseInt(chargePerDaytxt.getText());//getter methods
                    
                    if(List.isEmpty())
                    {
                        Instrument_to_Rent ObjA= new Instrument_to_Rent(Instrument_Name, Charge_Per_Day);//Creating Object and Passing Parameters to the Object
                        List.add(ObjA);//Adding Object to the List
                        JOptionPane.showMessageDialog(frame, instNametxt.getText()+ " added to rent"); //Dispalying Insturment added message
                    }
                    else
                    {
                        for(Instrument i : List)//Creating Lopp
                        {
                            if(i instanceof Instrument_to_Rent) //itirating object
                            {
                                Instrument_to_Rent ObjAdd = (Instrument_to_Rent) i;//downcasting
                                if(i.getInstrument_Name().equals(instNametxt.getText()))//Checking if the instrument is already added or not
                                {
                                    ItemAdd = true;
                                    JOptionPane.showMessageDialog(frame, "Already Added to rent");
                                    break;
                                }
                            }
                        }
                        if(ItemAdd == false)
                        {
                            Instrument_to_Rent ObjA = new Instrument_to_Rent(Instrument_Name, Charge_Per_Day);
                            List.add(ObjA);
                            JOptionPane.showMessageDialog(frame, instNametxt.getText()+ " added to rent");
                        }
                    }
                }
                
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(frame,"Invalid Input. Please enter in numbers");
                }   
            }
        }
        
       
        if(e.getSource() == Rent)
        {
            boolean ItemRent = false;
            if(custNametxt.getText().isEmpty() || custMobtxt.getText().isEmpty() || custPANtxt.getText().isEmpty() || noOfRentDaystxt.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Enter all the details."); 
            }
            else
            {
                for(Instrument i : List)
                {
                    if(i instanceof Instrument_to_Rent)
                    {
                        Instrument_to_Rent ObjR = (Instrument_to_Rent) i;
                        if((i.getInstrument_Name()).equals(instNametxt.getText()))
                        {
                            ItemRent = true;
                        }
                    }
                }
                try
                {
                    if(ItemRent == false)
                    {
                        JOptionPane.showMessageDialog(frame, "Add an Instrument First"); //Dispalying That the list is empty
                    }
                    else
                    {
                        String Customer_Name = custNametxt.getText();
                        String Customer_Mobile_Number = custMobtxt.getText();
                        int Customer_PAN = Integer.parseInt(custPANtxt.getText());
                        String Date_of_Rent = Combo1.getSelectedItem()+"-"+Combo2.getSelectedItem()+"-"+Combo3.getSelectedItem();
                        String Date_of_Return = Combo11.getSelectedItem()+"-"+Combo22.getSelectedItem()+"-"+Combo33.getSelectedItem();
                        int Number_of_days = Integer.parseInt(noOfRentDaystxt.getText());//getter methods
                        for(Instrument i : List)
                        {
                            if(i instanceof Instrument_to_Rent)//checking object
                            {
                                if((i.getInstrument_Name()).equals(instNametxt.getText()))
                                {
                                    Instrument_to_Rent ObjR  = (Instrument_to_Rent)i;    //Downcasting                     
                                    if(ObjR.getIs_rented() == false)
                                    {
                                        //shows renting process of the instrument by the customer
                                        ObjR.Instrument_Rent(Customer_Name, Customer_Mobile_Number, Customer_PAN, Date_of_Rent, Date_of_Return, Number_of_days);
                                        
                                        JOptionPane.showMessageDialog(frame, ObjR.getInstrument_Name()+" is rented successfully");
                                    }
                                    else
                                    {
                                        //process to show that the item is already rented by another customer
                                        JOptionPane.showMessageDialog(frame, "The instrument has been rented by:" + "\n" + "\n"+
                                        "Customer Name : "+ObjR.getCustomer_Name()+ "\n"+
                                        "Customer Mobile Number : "+ObjR.getCustomer_Mobile_Number()+ "\n"+
                                        "Return Date: "+ObjR.getDate_of_Return());
                                    }
                                }                    
                            }
                        }    
                    }
                }
                catch(NumberFormatException ex)//exception handaling
                {
                    JOptionPane.showMessageDialog(frame,"Invalid Input. Please enter in numbers");
                }   
            }
        }
        
        
        
        if(e.getSource() == Return)
        {
            {
            if((instNametxt.getText()).isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Add an Instrument Name First.");
            }
            else
            {
                for(Instrument i : List)
                {                
                    String Instrument_Name = instNametxt.getText();
                    if(i instanceof Instrument_to_Rent)
                    {
                        if((i.getInstrument_Name()).equals(instNametxt.getText()))
                        {
                            Instrument_to_Rent ObjRe = (Instrument_to_Rent) i;
                            if(ObjRe.getIs_rented() == false)
                            {
                                JOptionPane.showMessageDialog(frame, "The instrument '"+ ObjRe.getInstrument_Name()+"' is not yet rented.");
                            }
                            else
                            {
                                ObjRe.Return();    
                                JOptionPane.showMessageDialog(frame, "The instrument '"+ObjRe.getInstrument_Name()+"' is returned successfully!");
                            }
                        }
                    }
                }
            }
        }
        }
       
        if(e.getSource() == Clear)
        {
            instNametxt.setText("");
            chargePerDaytxt.setText("");
            custNametxt.setText("");
            custMobtxt.setText("");
            custPANtxt.setText("");
            noOfRentDaystxt.setText("");
            sellNametxt.setText("");   
            pricetxt.setText(""); 
            scustNametxt.setText("");   
            scustMobtxt.setText("");     
            scustPANtxt.setText("");     
            discountPertxt.setText(""); 
        }
        
        if(e.getSource() == sAdd)
        {
            boolean ItemASell = false; //setting the value of a new variable false for loop exectuion...
            
            /*
             Checking if the TextFields are filled or not
             */
            if(sellNametxt.getText().isEmpty() || pricetxt.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "The required details must be filled up."); //Displays the message if the TextFields are left empty
            }
            else
            {
                try
                {
                    String Instrument_Name = sellNametxt.getText();
                    double Price = Double.parseDouble(pricetxt.getText());//getter methods
                    
                    if(List.isEmpty())
                    {
                        Instrument_to_Sell ObjS= new Instrument_to_Sell(Instrument_Name, Price);//Creating Object and Passing Parameters to the Object
                        List.add(ObjS);//Adding Object to the List
                        JOptionPane.showMessageDialog(frame, sellNametxt.getText()+ " kept for Sell"); //Dispalying Insturment added message
                    }
                    else
                    {
                        for(Instrument i : List)
                        {
                            if(i instanceof Instrument_to_Sell)
                            {
                                Instrument_to_Sell ObjSell = (Instrument_to_Sell) i;
                                if(i.getInstrument_Name().equals(sellNametxt.getText()))
                                {
                                    ItemASell = true;
                                    JOptionPane.showMessageDialog(frame, "Already Kept for Sell");
                                    break;
                                }
                            }
                        }
                        if(ItemASell == false)
                        {
                            Instrument_to_Sell ObjS = new Instrument_to_Sell(Instrument_Name, Price);
                            List.add(ObjS);
                            JOptionPane.showMessageDialog(frame, sellNametxt.getText()+" added to Sell");
                        }
                    }
                }
                
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(frame,"Invalid Input. Please enter in numbers");
                }   
            }
        }
        
        if(e.getSource() == Sell)
        {
            boolean ItemSell = false; //setting the value of a new variable false for loop exectuion...
            
            /*
             Checking if the TextFields are filled or not
             */
            if((scustNametxt.getText()).isEmpty() || (scustMobtxt.getText()).isEmpty() || (scustPANtxt.getText()).isEmpty() || (discountPertxt.getText()).isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Enter all the details.");
            }
            else
            {
                for(Instrument i : List)
                {
                    if(i instanceof Instrument_to_Sell)
                    {
                        Instrument_to_Sell SoldObj = (Instrument_to_Sell) i;
                        if((i.getInstrument_Name()).equals(sellNametxt.getText()))
                        {
                            ItemSell = true;
                        }
                    }
                }
                try
                {
                    if(ItemSell == false)
                    {
                        JOptionPane.showMessageDialog(frame, "Add a Selling Instrument First"); //Dispalying That the list is empty
                    }
                    else
                    {
                        String Customer_Name = scustNametxt.getText();
                        String Customer_Mobile_Number = scustMobtxt.getText();
                        int Customer_PAN = Integer.parseInt(scustPANtxt.getText());
                        String Sell_date = Combo111.getSelectedItem()+"-"+Combo222.getSelectedItem()+"-"+Combo333.getSelectedItem();            
                        double discount_percent = Double.parseDouble(discountPertxt.getText());                        
                        for(Instrument i : List)
                        {
                            if(i instanceof Instrument_to_Sell)
                            {

                                if((i.getInstrument_Name()).equals(sellNametxt.getText()))
                                {
                                    Instrument_to_Sell SoldObj  = (Instrument_to_Sell)i;
                                    if(SoldObj.getIs_Sold() == false)
                                    {
                                        SoldObj.Instrument_Sell(Customer_Name, Customer_Mobile_Number, Customer_PAN,Sell_date, discount_percent);
                                    
                                        JOptionPane.showMessageDialog(frame, SoldObj.getInstrument_Name()+" has been sold sucessfully");
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(frame, "The instrument has been sold to:" + "\n"+ "\n"+
                                        "Customer Name : " + SoldObj.getCustomer_Name()+ "\n"+
                                        "Customer Mobile Number : " + SoldObj.getCustomer_Mobile_Number()+ "\n"+
                                        "Customer PAN Number : " + SoldObj.getCustomer_PAN());
                                    }
                                }                    
                            } 
                        }
                    }
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(frame, "Invalid Input. Please enter in numbers");
                }
            }
        }
        
        //for dispaly button
        if(e.getSource() == rDisplay)
        {
            boolean disR = false;
            if((instNametxt.getText()).isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Please enter the Instrument name.");
            }
            else
            {
                for(Instrument i : List)
                {
                    if(i instanceof Instrument_to_Rent)
                    {
                        Instrument_to_Rent ObjR = (Instrument_to_Rent) i;
                        if((ObjR.getInstrument_Name()).equals(instNametxt.getText()))
                        {
                            disR = true;
                        }
                    }
                }
                if(disR == true)
                {
                    String Instrument_Name = instNametxt.getText();                    
                    for(Instrument i : List)
                    {
                        if(i instanceof Instrument_to_Rent)
                        {
                            if((i.getInstrument_Name()).equals(instNametxt.getText()))
                            {                        
                                Instrument_to_Rent rDisplay = (Instrument_to_Rent)i;
                                rDisplay.display();
                            }
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(frame, instNametxt.getText()+"' is not added");
                }
            }
        }
        
         if(e.getSource() == sDisplay)
        {
            boolean disS = false;
            if((sellNametxt.getText()).isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Please enter an Selling Instrument name.");
            }
            else
            {
                for(Instrument i : List)
                {
                    if(i instanceof Instrument_to_Sell)
                    {
                        Instrument_to_Sell ObjR = (Instrument_to_Sell) i;
                        if((ObjR.getInstrument_Name()).equals(sellNametxt.getText()))
                        {
                            disS = true;
                        }
                    }
                }
                if(disS == true)
                {
                    String Instrument_Name = sellNametxt.getText();                    
                    for(Instrument i : List)
                    {
                        if(i instanceof Instrument_to_Sell)
                        {
                            if((i.getInstrument_Name()).equals(sellNametxt.getText()))
                            {                        
                                Instrument_to_Sell sDisplay = (Instrument_to_Sell)i;
                                sDisplay.display();
                            }
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(frame, sellNametxt.getText()+"' is not added on sell");
                }
            }
        }
    }
    public static void main(String[]args)
    {
        new SarangiSansar();
    }
}
    