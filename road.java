import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.JFrame.*;
import java.awt.event.*;


public class road extends JPanel {
    //implements MouseListener,MouseMotionListener
   


    private JFrame myFrame;
    private ImageIcon myPic;


    public road(){
        myFrame = new JFrame("GeoDash");
        JFrame.setSize(30, 30);
        myFrame.add(this);
        
        

        // these eyes fit right on Einstein's head.  
        
       // addMouseListener(this);
       // addMouseMotionListener(this);
        myFrame.setVisible(true);


        
    }





   
    
}
