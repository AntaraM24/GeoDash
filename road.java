
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.Timer.*;


public class road extends JPanel implements ActionListener, KeyListener   {
    private int windowWidth = 600;
    private int windowHeight = 400;
    ball b = new ball();
    blocks bloc = new blocks();
    int count = 0;


    

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

    

    public void paintComponent (Graphics g){
        count++;

        g.drawLine(0, 250, 600, 250); // road

        bloc.drawBlock(g);

        if(count%100 == 0){
            bloc.generateBlocks(g);
        }

        b.draw(g);
        
        //         (x,, y - side length, side length, side length)

        
        
    }
    public void keyPressed (KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_SPACE) {
            b.jump(getGraphics());
            
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
   





   
    

