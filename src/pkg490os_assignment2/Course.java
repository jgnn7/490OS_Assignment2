/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg490os_assignment2;

/**
 *
 * @author Jose
 */
public class Course {
    private String ID;
    private String Title;
    private int Credit;
   
    public Course(String id, String title, int credit){
       this.ID = id;
       this.Title = title;
       this.Credit = credit;
    }
}
