
package javaapplication3;

public class Teasher extends person{
    int numOfCourses;
    String []courses;
    final int COURSECABASTY=10;
    public Teasher(String name, String address) {
        super(name, address);
         courses=new String [3];
        numOfCourses=0;
    }
    public void addCourse (String courseName ){
        if (!(numOfCourses==COURSECABASTY))
            {
               for(int i=0; i<numOfCourses;i++) {
                   if(courseName.equals(courses[i])){
                       System.out.println("this coures is exist");
               }
            }
               courses[numOfCourses]=courseName;
               numOfCourses++;  
        }
    }
    public  void printCourse() {
        for(int i=0; i<numOfCourses;i++) {
            System.out.println(courses[i]);
        }
        }

    @Override
    public String toString() {
        return "Teasher{" + "numOfCourses=" + numOfCourses + ", courses=" + courses + ", COURSECABASTY=" + COURSECABASTY + '}';
    }
    
        
    }
    
    

