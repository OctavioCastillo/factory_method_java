public class Sedan implements CarsFactory{

    private String color;


    public Sedan(String color){
        this.color = color;
    }

    @Override
    public void addBody(){
        System.out.println("Body added to Sedan");
    }

    @Override
    public void addDoors(){
        System.out.println("Doors added to Sedan");
    }

    @Override
    public void paint(String color){
        System.out.println("Sedan color "+ this.color + " changed to "+ color);
        this.color = color;
    }
}
