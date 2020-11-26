public class Friend {
    // States
    public String name;
    public String greeting; // their greeting over text
    // Constructor
    public Friend(String name, String greeting) {
        // "this" keyword references the object
        // this object's name = the parameter name
        this.name = name;
        this.greeting = greeting;
    }
    // Behaviors
    public void greet() {
        System.out.println(name + " says: " + greeting);
    }
}
