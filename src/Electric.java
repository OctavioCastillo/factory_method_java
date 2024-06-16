public class Electric implements CarsFactory{

    private String color;


    public Electric(String color){
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
        System.out.println("Electric color "+ this.color + " changed to "+ color);
        this.color = color;
    }
}
