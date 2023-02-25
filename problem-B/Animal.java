public class Animals{
    public static void main(String[] args){
        Fish d = new Fish();
        d.setName("Somename");
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        System.out.println(d.getName());
        d.walk();
        d.eat();
        d.play();

        System.out.println("\nCat:");
        c.walk();
        c.eat();
        c.play();

        System.out.println("\nAnimal(fish):");
        a.walk();
        a.eat();

        System.out.println("\nAnimal(spider):");
        e.walk();
        e.eat();

        System.out.println("\nPet(cat):");
        p.play();
    }
}

class Animal {
     int legs;

        protected Animal(int legs) {
            this.legs = legs;
        }

        public void walk() {
            System.out.println("This animal walks on " + legs + " legs");
        }

    public void eat() {

    }
}
