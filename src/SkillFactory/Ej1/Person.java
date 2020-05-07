package SkillFactory.Ej1;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id) {
        setName(name);
        setAge(age);
        setId(id);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }


    public String getId() {
        return this.id;
    }

    private void setId(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(Person o) {        
        return Integer.compare(this.age, o.getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}