/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import person.name.Name;

/**
 *
 * @author john
 */
public class Person {

    // hasa
    Name name;
    Address address;
    Phone phone;
    
    
    public Person() {
        System.out.println("This is the Person Class");
        
        new Name();
        new Address();
        new Phone();
        
        
    }


    
}
