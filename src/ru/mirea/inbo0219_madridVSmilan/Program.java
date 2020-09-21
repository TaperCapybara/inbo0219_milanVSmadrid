package ru.mirea.inbo0219_madridVSmilan;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class BorderExample extends JFrame{
    public int Milan = 0, Madrid = 0;
    Font fnt1 = new Font("Times new roman",Font.BOLD,36);
    Font fnt2 = new Font("Times new roman",Font.PLAIN,24);
    JFrame j1 = new JFrame("Frame");
    JButton b1 = new JButton("AC Milan");
    JButton b2 = new JButton("Real Madrid");
    JLabel f1 = new JLabel();
    JLabel f2 = new JLabel();
    JLabel f3 = new JLabel();

    public BorderExample(){
        setLayout (null);
        f1.setSize(240,60);
        f1.setLocation(280,100);
        f1.setFont (fnt1);
        f1.setHorizontalAlignment((int) CENTER_ALIGNMENT);

        f2.setSize(400,60);
        f2.setLocation(200,150);
        f2.setFont (fnt2);
        f2.setHorizontalAlignment((int) CENTER_ALIGNMENT);

        f3.setSize(240,60);
        f3.setLocation(280,200);
        f3.setFont (fnt2);
        f3.setHorizontalAlignment((int) CENTER_ALIGNMENT);

        f1.setText ("Result: 0 X 0");
        f2.setText ("Last Scorer: N/A");
        f3.setText ("Winner: DRAW");

        b1.setLocation(200,400);
        b1.setSize(120,50);
        b2.setLocation(480,400);
        b2.setSize(120,50);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                Milan += 1;
                Score();
                Last(b1);
                Winner();
            }
        });

        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent be)
            {
                Madrid += 1;
                Score();
                Last(b2);
                Winner();
            }
        });

        add (b1);
        add (b2);
        add (f1);
        add (f2);
        add (f3);
        setSize(800,500);
    }

    public void Score(){
        f1.setText("Result: " + Milan + " X " + Madrid);
    }

    public void Last(JButton b){
        if (b == b1){
            f2.setText ("Last Scorer: AC Milan");
        }
        else{
            f2.setText ("Last Scorer: Real Madrid");
        }

    }

    public void Winner(){
        if (Milan > Madrid){
            f3.setText ("Winner: AC Milan");
        }
        if (Milan < Madrid){
            f3.setText ("Winner: Real Madrid");
        }
        if (Milan == Madrid){
            f3.setText ("Winner: DRAW");
        }
    }
    public static void main(String[]args)
    {
        new BorderExample().setVisible(true);
    }
}
