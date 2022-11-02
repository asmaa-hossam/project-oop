
package javaapplication3;

import java.util.ArrayList;
public class Student extends person{   
 ArrayList<String>courses;
    ArrayList<Integer>grades;
    int counter;
    public Student(String name, String address) {
        super(name, address);
        courses=new ArrayList<>();
        grades=new ArrayList<>();
        counter=0;
    }
     public void addCourse (String courseName ,int grade){
       
               for(int i=0; i<courses.size();i++) {
                   if(courses.get(i).equals(courseName)){
                       grades.set(i, grade);
               }
            }
               courses.add(courseName);
               grades.add(grade);
               counter++;
        }
     public void printGrade (){
         for(int i=0; i<courses.size();i++) {
             System.out.println(courses.get(i)+" : " +grades.get(i));
         }

}
    
   
    
    public double getAvarage(){
        double sum=0;
        for(int i=0;i<grades.size();i++){
            sum+=grades.get(i);}
        return sum/counter;
        
        }

    @Override
    public String toString() {
        return "Student{" + "courses=" + courses + ", grades=" + grades + ", counter=" + counter + '}';
    }
    

    
    
    
    }
