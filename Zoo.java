// Zoo.java
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final List<Animal> animals;
    private final List<Zookeeper> zookeepers;
    private ZooManager zooManager;

    public Zoo() {
        animals = new ArrayList<>();
        zookeepers = new ArrayList<>();
        zooManager = new ZooManager("John Doe"); // Default manager for simplicity
    }

    public void addAnimal(Animal animal) {
        if(animal!=null)
        {animals.add(animal);
        }
    }

    public void addZookeeper(Zookeeper zookeeper) {
        if(zookeeper!=null)
        {zookeepers.add(zookeeper);
        }
    }

    public void setZooManager(ZooManager zooManager) {
        this.zooManager = zooManager;
    }

    public void performAnimalActivities() {
        try {
            for (Animal animal : animals) {
                animal.makeSound();
                animal.performTrick();
                animal.feed();
                animal.sleep();
                animal.exercise();
                System.out.println("--------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printFavoriteFoods() {
        try {
            for (Animal animal : animals) {
                if (animal.favoriteFoods != null && animal.favoriteFoods.length > 0) {
                    System.out.println(animal.name + "'s favorite food: " + animal.favoriteFoods[0]);
                } else {
                    System.out.println(animal.name + " has no favorite food");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void interactWithZookeepers() {
        try {
            for (Zookeeper zookeeper : zookeepers) {
                if (!animals.isEmpty()) {
                    zookeeper.feedAnimal(animals.get(0)); // Feed the first animal for simplicity
                }
                if (animals.size() > 1) {
                    zookeeper.cleanCage(animals.get(1)); // Clean the cage of the second animal for simplicity
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void announceToManager(String message) {
        zooManager.announce(message);
    }
}
