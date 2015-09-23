
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
    
    
    public String colonyName;
    public String caretakerName;
    public int startAmoeba;
    public int daysFed;
    public int amountBreed;
    public boolean breedSuccess;
    public boolean vitamins;
    public boolean colonyname;
    public int yesnoVitamins;
        
    
    public void setColonyProperties(){
        
        String welcomeMsg = ("Hello and welcome to our program.\n This program allows you to create and take care of your own amoeba colony!");
        String title = ("Welcome!");
        JOptionPane.showMessageDialog(null, welcomeMsg, title, JOptionPane.INFORMATION_MESSAGE);
        
        colonyName = JOptionPane.showInputDialog("What would you like to name your colony?");
        caretakerName = JOptionPane.showInputDialog("What is your name, caretaker?");
        startAmoeba = Integer.parseInt(JOptionPane.showInputDialog("How many amoebas would you like to start with?"));
        
    }
    
    public void setActions(){
        
        JOptionPane.showMessageDialog(null, "Congratluations, " + caretakerName+ ", you've created your amoeba colony, " + colonyName + ", of " + startAmoeba + " amoebas!", 
                colonyName, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Now you can feed your colony, breed your colony, and give them vitamins to prevent sickness!" , 
                colonyName, JOptionPane.INFORMATION_MESSAGE);
        daysFed = Integer.parseInt(JOptionPane.showInputDialog(null, "How many days would you like to feed your colony?"
                + "\n Note: They need one day of food for each time they breed.",
                "Feeding", JOptionPane.INFORMATION_MESSAGE));
        amountBreed = Integer.parseInt(JOptionPane.showInputDialog(null, "How many times would you like to breed your colony?"
                + "\n Note: Every time they breed requires 1 day worth of food."
                + "\n You have chosen to feed your colony " + daysFed + " time(s).",
                "Breeding", JOptionPane.INFORMATION_MESSAGE));
        yesnoVitamins = JOptionPane.showConfirmDialog(null, "Would you like to give your colony vitamins?"
                + "\n Note: giving vitamins reduces the chance of your colony getting sick.", "Vitamins", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_OPTION);
        
        
    }
    
    public void setBreeding(){
        if  (daysFed >= amountBreed){
            breedSuccess = true;
        }
        else{
            breedSuccess = false;
        }
    
    }
}