package ru.mirea.task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football extends JFrame {
    int button1Count, button2Count;
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");

    JLabel label1 = new JLabel("Result: 0 X 0");
    JLabel label2 = new JLabel("Last Scorer: N/A");
    JLabel label3 = new JLabel("Winner: DRAW");

    JPanel[] jPanel = new JPanel[3];

    public Football() {
        super("Match");
        button1Count = 0; button2Count = 0;

        this.setBounds(150,50,900,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,1));
        for(int i = 0; i < jPanel.length ; i++)
        {
            jPanel[i] = new JPanel();
            add(jPanel[i]);
        }
        jPanel[1].setLayout(new FlowLayout());

        jPanel[0].add(label1);

        button1.setPreferredSize(new Dimension(150,50));
        button2.setPreferredSize(new Dimension(150,50));

        button1.addActionListener(new ButtonEventListener1());
        button2.addActionListener(new ButtonEventListener2());
        jPanel[1].add(button1);
        jPanel[1].add(button2);

        jPanel[2].setLayout (new GridLayout ());
        this.add(jPanel[2],BorderLayout.CENTER);
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        jPanel[2].add(label2);
        jPanel[2].add(label3);

        setVisible(true);
    }

    class ButtonEventListener1 implements ActionListener {
        public void actionPerformed ( ActionEvent e) {
            button1Count +=1;
            label1.setText("Result: "+ button1Count +" X "+ button2Count);
            label2.setText("Last Scorer: AC Milan");
            label3.setText("Last Scorer: AC Milan");
            if (button1Count > button2Count)
                label3.setText("Winner: AC Milan");
            else if (button1Count == button2Count)
                label3.setText("Winner: DRAW");
            else label3.setText("Winner: Real Madrid");
        }
    }
    class ButtonEventListener2 implements ActionListener {
        public void actionPerformed ( ActionEvent e) {
            button2Count +=1;
            label1.setText("Result: "+ button1Count +" X "+ button2Count);
            label2.setText("Last Scorer: Real Madrid");
            if (button1Count > button2Count){
                label3.setText("Winner: AC Milan");
            }
            else if (button1Count == button2Count){
                label3.setText("Winner: DRAW");
            }
            else{
                label3.setText("Winner: Real Madrid");
            }
        }
    }
}
