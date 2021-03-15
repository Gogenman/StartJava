public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.name = "GreyWolf";
        wolfOne.color = "Grey";
        wolfOne.weight = 67.4f;
        wolfOne.hight = 58.5f;
        
        System.out.println("wolf name = " + wolfOne.name);
        System.out.println("Wolf color = " + wolfOne.color);
        System.out.println("Weight = " + wolfOne.weight);
        System.out.println("Hight = " + wolfOne.hight);
        wolfOne.sit();
        wolfOne.howl();
        wolfOne.run();
        wolfOne.hunt();
    }
}