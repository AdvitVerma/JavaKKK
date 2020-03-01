/*
NAME: ADVIT VERMA
STUDENT ID: 991543828
ASSIGNMENT 2
DATE: 3/01/2020
*/
package content;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Advit
 */
public class DisplayOrder extends Stage {
    
    
       public DisplayOrder(Order one) {
        
        
        setScene(getScene(one));
        
        

    }
    
    
    private Scene getScene(Order one){
        
        
        Label lblFirstName=new Label("Customer First Name is: "+one.getFirstName());
        Label lblLastName=new Label("Customer Last Name is: "+one.getLastName());
        Label lblCity=new Label("Customer City is : "+one.getCity());
        Label lblOrderid=new Label("Customer Order ID is : "+one.getOrderId());
        
        VBox pane=new VBox(20,lblFirstName,lblLastName,lblCity,lblOrderid);
        Scene scene=new Scene(pane,500,550);
        return scene;
        
    
    }
    
}
