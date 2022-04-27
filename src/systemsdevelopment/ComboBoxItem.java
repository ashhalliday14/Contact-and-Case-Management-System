/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemsdevelopment;

/**
 *
 * @author ashleigh.halliday
 */
public class ComboBoxItem {
    private int id;
    private String name;

    //constructor
    public ComboBoxItem(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //getter and setters 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name;
    }
}
