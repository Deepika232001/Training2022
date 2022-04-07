package com.example;
import com.example.model.Student;

public class Application {
public static void main(String[] args)
{
Student ram = new Student();
		
//ram.rollNumber = 101;
ram.setRollNumber(56020);
System.out.println("RollNumber :="+ram.getRollNumber());

}
}
