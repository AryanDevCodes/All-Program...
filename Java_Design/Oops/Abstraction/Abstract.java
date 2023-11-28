package Java_Design.Oops.Abstraction;

abstract class Aeroplane1{
abstract void takeoff();
abstract void fly();
abstract void CarryFoods();
abstract void CarryPass();
}
class CargoPlane extends Aeroplane1{
@Override
void takeoff() {
    
    System.out.println("Cargo Pane Is Flying...");
}
@Override
void fly() {
    
    System.out.println("CargoPlane");
}
void CarryFoods(){
    System.out.println("Carrying Foods...");
}

@Override
void CarryPass() {

}
}
 class PassengerPlane extends Aeroplane1{
@Override
void takeoff() {
    
    System.out.println("Passenger Plane Is Flying...");
}
@Override
void fly() {
    
    System.out.println("PassengerPlane");
}
void CarryPass(){
    System.out.println("Carrying Passengers....");
}

@Override
void CarryFoods() {}
}
class FighterPlane extends Aeroplane1 {
@Override
void takeoff() {
    System.out.println("Need Minimum Path To TakeOff..");
}

@Override
void CarryFoods() {}

@Override
void CarryPass() {}

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
public class Abstract {
public static void main(String[] args) {
     CargoPlane C;
    C = new CargoPlane();
/*
    C.takeoff();
    C.fly();
    C.CarryFoods();

*/
    PassengerPlane PP;
    PP = new PassengerPlane();
/*    PP.takeoff();
//    PP.fly();
//    PP.CarryPass();
      Not Carrying Polymorphism ....
 */
    
    FighterPlane Fp;
    Fp = new FighterPlane();
    
    System.out.println("............................................................................................");
    
    PolyMorph Poly = new PolyMorph();
    Poly.poly(C);   // Accessing Methods Of CargoPlane
    Poly.poly(PP);  // Accessing Methods Of PassengerPlane
    Poly.poly(Fp);  // Accessing Methods Of FighterPlane
    System.out.println("____________________________________");
    System.out.println("PolyMorphism Achieved.....");
    System.out.println("Abstracion Is Achieved........");
    
}
}
