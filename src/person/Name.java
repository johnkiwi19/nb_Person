/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author john
 */
class Name {

    // 3 has a's
    
    FirstName firetName;
    MiddleName middleName;
    LastName lastName;
    
    public Name() {
        System.out.println("This is the Name class");
        new FirstName();
        new MiddleName();
        new LastName();
    }
    
    
}
