
package travelandtourism;

import javax.swing.*; 
import java.awt.*;
import javax.swing.border.*;             //it is sub package of swing package 
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

    JButton login, signup , password;
    JTextField tfpassword ,tfusername;
    
    Login(){
        setSize(900,400);
        setLocation(250,200);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);   //all panel ke background color change krte he
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color (131,193,233));
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login1.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100,120,200,200);
        p1.add(image);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);
        
        JLabel lblusername = new JLabel("Username");      //through JLabel help we text over this frame
        lblusername.setBounds(60,20,100,25);
        lblusername.setFont(new Font ("SAN_SERIF", Font.PLAIN,20));     //edit font size   import java.awt.* package
        p2.add(lblusername);                              //  add over the p2
 
        tfusername = new JTextField();           // text type 
        tfusername.setBounds(60,60,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);                            //aboue p2
        
     
           JLabel lblpassword = new JLabel("Password");     
        lblpassword.setBounds(60,110,100,25);
        lblpassword.setFont(new Font ("SAN_SERIF", Font.PLAIN,20));     
        p2.add(lblpassword);                          
 
        tfpassword = new JTextField();         
        tfpassword.setBounds(60,150,300,30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);                            //aboue p2
        
          login = new JButton("Login");      // name login print over the button
        login.setBounds(60,200,130,30);   
        login.setBackground(new Color(133,193,233));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(133,193,233)));      //for LineBorder function use import swing.border.*;
        login.addActionListener(this);
        p2.add(login);
        
          signup = new JButton("Signup");      
        signup.setBounds(230,200,130,30);   
        signup.setBackground(new Color(133,193,233));
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color(133,193,233)));     
        signup.addActionListener(this);
        p2.add(signup);
        
          password = new JButton("Forget Password");      
        password.setBounds(150,250,130,30);   
        password.setBackground(new Color(133,193,233));
        password.setForeground(Color.WHITE);
        password.setBorder(new LineBorder(new Color(133,193,233)));    
        password.addActionListener(this);
        p2.add(password);
        
        JLabel text = new JLabel("Trouble in login...");             //label insert near to forgetpassword
        text.setBounds(300,250,150,20);
        text.setForeground(Color.BLACK);
        p2.add(text);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){
            try{
                String username = tfusername.getText();
                String pass = tfpassword.getText();
                String query = "select* from account where username = '"+username+"' AND password = '"+pass+"'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Loading(username);
                    
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect username or password");  //show popup
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else if(ae.getSource() == signup){
            setVisible(false);
            new Signup();
        }else{
            setVisible(false);
            new ForgetPassword();
        }
    }
    
    public static void main(String[] args) {
         new Login();
    }
    
}
