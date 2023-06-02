
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.awt.geom.Area;
import java.lang.Math;



public class road extends JPanel implements ActionListener, KeyListener   {
    private int windowWidth = 600;
    private int windowHeight = 400;
    ball b = new ball();

    blocks bloc = new blocks(600, "none");
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

    

    ArrayList<blocks> blockList = new ArrayList<blocks>();
    public void paintComponent (Graphics g){
        
        g.setColor(Color.white);
        g.fillRect(0, 0, 600, 400);

        count++;
        
        g.setColor(Color.gray);
        g.fillRect(0, 250, 600, 250);

        g.drawLine(0, 250, 600, 250); // road

        g.setColor(Color.blue);

       
        bloc.updateBlockArray(blockList);
        bloc.drawBlocks(blockList, g);
        //bloc.drawBlock(g);

        // if(count%100 == 0){ 
        //     System.out.println("test");

        //     bloc.generateBlocks(g);
        // }

        

        if(b.press){ 
            b.ballJump(g);
        } 
        else{
            b.draw(g);
        }        

        //         (x,, y - side length, side length, side length)


    }

    public boolean compareDistances(){
        // height of block: 10. getObjX();
        // x of ball: 100
        //g.drawLine(b.getCenterX(), b.getCenterY(), bloc.get(), BlocY);

        //int distance = ((b.getCenterX() - bloc.getCenterX())^2 + (b.getCenterY() - bloc.getCenterY())^2)

 


        return true;

    }

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
   





   
    

