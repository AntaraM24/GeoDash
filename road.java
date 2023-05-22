
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.Timer.*;



 


public class road extends JPanel implements ActionListener  {
    private int objX = 600; // stores x of obstacle
    private int ballY; //stores y of character
    private int windowWidth = 600;
    private int windowHeight = 400;


    public road(){
        JFrame easel = new JFrame();
        easel.setSize(windowWidth, windowHeight);
        easel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        easel.add(this);
        easel.setVisible(true);


        javax.swing.Timer timer = new javax.swing.Timer(100, this);
        timer.start(); 

      
    }

    public void paintComponent (Graphics g){

        g.drawLine(0, 250, 600, 250); // road

        g.drawRect(objX, 240, 10, 10); // short obstacle
        g.drawRect(objX, 230, 10, 20); // tall obstacle
    
        //         (x,, y - side length, side length, side length)

        g.drawOval(100, ballY, 20, 20); // character

        




        objX -= 3;
        
    }
    

    public void actionPerformed(ActionEvent e) {
        repaint();
        
    }
    

        



    

    }
   





   
    

