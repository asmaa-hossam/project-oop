
package javaapplication3;


public class JavaApplication3 {

    
    public static void main(String[] args) {
        Student st1=new Student("fatamah","2356 yanbu albahr");
        
        st1.addCourse("java", 50);
         st1.addCourse("c++", 70);
          System.out.println(st1.toString());
          System.out.println(st1.getAvarage());
          
    }
    
}
