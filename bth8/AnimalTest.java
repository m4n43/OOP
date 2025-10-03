package bth8;
public class AnimalTest {
    public static void main(String[] args) {
        Animal[] ar = new Animal[10];
        Animal a1 = new Cat("cat1");
        Animal a2 = new Cow("cow1"); 
        Animal a3 = new Dog("dog1");
        a1.Introduce();a2.Introduce();a3.Introduce();
        System.out.printf("%d %d %d",a1.getPopulation(),a2.getPopulation(),a3.getPopulation());
        for(int i =0 ; i < 5; i ++){
            ar[i] = new Cat("Cat Clone" + (i + 1));
        }
        System.out.println("Cat has population of: " + a1.getPopulation()); 
        Animal cow = a2.giveBirth(); 
        System.out.println(cow.getName());
        
        System.out.println("Kill 1 cat");
        a1.Die();
        System.out.println(a1.getStatus());
        System.out.println("Cat has population of: "+a1.getPopulation());
    }
}