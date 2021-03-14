public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.wolfName = "GreyWolf";
        wolfOne.wolfColor = "Grey";
        wolfOne.wolfWeight = 67.4f;
        wolfOne.wolfHight = 58.5f;
        
        System.out.println("wolf name = " + wolfOne.wolfName);
        System.out.println("Wolf color = " + wolfOne.wolfColor);
        System.out.println("Weight = " + wolfOne.wolfWeight);
        System.out.println("Hight = " + wolfOne.wolfHight);
        wolfOne.sit();
        wolfOne.howl();
        wolfOne.run();
        wolfOne.hunt();

        
    }
}