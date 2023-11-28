package Java_Design.Oops.Inheritance.Types_Of_Inheritance.Hierachical_Inheritance;

class Aeroplane{
void takeoff(){}
void fly(){}
}
class CargoPlane extends Aeroplane{
@Override
void takeoff() {
    super.takeoff();
    System.out.println("Cargo Pane Is Flying...");
}
@Override
void fly() {
    super.fly();
    System.out.println("CargoPlane");
}
void CarryFoods(){
    System.out.println("Carrying Foods...");
}
}
class PassengerPlane extends Aeroplane{
@Override
void takeoff() {
    
    System.out.println("Passenger Plane Is Flying...");
}

@Override
void fly() {
    super.fly();
    System.out.println("PassengerPlane");
}
void CarryPass(){
    System.out.println("Carrying Passengers....");
}
}
public class AeropLane {
public static void main(String[] args) {
    CargoPlane C = new CargoPlane();
    C.takeoff();
    C.fly();
    C.CarryFoods();
    
    PassengerPlane PP = new PassengerPlane();
    PP.takeoff();
    PP.fly();
    PP.CarryPass();
}
}
