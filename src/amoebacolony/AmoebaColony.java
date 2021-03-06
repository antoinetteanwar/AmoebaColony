
package amoebacolony;
// PantherID: 5600352
// CLASS: COP 2210 – Fall 2015
// ASSIGNMENT #2
// DATE: Sept 16
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.

import javax.swing.JOptionPane;
import java.util.Random;

public class AmoebaColony {
    
    
    public String colonyName;
    public String caretakerName;
    public String sickness;
    public int startAmoeba;
    public int nextAmoeba;
    public int daysFed;
    public int amountBreed;
    public double finalAmoeba;
    public double amountDied;
    public int yesnoVitamins;
    public int breedSuccessNumber;
    public boolean vitamins;
    public boolean sick;
    public boolean colonyname;
    
        
    
    public void setColonyProperties(){
        
        String welcomeMsg = ("Hello and welcome to our program.\n This program allows you to create and take care of your own amoeba colony!");
        String title = ("Welcome!");
        JOptionPane.showMessageDialog(null, welcomeMsg, title, JOptionPane.INFORMATION_MESSAGE);
        
        colonyName = JOptionPane.showInputDialog("What would you like to name your colony?");
        caretakerName = JOptionPane.showInputDialog("What is your name, caretaker?");
        startAmoeba = Integer.parseInt(JOptionPane.showInputDialog("How many amoebas would you like to start with?"));
        // Above is defining basic variables
    }
    
    public void setActions(){
        
        JOptionPane.showMessageDialog(null, "Congratulations, " + caretakerName+ ", you've created your amoeba colony, " + colonyName + ", of " + startAmoeba + " amoebas!", 
                colonyName, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Now you can feed your colony, breed your colony, and give them vitamins to prevent sickness!" , 
                colonyName, JOptionPane.INFORMATION_MESSAGE);
        daysFed = Integer.parseInt(JOptionPane.showInputDialog(null, "How many days would you like to feed your colony?"
                + "\n Note: They need one day of food for each time they breed.",
                "Feeding", JOptionPane.INFORMATION_MESSAGE));
        amountBreed = Integer.parseInt(JOptionPane.showInputDialog(null, "How many times would you like to breed your colony?"
                + "\n Note: Each successful breed doubles your colony's size."
                + "\n Every time they breed requires 1 day worth of food."
                + "\n You have chosen to feed your colony " + daysFed + " time(s).",
                "Breeding", JOptionPane.INFORMATION_MESSAGE));
        yesnoVitamins = JOptionPane.showConfirmDialog(null, "Would you like to give your colony vitamins?"
                + "\n Note: Giving vitamins reduces the chance of your colony getting sick.", "Vitamins", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_OPTION);
        //Above is asking user what they would like to do about feeding, breeding, and vitamins
    }
    
    public void setBreeding(){
        if  (daysFed >= amountBreed){
            breedSuccessNumber = amountBreed;
            //must be fed in order to breed. min food = min breed, can feed more times than amount bred
        }
        else{
            breedSuccessNumber = daysFed;
            //if days fed smaller that breed request, will only breed amount of days fed
        }
        int previousAmoeba = startAmoeba;
        for (int i = 0; i < breedSuccessNumber; i++){
            nextAmoeba = previousAmoeba * 2;
            previousAmoeba = nextAmoeba;
        }
        nextAmoeba = nextAmoeba;
    }
    
    public void setVitamins(){
        
        if (yesnoVitamins == JOptionPane.YES_OPTION){
            vitamins = true;
            
        }else if(yesnoVitamins ==JOptionPane.NO_OPTION){
            vitamins = false;
        }
        //decision to give vitamins
    }
        
    public void setSickness(){
            
        Random r = new Random();  	
        int x = 1 + r.nextInt(100);
        
        if(vitamins == true){//if given vitamins
        
            if(x <= 20){
            sick = true;
            sickness = "Yes";
            }//if random # less than 20, colony gets sick
            else{
            sick = false;
            sickness = "No";
            }//if random # greater than 20, colony not sick
 
        }
    
        else{//if not given vitamins
            
            if(x <= 25){
            sick = true;
            sickness = "Yes";
            }//if random # less than 25, sick
            else{
            sick = false;
            sickness = "No";
            }//if random # greater than 25, not sick
        }
    }
    
    public void setDeath(){
        
        if(sick == true){//if colony got sick
            finalAmoeba = Math.round(nextAmoeba * .90);
        }//final count is 90% of nextAmoeba (amount after breed) b/c sickness loses 10%
        else{
            finalAmoeba = nextAmoeba;
        }//if not sick, no loss of amoeba
            
        amountDied = nextAmoeba - finalAmoeba; 
        //calcilate amount that died by taking final from # after breed
            
    }
    
    public void finalOutput(){
        JOptionPane.showMessageDialog(null, "Here is a summary of your new Amoeba Colony!:"
                + "\nColony Name: " + colonyName
                + "\nCaretaker Name: " + caretakerName
                + "\nStarting Size: " + startAmoeba + " amoeba(s)."
                + "\nHow many times fed: " + daysFed
                + "\nNumber of times to breed request: " + amountBreed
                + "\nNumber of successful breeds: " + breedSuccessNumber
                + "\nSickness?: " + sickness
                + "\nHow many died?: " + amountDied
                + "\nFinal number of amoebas in colony: " + finalAmoeba);
        
    }
}