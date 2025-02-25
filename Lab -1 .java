package com.mycompany.deehan;
import java.util.Scanner;

    class Student{
        String name;
        int id;
        
        Student(String name, int id)
        {
        
          this.name = name;
            this.id = id;
        }
        
        void display(){
            System.out.println("Student name: " + this.name + "\nID: "+ this.id);  
    
        }}
    public class Deehan {

    public static void main(String[] args) {
      //  System.out.println("Hello World!");
      String name;
      int id;
      Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = scan.nextLine();
        System.out.println("Enter ID: ");
        id = scan.nextInt();
        
    Student s1 = new Student("Erica", 100);
    /* s1.name = "Erica";
    s1.id = 100;  */
         // System.out.println("Student name: " + s1.name + "\nID: "+ s1.id);
   s1.display();
    }
}
