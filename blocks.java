import java.awt.*;
import java.util.*;


public class blocks {

    private int objX; // stores x of obstacle
    //int nextBlocks[10];
    private String height;
    //private ArrayList<blocks> nextBlocks = new ArrayList<blocks>();

   
    public blocks(int objX, String height){
        this.objX = objX; 
        this.height = height;

        int random = (int)Math.random()*9;
        if (random == 0 || random == 1){
            height = "short";
        } else if (random == 2){
            height = "tall";
        } else {
            height = "none";
        }

    }

    public void updateBlockArray(ArrayList<blocks> nextBlocks){
        int x = 600;

        String height = "";
        
        if (nextBlocks.size() != 10){
            for (int i = 0; i < 10; i++){
                int random = (int)Math.floor(Math.random() * 11);
                System.out.println(random);
                    if (random == 0 || random == 1){
                        height = "short";
                    } else if (random == 2){
                        height = "tall";
                    } else {
                        height = "none";
                    }
                nextBlocks.add(new blocks(x, height));
                System.out.println(height);
                x += 50;
            }
        }

        if ((nextBlocks.get(0)).getObjX() == 0){
            nextBlocks.remove(0);
            int random = (int)Math.floor(Math.random() * 11);
                System.out.println(random);
                    if (random == 0 || random == 1){
                        height = "short";
                    } else if (random == 2){
                        height = "tall";
                    } else {
                        height = "none";
                    }
            nextBlocks.add(new blocks(600, height));
        }
    }

    public void drawBlocks(ArrayList<blocks> nextBlocks, Graphics g){
        for (blocks b: nextBlocks){
            
            if ((b.getHeight()).equals("short")){
                System.out.println("test1");
                System.out.println(b.getObjX());
                g.drawOval(b.getObjX(), 240, 10, 10);
                b.incrementObjX(1);
            } else if ((b.getHeight()).equals("tall")){        
                g.drawOval(b.getObjX(), 230, 10, 20);
                b.incrementObjX(1);
            }
        }
    
    }


    
    public String getHeight(){
        return height;
    }
    public void incrementObjX(int num){
        objX = objX - num;
    }
    public int getObjX(){
        return objX;
    }
    public int getCenterX(){
        return objX +5;
    }

    public int getCenterY(){
        return 245;
    }

    // public void drawBlock (Graphics g){
    //     if(objX <= 0){     
    //         //this is for deleting the blocks that re at the end of the board
    //     }
    //     g.drawOval(objX, 240, 10, 10); // short obstacle
        
       
    //     objX -= .5;  
    // }
    
    //  public void drawTallBlock (Graphics g){
    //     if(objX <= 0){
    //     }
    //     g.drawOval(objX, 230, 10, 20); // tall obstacle

    //     objX -= .5;  
    // }

    // public void generateBlocks(Graphics g){
    //     //600 length
       
    //         int num = (int)Math.random()*2;

    //         if (num == 0){
    //             //System.out.println("1");
    //             drawBlock(g);
    //         }else if (num == 1){
    //             //System.out.println("2");
    //             drawTallBlock(g);
    //         }
        
    //     }
}

    
    

