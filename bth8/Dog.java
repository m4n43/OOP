package bth8;
class Dog extends Animal{
    private static int population = 0;
    public Dog(String name) {
        super(name);
        Dog.population += 1;
        System.out.println("This is Dog");
    }
    @Override
    public void makeSound(){
        System.out.println("Gau");
    }
    @Override
    public int getPopulation(){
        return Dog.population;
    }
    @Override
    public Dog giveBirth(){
        return (new Dog(getName() + "'s baby"));
    }
    @Override
    public void Die(){
        System.out.println("This dog named " + getName() + " has died"); 
        if("live".equals(getStatus())){
            Dog.population -= 1;
            setStatus("died");
        }
    }
}