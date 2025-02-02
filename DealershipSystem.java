public class Dealership{
    private String typeCar;
    private int amountWorkers;
    private String colourCar;
    private char gradingSystem;

    public void set_typeCar(String typeCar){
        this.typeCar = typeCar;
    }
    public void set_amountWorkers(int amountWorkers){
        this.amountWorkers = amountWorkers;
    }
    public void set_colourCar(String colourCar){
        this.colourCar = colourCar;
    }
    public void set_gradingSystem(char gradingSystem){
        this.gradingSystem = gradingSystem;
    }
    public String get_typeCar(){
        return typeCar;
    }
    public int get_amountWorkers(){
        return amountWorkers;
    }
    public String get_colourCar(){
        return colourCar;
    }
    public char get_gradingSystem(){
        return gradingSystem;
    }

}
