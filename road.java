
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.awt.geom.Area;



public class road extends JPanel implements ActionListener, KeyListener   {
    private int windowWidth = 600;
    private int windowHeight = 400;
    ball b = new ball();
    blocks bloc = new blocks();
    static int count = 0; // time
   


    

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
        
        
        g.setColor(Color.gray);
        g.fillRect(0, 250, 600, 250);

        g.drawLine(0, 250, 600, 250); // road

        g.setColor(Color.blue);
        bloc.drawBlock(g);

        if(count%100 == 0){ 
            System.out.println("test");

            bloc.generateBlocks(g);
        }


        if(b.press){ 
            b.ballJump(g);
        } 
        else{
            b.draw(g);
        }        

        //         (x,, y - side length, side length, side length)

    }


    public boolean compareDistances();
    

    


    public void keyPressed (KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE) {
            b.press = true;
        }
    }
    
    public void keyTyped (KeyEvent e) {}
    public void keyReleased (KeyEvent e) {}    
     
    

    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
   





   
    

