
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.Timer.*;



 


public class road extends JPanel implements ActionListener, KeyListener   {
    private int objX = 600; // stores x of obstacle
    private int ballY = 230; //stores y of character
    private int windowWidth = 600;
    private int windowHeight = 400;


    ball b = new ball();
    

    public road(){
        JFrame easel = new JFrame();
        easel.setSize(windowWidth, windowHeight);
        easel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        easel.add(this);
        addKeyListener(this);  
        easel.setVisible(true);

        javax.swing.Timer timer = new javax.swing.Timer(15, this);
        timer.start(); 
    }

    // overriding the keyPressed() method of KeyListener interface where we set the text of the label when key is pressed  
    public void keyPressed (KeyEvent e) {    
        b.setText ("Key Pressed");    
    }    
// overriding the keyReleased() method of KeyListener interface where we set the text of the label when key is released  
    public void keyReleased (KeyEvent e) {    
        b.setText ("Key Released");    
    }    
// overriding the keyTyped() method of KeyListener interface where we set the text of the label when a key is typed  
    public void keyTyped (KeyEvent e) {    
        b.setText ("Key Typed");    
    }    

    public void paintComponent (Graphics g){

        g.drawLine(0, 250, 600, 250); // road

        g.drawRect(objX, 240, 10, 10); // short obstacle
        g.drawRect(objX, 230, 10, 20); // tall obstacle
    
        //         (x,, y - side length, side length, side length)

        g.drawOval(100, ballY, 20, 20); // character

        objX -= .5;  
    }
    

    public void actionPerformed(ActionEvent e) {
        repaint();
        
    }


    

        



    

    }
   





   
    

