public class Animal {
    // Animal.java

        private String name;
        private String[] favoriteFoods;

        public Animal(String name, String[] favoriteFoods) {
            this.name = name;
            this.favoriteFoods = favoriteFoods;
        }

        public void makeSound() {
            System.out.println("Unknown animal type");
        }

        public void performTrick() {
            System.out.println("No trick available");
        }

        public void feed() {
            System.out.println("Feeding " + name + " with " + favoriteFoods[0]);
        }

        public void sleep() {
            System.out.println("Animal is sleeping");
        }

        public void exercise() {
            System.out.println("No exercise available");
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getFavoriteFoods() {
        return favoriteFoods;
    }

    public void setFavoriteFoods(String[] favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
    }
}
