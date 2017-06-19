/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author 070132592
 */
public class Subject implements Comparable<Subject>{
  
    private int grade;
   private String courseCode;
   private String department; 
   private final static int COLLEGE =0;
   private final static int UNIVERSITY = 1;
   private final static int AP = 2;
   
   //level - college, university, AP, applied, academic, gifted
   //grade of subject
   
   //constructor for subject
   public Subject(String department, int grade){
       this.department=department;
       this.grade =grade;
   }

  //see if the subjects equal eachother
    public boolean equalTo(Subject o) {
        //departmentshave to match
        if (department.equals(o.department)&&grade == o.grade){
            return true;
        }
        else{
            return false;
        }
      
    }
    
  
//dont know how to make the grades equal to or lss than so right now a grade 9 could tutor a grade 12
    @Override
    public int compareTo(Subject o) {
     if (grade > o.grade){
         return 1;
     }
     else 
        return -1;
    }
   
}
