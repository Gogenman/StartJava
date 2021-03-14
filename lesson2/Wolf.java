public class Wolf {
    String wolfName;
    String wolfColor;
    float wolfWeight;
    float wolfHight;

    boolean sit() {
        System.out.println("Вы присели");
        return true;
    }

    boolean howl() {
        System.out.println("Вы завыли на луну");
        return true;
    }

    void run() {
        System.out.println("Вы пробежали 1 км");
    }

    void hunt() {
        System.out.println("Вы загрызли одного зайца");
    }
}