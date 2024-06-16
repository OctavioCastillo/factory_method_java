public class Main {
    public static void main(String[] args) {

        CarsFactory sedan = new Sedan("black");
        CarsFactory pickups = new Pickups("green");
        CarsFactory electrics = new Electric("blue");

        sedan.addBody();
        sedan.addDoors();
        sedan.paint("blue");

        pickups.addBody();
        pickups.addDoors();
        pickups.paint("red");

        electrics.addBody();
        electrics.addDoors();
        electrics.paint("gray");

        }
    }