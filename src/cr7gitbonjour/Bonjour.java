/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr7gitbonjour;

/**
 *
 * @author Le Padre
 */
public class Bonjour {
    private String message;

    public Bonjour(String message) {
        this.message = message;
    }

	/**
	* Create string representation of Bonjour for printing
	* @return
	*/
	@Override
	public String toString() {
		return "Bonjour [message=" + message + "]";
	}


    public String getMessage() {
        return message;
    }
    
    public void bonjourName(String name) {
        System.out.println("Yo! Dawg!" +name);
    }    
    
}
