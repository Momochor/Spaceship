import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Box extends JPanel{
    int x=250;
    int y=250;
    private Image spaceShipImage;
    Box(){
        super();
        try {
            spaceShipImage =ImageIO.read(new File("./ship5.png"));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void moveLeft(){
        x=x-10;
        repaint();
    }
    
    public void moveRight(){
        x=x+10;
        repaint();
    }

    public void moveDown(){
        y=y+10;
        repaint();
    }
    
    public void moveUp(){
        y=y-10;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        //g.fillRect(x, y,100,100);
        g.drawImage(spaceShipImage, x, y,100,100, this);
    }
}