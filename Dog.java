//import firstGit.Animal;

import java.util.*; 
import java.lang.*; 
import java.io.*; 

public class Dog {

    int legs;
    String name;
    
    public Dog (String name, int legs) {
        this.name = name;
	this.legs = legs;
    }

    public int getLegs() {
	return this.legs;
    }
    public String getName() {
	return this.name;
    }

    public String toString() {
	return  (this.name + " " + this.legs);
    }

}


