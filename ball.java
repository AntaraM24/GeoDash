import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.Timer.*;



public class ball{
    
    private int ballY = 230; //stores y of character

    

    
    

    

    public void draw (Graphics g){
        g.drawOval(100, ballY, 20, 20); // character



    }

    public void jump(Graphics g){
        ballY = 210;
        draw(g);
        ballY = 190;
        draw(g);
        ballY = 170;
        draw(g);
        ballY = 150;
        draw(g);
        ballY = 0;
        draw(g);
        ballY = 220;
        draw(g);

    }

     
}
