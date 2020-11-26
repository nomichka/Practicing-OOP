public class Friend {
    // States
    private String name;
    private String greeting; // their greeting over text
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

    // Getters
    public String getName() {
        return name;
    }

    public String getGreeting() {
        return greeting;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
