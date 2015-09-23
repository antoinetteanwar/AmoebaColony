
package amoebacolony;

import javax.swing.JOptionPane;


public class AmoebaTester {
    
    public static void main(String[] args){
        
        AmoebaColony newColony = new AmoebaColony();
        try{
            

            newColony.setColonyProperties();
            newColony.setActions();
            newColony.setBreeding();
            newColony.setVitamins();
            newColony.setSickness();
            newColony.setDeath();
            newColony.finalOutput();
            
        }catch (NumberFormatException e){   
            JOptionPane.showMessageDialog(null, "You entered incorrect or incomplete information!", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }
    
}
