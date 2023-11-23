public class SeniorZooKeeper extends ZooKeeper{



        public SeniorZooKeeper(String name) {
            super(name);
        }


        public void giveMedicine(Animal animal) {
            System.out.println(getName() +  " is giving medicine to " + animal);
        }

}
