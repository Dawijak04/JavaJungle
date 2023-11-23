public class ZooKeeper {
    // Zookeeper.java

        private String name;

        public ZooKeeper(String name) {
            this.name = name;
        }

        public void feedAnimal(Animal animal) {
            System.out.println(name + " is feeding " + animal.getName());
        }

        public void cleanCage(Animal animal) {
            System.out.println(name + " is cleaning " + animal + "'s cage");
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
