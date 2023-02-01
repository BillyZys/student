/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author Yunsheng
 */
public class PartTimeStudent extends Student{
    
   private int noOfCourse;

    public PartTimeStudent(int noOfCourse, String studentId, String studentName) {
        super(studentId, studentName);
        this.noOfCourse = noOfCourse;
    }
     
    public int getNoOfCourse(){
        return noOfCourse;
    }
}
