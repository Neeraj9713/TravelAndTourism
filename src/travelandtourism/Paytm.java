
package travelandtourism;
import javax.swing.*;
import java.awt.event.*;

public class Paytm extends JFrame implements ActionListener {
    
    Paytm(){
        setBounds(300,100,800,600);
        
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        
        try{
            pane.setPage("http://paytm.com/rent-payment");     //paytm Page link
            
        }catch(Exception e){
            pane.setContentType("text/html");
            pane.setText("<html>Could not load, Error 404</html>");
            
        }
        JScrollPane sp = new JScrollPane(pane);          //for page scroll
        getContentPane().add(sp);
        
        JButton back = new JButton("Back");
        back.setBounds(610,20,80,40);
        back.addActionListener(this);
        pane.add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Payment();
    }
    
    public static void main(String[] args) {
        new Paytm();
    }
}
