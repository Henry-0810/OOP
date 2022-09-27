package LabSheet4.exercise4;

import LabSheet4.exercise3.Book;

import javax.swing.*;
import java.awt.*;

public class TestBook {
    public static void main(String[] args) {
        //declare variable
        String title;
        double price;
        String ISBN;
        int pages;
        String output = "";

        JTextArea textarea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        textarea.setFont(font);
        output += String.format("%-25s%-9s%-15s%s","Title","Price","ISBN","Pages") + "\n\n";
        //Favourite book inputs
        title = JOptionPane.showInputDialog("Please enter the title of your favourite book");
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your favourite book"));
        ISBN = JOptionPane.showInputDialog("Please enter the ISBN of your favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages of your favourite book"));

        Book book1 = new Book(title,price,ISBN,pages);
        output += String.format("%-25s%-9s%-15s%s",title,price,ISBN,pages) + "\n\nh";

        //Least favourite book inputs
        title = JOptionPane.showInputDialog("Please enter the title of your least favourite book");
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your least favourite book"));
        ISBN = JOptionPane.showInputDialog("Please enter the ISBN of your least favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages of your least favourite book"));

        Book book2 = new Book(title,price,ISBN,pages);
        output += String.format("%-25s%-9s%-15s%s",title,price,ISBN,pages);

        textarea.append(output);

        JOptionPane.showMessageDialog(null,textarea,"Book Object Data",1);
    }

}
