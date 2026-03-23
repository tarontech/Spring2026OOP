/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taron
 */
public class ATypeName {
    
    ATypeName() {
        System.out.println("A new object type AType has been created in the heap");
    }

    @Override
    public String toString() {
        String message = new String("This is an object of type ATypeName");
        return message; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
