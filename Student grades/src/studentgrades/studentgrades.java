/*
* Geoffrey Robinson
 * 
 *
Create a new Java Project named YourNameAssignment5 and complete the following requirements:
1.Create a class named Student as follows. The class keeps track of the student’s homework grades.
a.The instance (or member) private variables – name (String), homeworks (an integer array list).
b.A single constructor with name as its argument. Also, initialize the homeworks array list.
c. The public get and set methods for the name instance variable.
d.A void addHomeworkGrade method which takes one argument – the new homework grade.
e.A public computeAverage method which takes no arguments and returns a double showing the average homework grade for this student.
f. Override the toString method to return the string representation of this object in the format “The <studentName>’s average grade is <the computed average>”.
2. In your YourNameAssignment5 class implement the following functionality in its main method.
a. Declare and initialize an empty Queue of Student objects named studentQueue.
b. Declare and initialize an empty HashMap named studentMap. The keys will be the names of the students and the entries in the map will be the corresponding student objects.
c. Use the Scanner class to read the data.txt file. The contents of the file are shown below. Create the datain.txt file in your project.
d. Read the contents of the text file one line at a time using a loop. The program should work for any number of input lines. In this loop,
1. Invoke the processInputData method for each line read. This method returns the corresponding Student object.
2. Add this Student object to the studentQueue.
3. Insert this Student object into the studentMap using the student’s name as the key.
e. After the loop is processed, do the following.
1. Iterate over the studentQueue and display each element to the console.
2. Access the keys of the studentMap and assign them to an appropriate variable. Create an iterator over the keys. Iterate over each key in this set and display the associated object in the map to the console.
External to the main method but in the same class as the main, write a private method processInputData with return type Student which processes its string input argument and returns the corresponding Student object as follows.
1. Use the String class’s split() method to break up each line read in from the file based on a comma, “,”, to separate data.
2. Extract the name string. Create a Student object and pass name into the Student constructor.
3. Using a while loop, read the next homework grade and convert it to an integer. Use the addHomeworkGrade method on the student object to add the homework grade for this homework.
4. Display the string representation of the currentStudent object to the console.
5. The method should return the currentStudent object.
*/
package studentgrades;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;


public class studentgrades {
public static void main(String[] args){
        //Creating Student Queue
        Queue<Student> studentQueue;
        studentQueue = new LinkedList<>();
        //Creating Hashmap
        HashMap<String,Student> studentMap= new HashMap<>();
        //DataIn file
          try {
         System.out.print("Enter the file name with extension : ");
         // Scanner
         Scanner input = new Scanner(System.in);
          // File in 
         File file = new File("C:\\Users\\Jennifer\\Documents\\NetBeansProjects\\GeoffreyRobinsonAssignment5\\src\\geoffreyrobinsonassignment5\\DataIn.txt");
         input = new Scanner(file);
         //while loop using processInputData
        while (input.hasNextLine()) {
        String line = input.nextLine();
        Student st1=processInputData(line);
        studentQueue.add(st1); 
        studentMap.put(st1.name,st1);
        System.out.println(line);}
        input.close();
        } catch (FileNotFoundException ex) {
        ex.printStackTrace();}
         //iterating using queue
        Iterator iterator;
        iterator = studentQueue.iterator();
        System.out.println ( "Iterating over the student list: ");
        //while loop for iterating studentQueue
        while (iterator.hasNext())
        {
        System.out.println ( iterator.next()); 
        }
        //Retrieving from the hashmap
        Set key_s = studentMap.keySet();
        Iterator iter = key_s.iterator();
        String key_value;
        Student value;
        System.out.println("Iterating over Students map...");
        //while loop for iterating over studentMap
        while(iter.hasNext())
        {
            key_value = (String)iter.next();
            value = (Student)studentMap.get(key_value);
            System.out.println( value);
        }
}
// method processInputData
private  static Student processInputData(String name) {
        Scanner sc =new Scanner(name);
        String line = sc.nextLine();
        String[] details = line.split(",");
        String studentName = details[0];
        int grade1 = Integer.parseInt(details[1]);
        int grade2 = Integer.parseInt(details[2]);
        int grade3 = Integer.parseInt(details[3]);
        int grade4 = Integer.parseInt(details[4]);
        int grade5 = Integer.parseInt(details[5]);
        int grade6 = Integer.parseInt(details[6]);
        Student currentStudent = new Student(studentName);
        //while(sc.hasNextLine()){
        currentStudent.setName(studentName);      
        currentStudent.addHomeworkGrade(grade1);
        currentStudent.addHomeworkGrade(grade2);
        currentStudent.addHomeworkGrade(grade3);
        currentStudent.addHomeworkGrade(grade4);
        currentStudent.addHomeworkGrade(grade5);
        currentStudent.addHomeworkGrade(grade6);
        //}
        System.out.println(currentStudent);
        return currentStudent;
}
}


    
    
