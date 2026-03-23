
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrator
 */
public class PlayAction extends AbstractAction {
   
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Play Action Invoked.");
        System.out.println(e.toString());
        
        Object o = e.getSource();
        JMenuItem playItem = (JMenuItem) o;
        
        System.out.println(playItem.getRootPane().toString());
        
        JRootPane rp = playItem.getRootPane();
        
        Component cpArray[] = rp.getComponents();
        
        System.out.println(cpArray[0].toString());
        System.out.println(cpArray[1].toString());
        
        playItem.setText("Game Started");
    }
    
    
}

