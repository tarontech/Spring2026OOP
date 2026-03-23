/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrator
 */
/*
 * HelloWorldSwing.java requires no other files. 
 */        
import java.awt.Dimension;
import java.awt.TextArea;
import javax.swing.*;

public class GameExample1 {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        
        String textOut = new String("Game Text Area");
        JTextArea textArea = new JTextArea(textOut, 30,50);
        textArea.setEditable(false);
        
        PlayAction playAction = new PlayAction();
        ResetAction resetAction = new ResetAction();
        
        //Create and set up the window.
        JFrame frame = new JFrame("Sample Lottery Game");
        JMenuBar menuBar = new JMenuBar();
        JMenuItem playItem = new JMenuItem();
        playItem.setAction(playAction);
        playItem.setText("Play Game");
        menuBar.add(playItem);
        JMenuItem resetItem = new JMenuItem();
        resetItem.setAction(resetAction);
        resetItem.setText("Reset Game");
        menuBar.add(resetItem);
        
        
        frame.setLocation(100,50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(menuBar);
        
        

        
        
        Dimension wsd = new Dimension(600, 400);
        frame.getContentPane().add(textArea);
        frame.setMinimumSize(wsd);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}