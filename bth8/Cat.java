package bth8;
class Cat extends Animal{
    private static int population = 0;
    public Cat(String name) {
        super(name);
        Cat.population += 1; 
        System.out.println("This is cat");
    }
    
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
    @Override
    public int getPopulation(){
        return Cat.population;
    }
    @Override
    public Cat giveBirth(){
        return (new Cat(getName() + "'s baby"));
    }
    @Override
    public void Die(){
        System.out.println("This cat named " + getName() + " has died"); 
        if("live".equals(getStatus())){
            Cat.population -= 1;
            setStatus("died");
        }
    }
    
}