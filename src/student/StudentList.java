/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author Immanuel Georges
 */
public class StudentList {
    public static void main(String[]args){
        
        StudentId[] studentList = new StudentId[3];
        
        studentList[0]= new StudentId("s1","Immanuel Georges");
        studentList[1]= new StudentId("s2","John Doe");
        studentList[2]= new StudentId("s3","abc");
        
        for(int i=0;i<studentList.length;i++){
            System.out.println(studentList[i].getStudentName());
        }
    }
    
}
   
