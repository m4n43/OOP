package bth8;
class Cow extends Animal{
    private static int population = 0;
    public Cow(String name) {
        super(name);
        Cow.population += 1;
        System.out.println("This is cow");
    }
    @Override
    public void makeSound(){
        System.out.println("Moo");
    }
    @Override
    public int getPopulation(){
        return Cow.population;
    }
    @Override
    public Cow giveBirth(){
        return (new Cow(getName() + "'s baby"));
    }
    @Override
    public void Die(){
        System.out.println("This cow named " + getName() + " has died"); 
        if("live".equals(getStatus())){
            Cow.population -= 1;
            setStatus("died");
        }
    }
}
