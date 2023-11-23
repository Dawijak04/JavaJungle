public class Elephant extends Animal {

    public Elephant(String name, String[] favoriteFoods) {
        super(name, favoriteFoods);
        }

        @Override
        public void makeSound() {
        System.out.print("Trumpet");
        }

        @Override
        public void exercise() {
            System.out.println("Elephant is lifting weights");
        }

        @Override
        public void feed() {
            System.out.println("Feeding " + getName() + " with " + getFavoriteFoods()[0]);
        }
}
