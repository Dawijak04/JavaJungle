public class Lion extends Animal{

    public Lion(String name, String[] favoriteFoods) {
        super(name, favoriteFoods);
        }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }
    @Override
    public void feed() {
        System.out.println("Feeding " + getName() + " with " + getFavoriteFoods()[0]);
    }
}
