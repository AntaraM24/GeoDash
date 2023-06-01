import java.awt.*;


public class ball {

    road r = new road();
    
    static private int ballY = 230; //stores y of character

    public void draw (Graphics g){
        g.drawOval(100, ballY, 20, 20); // character
    }


    public void setBallY(int num){
        ballY+= num;
    }

    public void jump(Graphics g){
 
    }





     
}
