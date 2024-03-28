class Animal{
public void displayInfo(){
    System.out.println("i am not perfect");
}
}
class Dog extends Animal{
    @override
    public void displayInfo(){
    }
}
class Main{
    public static void main(String args[]){
        Dog d1=new Dog();
        d1.displayInfo();
    }
}
