public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        
        System.out.println("Wolf name = " + wolfOne.getName());
        System.out.println("Wolf color = " + wolfOne.getColor());
        System.out.println("Wolf age = " + wolfOne.getAge());
        System.out.println("Weight = " + wolfOne.getWeight());
        System.out.println("Hight = " + wolfOne.getHight());
        wolfOne.sit();
        wolfOne.howl();
        wolfOne.run();
        wolfOne.hunt();
    }
}