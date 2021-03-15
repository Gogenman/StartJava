public class Wolf {
    String name;
    String color;
    float weight;
    float hight;

    boolean sit() {
        System.out.println("Волк присел");
        return true;
    }

    boolean howl() {
        System.out.println("Волк завыл на луну");
        return true;
    }

    void run() {
        System.out.println("Волк пробежал 1 км");
    }

    void hunt() {
        System.out.println("Волк загрыз одного зайца");
    }
}