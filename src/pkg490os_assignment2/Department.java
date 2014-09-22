/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg490os_assignment2;

import java.util.ArrayList;

/**
 *
 * @author Jose
 */
public class Department {
    private final String Name;
    private final String Id;
    private ArrayList<Course> courses;
    
    public Department(String name, String id){
        this.Name = name;
        this.Id = id;
    
}
    public void AddCourse(Course newCourse){
        courses.add(newCourse);
    }
    public void delCourse(Course course){
       courses.remove(course);
           
    }
}
