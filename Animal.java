//package firstGit;

public abstract class Animal  {
    
    int legs;
    String name;
    

    public Animal (String name, int legs) {
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
	return (this.getName() + ", " + this.getLegs());
    }
   

    

}
