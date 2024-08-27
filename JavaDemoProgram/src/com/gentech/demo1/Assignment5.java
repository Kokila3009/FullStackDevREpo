package com.gentech.demo1;

class Sports {
    String sportName;
    String coachName;
    int numberOfPlayers;
}

class ComputerDepartment {
    String departmentName;
    String labLocation;
    int numberOfComputers;
}

class Library {
    String bookName;
    String author;
    int quantity;
}

class Student {
    String studentName;
    int age;
    String department;   
        
        }
    

    
    public class Assignment5 {
        public static void main(String[] args) {
            
            Student s1 = new Student();

          
            s1.studentName = "Kokila";
            s1.age = 22;
            s1.department = "Computer Science";
            
            Library library = new Library();
            library.bookName = "Java Programming";
            library.author = " Smitha ";
            library.quantity = 20;
            
            Sports sports = new Sports();
            sports.sportName = "Football";
            sports.coachName = "Alex ";
            sports.numberOfPlayers = 11;
             
            ComputerDepartment c1 = new ComputerDepartment();
            c1.departmentName = "Computer Science";
            c1.labLocation = "Lab A";
            c1.numberOfComputers = 30;
            
            System.out.println("****Student Details****");
            System.out.println( "Student Name: " + s1.studentName + " "
                    + "Age: " + s1.age + " "
                    + "Department: " + s1.department);
            
            System.out.println("****Library Details****");
            System.out.println( "Book Name: " + library.bookName + " "
                    + "Author: " + library.author + " "
                    + "Quantity: " + library.quantity);

            System.out.println("****Sports Details****"); 
            System.out.println ( sports.sportName + " "
                    + "Coach Name: " + sports.coachName + " "
                    + "Number of Players: " + sports.numberOfPlayers);

            System.out.println("****Computer Department Details**** " );
            System.out.println("Department Name: " + c1.departmentName + " "
                    + "Lab Location: " + c1.labLocation + " "
                    + "Number of Computers: " + c1.numberOfComputers);
        }
    }




