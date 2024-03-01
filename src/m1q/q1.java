package m1q;   //custom exception //imp//
 
class TypeException extends Exception {
    @Override
    public String toString() {
        return "Vehicle Type Not Set";
    }
}
 
class Vehicles {
    protected String type;
    protected String model_no;
    protected String model_name;
    protected String owner_name;
    protected String owner_details;
 
    public Vehicles(String model_no, String model_name, String owner_name, String owner_details) {
        this.model_no = model_no;
        this.model_name = model_name;
        this.owner_name = owner_name;
        this.owner_details = owner_details;
    }
 
    public Vehicles() {
        // Default constructor
    }
 
    public String get_type() {
        return type;
    }
 
    public String retrieve() throws TypeException {
        return "null";
    }
}
 
class Car extends Vehicles {
    public Car(String model_no, String model_name, String owner_name, String owner_details) {
        super(model_no, model_name, owner_name, owner_details);
    }
 
    public Car() {
        // Default constructor
    }
 
   
    public String retrieve() throws TypeException 
    {
        if (type == null) {
            throw new TypeException();
        } else {
            return model_no + " " + model_name + " " + owner_details + " " + owner_name + " ";
        }
    }
 
    public void set_type(String type) {
        this.type = type;
    }
}
 
public class q1 {
    public static void main(String[] args) {
        Car myCar = new Car("123", "Sedan", "John Doe", "Details");
        myCar.set_type("Sedan");
 
        try {
            System.out.println(myCar.retrieve());
        } catch (TypeException e) {
            System.out.println(e);
        }
    }
}
