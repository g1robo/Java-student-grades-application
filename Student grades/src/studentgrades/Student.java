
package studentgrades;

import java.util.ArrayList;


public class Student {
    // private variables
    String name;
    double average;
    //homeworks ArrayList
    private final ArrayList<Integer> homeworks= new ArrayList<>();
    
    //Constructor
    public Student(String studentName)
    {
        this.name=studentName; 
        
    }
    // name setter
    public void setName(String named)
    {
        name = named;
    }
    //name getter
    public String getName()
    {
        return name;
    }
    //method adding new homework grade
    public void addHomeworkGrade(int homeworkGrade)
    {
        homeworks.add(homeworkGrade);
    }
    //method used to computeAverage
    public double computeAverage()
    {
        ArrayList<Integer> list = new ArrayList<>(homeworks);
        double total;
        int avg = 0;
        long sum = 0;
        int n = list.size();
        for (int i =0; i<n; i++)
            sum += list.get(i);
        return ((double)sum)/n;// return the average
    }  
    //Overriding the toString method
    @Override
    public String toString(){
        return  name+"'s average grade is" +" "+computeAverage();
    }
}
