public class Car {
    private  String make;
    private  String model;
    private String color;
    private  String doors;
    private  boolean convertible;
    public void describeCar(){
        System.out.println(doors +"-Door"+
                color +" "+
                make +" "+
                model +" "+
                (convertible ? "Convertible": "")
        );
    }
}
