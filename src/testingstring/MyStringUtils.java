/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingstring;

/**
 *
 * @author SHS
 */
public class MyStringUtils 
{
 private String myStr = null;
 
 public MyStringUtils(String s)
 {
     if (s.equals(""))
     {
         throw new NullPointerException("Parameter cannot be null or empty");
     }
     myStr = s;    
 }
 
 public String getMyStr()
 {
     return myStr;
 }
    
}
