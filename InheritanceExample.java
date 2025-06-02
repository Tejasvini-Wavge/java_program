class Animal{
void eat(){
System.out.println("animal eats food");
}
}
class Dog extends Animal{
void bark(){
System.out.println("dogs barks");
}
}
public class InheritanceExample{
public static void main(String args[]){
Dog myDog=new Dog();
myDog.eat();
myDog.bark();
}
}