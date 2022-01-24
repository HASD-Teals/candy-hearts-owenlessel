public class Heart {
    // PROPERTIES
    private String color;
    private int calories;
    private double costPerPound;
    private boolean available;
    private int stock;
    private int size;
    private String[] sayings;

    // CONSTRUCTORS
    public Heart() {} // This is the default contructor
    //Add overloaded Constructor here...
    public Heart(String color,int calories,double costPerPound,boolean available,int stock,int size,String[] sayings){
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
    public String[] getSayings(){
        return this.sayings;
    }
    public int getCalories(){
        return this.calories;
    }
    public double getCost(){
        return this.costPerPound;
    }
    public boolean getAvailable(){
        return this.available;
    }
    public int getStock(){
        return this.stock;
    }
    
    
    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }
    //Add remaining Mutator methods here...
    public void adjPrice(double costPerPound){
        int increase=0;
        this.costPerPound=costPerPound*increase;
    }
    public void inStock(int stock){
        
    }

    // METHODS
    public String report() {
        return this.color + "\n" + this.size + "\n" + this.sayings + "\n" + this.calories + "\n" + this.costPerPound + "\n" + this.available + "\n" + this.stock; // Add other properties here as you add them to the class
    }
    //Write other methods here (if needed)...
}
