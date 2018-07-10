/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person.name;

/**
 *
 * @author john
 */
public class FirstName {
    
    String name;

    public FirstName() {
        System.out.println("First Name");
    }

    public FirstName(String name) {
        this.name = name;
    }

    
    
    public String get() {
        return name;
    }

    public void set(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name ;
    }
    
    
    
}
