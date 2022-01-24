public class Heart {
    // PROPERTIES
    private String color;
    private int calories;
    private double costPerPound;
    private boolean available;
    private int stock;
    private int size;
    private Heart[] sayings;

    // CONSTRUCTORS
    public Heart() {} // This is the default contructor
    //Add overloaded Constructor here...
    public Heart(String color,int calories,double costPerPound,boolean available,int stock,int size,Heart[] sayings){
        this.color=color;
        this.costPerPound=costPerPound;
        this.stock=stock;
        this.size=size;
        this.sayings=sayings;
    }

    // ACCESSORS
    public String getColor() {
        return this.color;
    }
    //Add remaining Accessor methods here...
    public int getSize(){
        return this.size;
    }
    public Heart[] getsayings(){
        return this.sayings;
    }
    
    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }
    //Add remaining Mutator methods here...


    // METHODS
    public String report() {
        return this.color + "\n"; // Add other properties here as you add them to the class
    }
    //Write other methods here (if needed)...
}
