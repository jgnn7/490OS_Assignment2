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
        courses.add(new Course("123","comp", 3));
        courses.add(new Course("210","line", 3));
        courses.add(new Course("400","last", 4));
    
}
    public void AddCourse(Course newCourse){
        courses.add(newCourse);
    }
    public void delCourse(Course course){
       courses.remove(course);      
    }
    public void editCourseId(Course course, String newID){
        course.editId(newID);
    }
    public void editCourseTitle(Course course, String newTitle){
        course.editTitle(newTitle);
    }
    public void editCourseCredit(Course course, int newCredit){
        course.editCredit(newCredit);
    }
    public void editCourse(Course course, String newId, String newTitle, int newCredit){
        course.editId(newId);
        course.editTitle(newTitle);
        course.editCredit(newCredit);
    }
    public String getId(){
        return this.Id;
    }
    public ArrayList CouseList(){
        return courses;
    }
}
