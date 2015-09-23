
package amoebacolony;

import javax.swing.JOptionPane;


public class AmoebaTester {
    
    public static void main(String[] args){
        
        AmoebaColony newColony = new AmoebaColony();
        try{
            

            newColony.setColonyProperties();
            newColony.setActions();
            
        }catch (NumberFormatException e){   
            JOptionPane.showMessageDialog(null, "You entered incorrect or incomplete information!", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }
    
}
