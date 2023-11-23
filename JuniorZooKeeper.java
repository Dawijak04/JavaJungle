public class JuniorZooKeeper extends ZooKeeper{



        public JuniorZooKeeper(String name) {
            super(name);
        }



        public void cleanCage(Animal animal) {
            System.out.println(getName() + " is cleaning " + animal + "'s cage");
        }

}
