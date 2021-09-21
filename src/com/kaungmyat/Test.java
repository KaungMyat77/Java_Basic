package com.kaungmyat;

import javax.swing.*;
import java.awt.*;

public class Test {
    private JPanel panel1;
    private JButton button1;

    public static void main(String[] args) {
        JFrame f= new JFrame("Hello world");
        f.setContentPane(new Test().panel1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
}
