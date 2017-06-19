/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.ArrayList;


/**
 *
 * @author 070132592
 */
public class FinalProject {
ArrayList<Tutor> tutors = new ArrayList();
ArrayList<Tutee> tutees = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FinalProject f = new FinalProject();
        
        //adding a new tutor to the array
        f.tutors.add(new Tutor("Tara","Stekel",12));
        
        //adding a new tutee
        f.tutees.add(new Tutee("Mr","RD",13));
        
        //give one subject to the tutor
        f.tutors.get(0).setSubject("math", 12);
        
        // set one subject to the tutee
        f.tutees.get(0).setSubject("math", 12);
        
        //add availabilities
        f.tutees.get(0).setAvailability(2, 1, true);//monday period 2
           f.tutors.get(0).setAvailability(2, 1, true);//monday period 2
           
        //test your search algorithm
        int i = f.search(f.tutees.get(0));
        System.out.println("tutor"+i);
        
       
        //compare availabilities
        f.compareAvailabilities( f.tutors.get(0),  f.tutees.get(0));
    }

   /* public void getTutor(Student s) {
        //get the tutee's subject
        // search for tutors that teach that subject
        // store all the tutors that teach that subjecttt maybe just sort this in the first place to make it easier
        //compare the availabilities until a time works
        //get the coordinates of when student is available
        //check same coordinates on availibility array of tutor

        //write a method to check  tvhe strings 
    }*/

    public int search(Tutee t) {
        //this method will search an array of strings. the array of strings i want it to search is course codes
        Subject s = t.subjects.get(0);
        
       // boolean count = false;

        for (int i = 0; i < tutors.size(); i++) {
           
            if (tutors.get(i).subjects.get(0).equalTo(s)  ) { 
                return i;
//                count = true;
//                break;
            }
        }
        return -1;
//        if (count) {
//            // match student to tutor somehow
//        } else {
//            // keep searching
//        }
    }
    
    public void compareAvailabilities(Tutor a, Tutee b){
        for(int i=0;i<5;i++){ // days
            for(int j=0; j<5;j++){ //periods
                if (a.availablity[i][j]&&b.availablity[i][j]){
                   System.out.println("day "+i+", period "+j);
                   //need a better way of storing this 
 
                } 
                else{
                    continue;
                }
            }
        }
    }
    
    
    
   /* public static void execute(String[] strings, String searchString) {
        if (ArrayUtils.contains(strings, searchString)) {
            System.out.println("contains.");
        } else {
            System.out.println("does not contain.");
        }
    }*/

  

}
