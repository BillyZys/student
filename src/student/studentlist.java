/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author Yunsheng
 */
public class studentlist {
    public static void main(String[] args){
        //Student s1=new Student("s1","ronak");
        Student[] studentlist = new Student[3];
        studentlist[0]= new Student("s1","ronak");
        studentlist[1]= new Student("s2","john");
        studentlist[2]= new Student("s3","kevin");
        
        for (int i = 0;i<studentlist.length;i++){
            System.out.println(studentlist[i].getStudentName());
        }
    }
}
