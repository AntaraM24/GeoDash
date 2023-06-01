import java.awt.*;
import java.awt.Color;



public class ball {

    int num = 0; // for animating jumping ball in paintComponent
    public boolean press = false; //if space key is pressed, true.

    static private int ballY = 230; //stores y of character

    public void draw (Graphics g){
        g.setColor(Color.magenta);
        g.fillOval(100, ballY, 20, 20);
        g.setColor(Color.black);
        g.drawOval(100, ballY, 20, 20); // character
        
    }

    public int getCenterX(){
        return 110;
    }

    public int getCenterY(){
        return ballY+10;
    }


    public void setBallY(int num){
        ballY+= num;
    }

    public void ballJump(Graphics g){
        if(num <=25){
            setBallY(-4);
            draw(g);
            num++;
        }
        else if(num > 25  && num <= 51){
            setBallY(4);
            draw(g);
            num++;  
        }
        else{
            press = false;
            num = 0;
        }

 
    }





     
}
