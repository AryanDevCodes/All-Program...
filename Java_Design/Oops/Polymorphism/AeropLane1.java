package Java_Design.Oops.Polymorphism;

class Aeroplane1{
void takeoff(){}
void fly(){}
void CarryFoods(){}
void CarryPass(){}
}
class CargoPlane extends Aeroplane1{
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
class PassengerPlane extends Aeroplane1{
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
class FighterPlane extends Aeroplane1 {
@Override
void takeoff() {
    System.out.println("Need Minimum Path To TakeOff..");
}

@Override
void fly() {
    System.out.println("FighterPlane Is Flying....");
}
}
class PolyMorph{
void poly(Aeroplane1 ref){  // Creating Reference For All Methods..
    ref.fly();
    ref.takeoff();
    ref.CarryFoods();
    ref.CarryPass();
}
}
public class AeropLane1 {
public static void main(String[] args) {
    CargoPlane C = new CargoPlane();
/*
    C.takeoff();
    C.fly();
    C.CarryFoods();

*/
    PassengerPlane PP = new PassengerPlane();
/*    PP.takeoff();
//    PP.fly();
//    PP.CarryPass();
      Not Carrying Polymorphism ....
      
 */
    
    FighterPlane Fp = new FighterPlane();
    System.out.println("............................................................................................");
    
    PolyMorph Poly = new PolyMorph();
    Poly.poly(C);   // Accessing Methods Of CargoPlane
    Poly.poly(PP);  // Accessing Methods Of PassengerPlane
    Poly.poly(Fp);  // Accessing Methods Of FighterPlane
    System.out.println("____________________________________");
    System.out.println("PolyMorphism Achieved.....");
    
}
}
