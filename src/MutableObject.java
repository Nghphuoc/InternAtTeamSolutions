public class MutableObject {
    private String name;
    private int age;
    private float height;

    public MutableObject(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public MutableObject(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "MutableObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
