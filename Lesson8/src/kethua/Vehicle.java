package kethua;
    /*
       Lớp cơ sở
    */
public class Vehicle {
   protected String vehicleNo;
   protected String vehicleName;
   protected int wheels;
   public void accelerate(int speed){
       System.out.println("accelerate at: " + speed + " kmph");
   }
}
