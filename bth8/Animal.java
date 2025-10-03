package bth8;
public abstract class Animal {
    private String status = "live";
    private String name; 
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void Die();
    public abstract void makeSound();
    public void Introduce(){
        System.out.println("This animal has name = " + this.name);
        makeSound();
    }
    public abstract int getPopulation();
    public abstract Animal giveBirth();   
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

