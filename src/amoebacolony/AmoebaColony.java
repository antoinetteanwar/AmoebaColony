
package amoebacolony;
// PantherID: 5600352
// CLASS: COP 2210 – Fall 2015
// ASSIGNMENT #2
// DATE: Sept 16
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//

import javax.swing.JOptionPane;
import java.util.Random;

public class AmoebaColony {
    
    
    private String colonyName;
    private String caretakerName;
    private int startAmoeba;
    private int daysFed;
    private int breed;
    private boolean vitamins;
    private boolean colonyname;
        
    
    public void setColonyProperties(){
        
        String welcomeMsg = ("Hello and welcome to our program.\n This program allows you to create and take care of your own amoeba colony!");
        String title = ("Welcome!");
        JOptionPane.showMessageDialog(null, welcomeMsg, title, JOptionPane.INFORMATION_MESSAGE);
        
        colonyName = JOptionPane.showInputDialog("What would you like to name your colony?");
        caretakerName = JOptionPane.showInputDialog("What is your name, caretaker?");
        startAmoeba = Integer.parseInt(JOptionPane.showInputDialog("How many amoebas would you like to start with?\n Note: 1 day of food for each time colony breeds!"));
        
    }
    
    public void setActions(){
        JOptionPane.showMessageDialog(null, "Congratluations, you've created your amoeba colony, " + colonyName + ", of " + startAmoeba + " amoebas!", colonyName, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Now you can feed your colony, breed your colony, and give them vitamins to prevent sickness!" , colonyName, JOptionPane.INFORMATION_MESSAGE);

        
    }
    
}