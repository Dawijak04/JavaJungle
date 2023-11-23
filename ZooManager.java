public class ZooManager {
    // ZooManager.java

        private String name;

        public ZooManager(String name) {
            this.name = name;
        }

        public void announce(String message) {
            System.out.println("Zoo Manager " + name + " announces: " + message);
        }

}
