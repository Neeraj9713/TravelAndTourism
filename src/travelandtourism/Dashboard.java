
package travelandtourism;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Dashboard extends JFrame implements ActionListener {
    JButton logout;
    String username;
    JButton addPersonalDetails , viewPersonalDetails, updatePersonalDetails, checkpackages, bookpackages,viewpackages,viewhotels,destinations;
    JButton bookhotel, viewbookhotel, payment, Calculators, notepad, about,deletePersonalDetails;
    Dashboard(String username){
        this.username = username;
        
//        setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);    //for using full screen
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard2.png"));
        Image i2 = i1.getImage().getScaledInstance(70,40 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        
//        addPersonalDetails = new JButton("Add Personal Details");
//        addPersonalDetails.setBounds(0,65,300,41);
//        addPersonalDetails.setBackground(new Color(0,0,102));
//        addPersonalDetails.setForeground(Color.WHITE);
//        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
//        addPersonalDetails.setMargin(new Insets(0,0,0,55));
//        addPersonalDetails.addActionListener(this);
//        p2.add(addPersonalDetails);
        
        logout = new JButton(" Logout ");
        logout.setBounds(1070,10,300,40);
        logout.setBackground(new Color(0,0,102));
        logout.setForeground(Color.WHITE);
        logout.setFont(new Font("Tohoma", Font.BOLD,30));
        logout.setBorderPainted(false);
        logout.addActionListener(this);
        p1.add(logout);  
        
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,0,300,900);
        add(p2);
        
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,65,300,41);
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonalDetails.setMargin(new Insets(0,0,0,55));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,106,300,41);
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBounds(0,147,300,41);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        deletePersonalDetails = new JButton("Delete Personal Deatils");
        deletePersonalDetails.setBounds(0,188,300,41);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,30));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        checkpackages = new JButton("Check Package");
        checkpackages.setBounds(0,229,300,41);
        checkpackages.setBackground(new Color(0,0,102));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkpackages.setMargin(new Insets(0,0,0,105));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        
        bookpackages = new JButton("Book Package");
        bookpackages.setBounds(0,270,300,41);
        bookpackages.setBackground(new Color(0,0,102));
        bookpackages.setForeground(Color.WHITE);
        bookpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookpackages.setMargin(new Insets(0,0,0,113));
        bookpackages.addActionListener(this);
        p2.add(bookpackages);
        
        viewpackages = new JButton("View Package");
        viewpackages.setBounds(0,311,300,41);
        viewpackages.setBackground(new Color(0,0,102));
        viewpackages.setForeground(Color.WHITE);
        viewpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpackages.setMargin(new Insets(0,0,0,113));
        viewpackages.addActionListener(this);
        p2.add(viewpackages);
        
        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0,352,300,41);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setMargin(new Insets(0,0,0,127));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotel = new JButton("Book Hotels");
        bookhotel.setBounds(0,393,300,41);
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotel.setMargin(new Insets(0,0,0,128));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        viewbookhotel = new JButton("View Book Hotels");
        viewbookhotel.setBounds(0,434,300,41);
        viewbookhotel.setBackground(new Color(0,0,102));
        viewbookhotel.setForeground(Color.WHITE);
        viewbookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewbookhotel.setMargin(new Insets(0,0,0,78));
        viewbookhotel.addActionListener(this);
        p2.add(viewbookhotel);
        
        destinations = new JButton("Destination");
        destinations.setBounds(0,475,300,41);
        destinations.setBackground(new Color(0,0,102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        destinations.setMargin(new Insets(0,0,0,130));
        destinations.addActionListener(this);
        p2.add(destinations);
        
        payment = new JButton("Payment");
        payment.setBounds(0,516,300,41);
        payment.setBackground(new Color(0,0,102));
        payment.setForeground(Color.WHITE);
        payment.setFont(new Font("Tahoma",Font.PLAIN,20));
        payment.setMargin(new Insets(0,0,0,130));
        payment.addActionListener(this);
        p2.add(payment);
        
        Calculators = new JButton("Calculators");
        Calculators.setBounds(0,557,300,41);
        Calculators.setBackground(new Color(0,0,102));
        Calculators.setForeground(Color.WHITE);
        Calculators.setFont(new Font("Tahoma",Font.PLAIN,20));
        Calculators.setMargin(new Insets(0,0,0,130));
        Calculators.addActionListener(this);
        p2.add(Calculators);
        
        notepad = new JButton("Notepad");
        notepad.setBounds(0,598,300,41);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,130));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about = new JButton("About");
        about.setBounds(0,639,300,41);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,130));
        about.addActionListener(this);
        p2.add(about);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism System");
        text.setBounds(400,70,1000,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.PLAIN,55));
        image.add(text);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addPersonalDetails){
            new AddCustomer(username);
        }
        else if(ae.getSource() == viewPersonalDetails){
            new ViewCustomer(username);
        }
        else if(ae.getSource() == updatePersonalDetails){
            new UpdateCustomer(username);
        }    
        else if(ae.getSource()== checkpackages){
            new CheckPackage();
        }
        else if(ae.getSource() == bookpackages){
            new BookPackage(username);
        }
        else if(ae.getSource() == viewpackages){
            new ViewPackage(username);
        }
        else if(ae.getSource() == viewhotels){
            new CheckHotels();
        }
        else if(ae.getSource() == destinations){
            new Destinations();
        }
        else if(ae.getSource() == bookhotel){
            new BookHotel(username);
        }
        else if(ae.getSource() == viewbookhotel){
            new ViewBookedHotel(username);
        }
        else if(ae.getSource() == payment){
            new Payment();
        }
        else if(ae.getSource() == Calculators){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == about){
            new About();
        }
        else if(ae.getSource() == deletePersonalDetails){
            new DeleteDetails(username);
        }
        
        else if(ae.getSource() == logout ){
            setVisible(false);
            new Login(); 
        }

    }

    public static void main(String[] args) {
        new Dashboard("");
    }
}
