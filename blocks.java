import java.awt.*;
import java.util.*;


public class blocks {

    private int objX; // stores x of obstacle
    //int nextBlocks[10];
    private String tall;


   
    public blocks(int objX, String tall){
        
    }


    public void drawBlock (Graphics g){
        if(objX <= 0){     
            //this is for deleting the blocks that re at the end of the board
        }
        g.drawOval(objX, 240, 10, 10); // short obstacle
        
       
        objX -= .5;  
    }

    public int getObjX(){
        return objX;
    }

    
     public void drawTallBlock (Graphics g){
        if(objX <= 0){
        }
        g.drawOval(objX, 230, 10, 20); // tall obstacle

        objX -= .5;  
    }

    public void generateBlocks(Graphics g){
        //600 length
       
            int num = (int)Math.random()*2;

            if (num == 0){
                //System.out.println("1");
                drawBlock(g);
            }else if (num == 1){
                //System.out.println("2");
                drawTallBlock(g);
            }
        
        }
}

    
    

