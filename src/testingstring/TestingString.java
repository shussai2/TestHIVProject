/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingstring;

import java.util.*;
import java.io.*;

/**
 *
 * @author SHS
 */
public class TestingString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        System.out.println("In Testing String Class");
        
        //create a MyStringUtils object with empty brackets to 
        //cause an exception and handle the exception now
        try
        {
            MyStringUtils mystrObject = new MyStringUtils("");
        }catch (NullPointerException e)
        {
            System.out.println("\nERROR FOUND: " + e);
        }
        
        MyStringUtils mystrObject = new MyStringUtils("Hey");
        System.out.println("Successfully created mystrObject: " + mystrObject.getMyStr());
    }
    
}
