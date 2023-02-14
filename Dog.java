public class Dog {
    private int age;
    private String name;
    private String color;

    public Dog(){
        this.age = 0;
        this.name = "";
        this.color = "";
    }

    public Dog(int age, String name, String color){
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void addOneAge(){
        this.age++;
    }

    public int birthday(){
        addOneAge();
        return this.age;
    }

    public String toString(){
        return "The dog is named " + this.name + " and is " + this.age + " years old. This dog is " + this.color + ".";
    }
}
