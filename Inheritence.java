
    class Animal{
void eat(){
    System.out.println("Animal eats");
}
    }
    class Dog extends Animal{
        void bark(){
            System.out.println("dog barks");
        }
    }
    public class Inheritence{
        public static void main(String[]args){

            Dog d=new Dog();

            d.eat();
            d.bark();
        }
    }
