public class Wolf {
    private String name = "Grey Wolf";
    private String color = "Grey";
    private int age = 9;
    private float weight = 67.5f;
    private float hight = 84.3f;

    public String getName() {
        return name;
    }

    void setName(String name) {
        if(name == "") {
            System.out.println("Пустая строка");
        } else {
            this.name = "hip";
        }
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        if(color == "") {
            System.out.println("Пустая строка");
        } else {
            this.color = color;
        }
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public float getWeight() {
        return weight;
    }

    void setWeight(float weight) {
        if(weight == 0) {
            System.out.println("Пустая строка");
        } else {
            this.weight = weight;
        }
    }

    public float getHight() {
        return hight;
    }

    void setHight(float hight) {
        if(hight == 0) {
            System.out.println("Пустая строка");
        } else {
            this.hight = hight;
        }
    }

    public boolean sit() {
        System.out.println("Волк присел");
        return true;
    }

    public boolean howl() {
        System.out.println("Волк завыл на луну");
        return true;
    }

    public void run() {
        System.out.println("Волк пробежал 1 км");
    }

    public void hunt() {
        System.out.println("Волк загрыз одного зайца");
    }
}