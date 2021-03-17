public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.setName("Ivan");
        System.out.println("Wolf name = " + wolfOne.getName());
        wolfOne.setColor("Grey");
        System.out.println("Wolf color = " + wolfOne.getColor());
        wolfOne.setAge(10);
        System.out.println("Wolf age = " + wolfOne.getAge());
        wolfOne.setWeight(57.7f);
        System.out.println("Weight = " + wolfOne.getWeight());
        wolfOne.setHight(46.8f);
        System.out.println("Hight = " + wolfOne.getHight());

        wolfOne.sit();
        wolfOne.howl();
        wolfOne.run();
        wolfOne.hunt();
    }
}