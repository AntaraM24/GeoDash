
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class road extends JPanel implements ActionListener, KeyListener   {
    private int windowWidth = 600;
    private int windowHeight = 400;
    ball b = new ball();
    blocks bloc = new blocks();
    static int count = 0; // time
    public boolean press = false; //if space key is pressed, true.
    int num = 0; // for animating jumping ball in paintComponent
   


    

    public road(){
        JFrame easel = new JFrame();
        easel.setSize(windowWidth, windowHeight);
        easel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        easel.add(this);
        addKeyListener(this);  
        setFocusable(true);
        easel.setVisible(true);

        
        javax.swing.Timer timer = new javax.swing.Timer(15, this);
        timer.start(); 
    }

    public int getTime(){
        return count;
    }

    

    public void paintComponent (Graphics g){
        count++;
        

        g.drawLine(0, 250, 600, 250); // road
        bloc.drawBlock(g);

        if(count%100 == 0){
            bloc.generateBlocks(g);
        }



        
        if(press){ // jumping ball animation , i tried doing it in ball class but it wasn't working idk why
            if(num <=25){
                b.setBallY(-2);
                b.draw(g);
                num++;
            }
            else if(num > 25  && num <= 51){
                b.setBallY(2);
                b.draw(g);
                num++;  
            }
            else{
                press = false;
                num = 0;
            }
        } 
        else{
            b.draw(g);
        }
        

        
        //         (x,, y - side length, side length, side length)

        
        
    }
    public void keyPressed (KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_SPACE) {
            press = true;


            
        }

    }
    
    public void keyTyped (KeyEvent e) {
    }
    public void keyReleased (KeyEvent e) { 

    }    
     
    

    public void actionPerformed(ActionEvent e) {
        repaint();
        
    }


    

        



    
}
   





   
    

