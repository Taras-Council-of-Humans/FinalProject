/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 070132592
 */
public class Student {
   
    //variables of a student
    private String firstName; 
    private String lastName;
    private int grade; 
    private String username;
    private String password;
           
 
    boolean[][] availablity = new boolean[5][5];//5 columns Monday - Friday, 5 rows period 1-5
    
    ArrayList<Subject> subjects = new ArrayList(); //subjects they can tutor in or need to be tutored in
    
    
    //constructor
    public Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade; 
    }
    
    public Student(String firstName, String lastName, int grade, String username, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade; 
        this.username = username;
        this.password = password;
        
         MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");

    //give the helper function the password
            md.update(password.getBytes());

    //perform the encryption
            byte byteData[] = md.digest();

   
    // express the byte data as a hexadecimal number (the normal way)
            this.password = "";

            for (int i = 0; i < byteData.length; ++i) {

                this.password += (Integer.toHexString((byteData[i] & 0xFF) | 0x100).substring(1, 3));

            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
     public String getName() {
        return firstName + lastName;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }

    public String toString() {
        return firstName + "," + lastName + "," + username + "," + password;
    }
    
    
    public void setAvailability(int day, int period,boolean available){
        //depending on the GUI
        availablity[day][period] = available;
        
       
    }
    
    public void setSubject(Subject subject){
        subjects.add(subject);
    }
    public void setSubject(String dept, int grade){
        subjects.add(new Subject(dept,grade));
    }
    
    
   
}

