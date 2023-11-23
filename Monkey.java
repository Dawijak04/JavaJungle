public class Monkey extends Animal {

    public Monkey(String name, String[] favoriteFoods) {
        super(name, favoriteFoods);
    }

    @Override
    public void makeSound() {
        System.out.println("Ooh ooh ah ah!");
    }

    @Override
    public void performTrick() {
        System.out.println("Performs somersault");
    }
    @Override
    public void feed() {
        System.out.println("Feeding " + getName() + " with " + getFavoriteFoods()[0]);
    }
}
