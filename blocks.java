import java.awt.*;
import java.util.*;


public class blocks {

    private int objX = 600; // stores x of obstacle
    //int nextBlocks[10];




    public void drawBlock (Graphics g){
        if(objX <= 0){     
            //this is for deleting the blocks that re at the end of the board
        }
        g.drawRect(objX, 240, 10, 10); // short obstacle
       
        objX -= .5;  
    }

     public void drawTallBlock (Graphics g){
        if(objX <= 0){
        }
        g.drawRect(objX, 230, 10, 20); // tall obstacle

        objX -= .5;  
    }

    public void generateBlocks(Graphics g){
        //600 length
        System.out.println("test");
       
            int num = (int)Math.random()*2;

            if (num == 0){
                System.out.println("1");
                drawBlock(g);
            }else if (num == 1){
                System.out.println("2");
                drawTallBlock(g);
            }
        
        }
}

    
    

