import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.*;
public class BigBox{
    public static void main(String[] args) {
        JFrame frame =new JFrame("hello");

        JButton left =new JButton("Left");
        JButton right =new JButton("Right");
        JButton down =new JButton("Down");
        JButton up =new JButton("Up");
        JPanel actionPanel=new JPanel();

        Box box = new Box();
        box.setPreferredSize(new Dimension(500,300));

        left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("Left");
                box.moveLeft();
            }
        });
        right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("Right");
                box.moveRight();
            }
        });
        down.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("down");
                box.moveDown();
            }
        });
        up.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("up");
                box.moveUp();
            }
        });


        frame.setSize(500,500);
        actionPanel.add(left);
        actionPanel.add(right);
        actionPanel.add(down);
        actionPanel.add(up);
        frame.add(box,BorderLayout.NORTH);
        frame.add(actionPanel, BorderLayout.SOUTH);

        frame.setVisible(true);

    }
}