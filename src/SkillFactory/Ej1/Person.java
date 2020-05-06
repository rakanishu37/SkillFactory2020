package SkillFactory.Ej1;

public class Person implements Comparable {
    private String name;
    private int age;
    private String id;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public int compareTo(Object o) {
        Person p = null;
        if (o instanceof Person) {
            p = (Person) o;
        } else {
            return -1;
        }

        if (this.age > p.getAge()) {
            return 1;
        } else {
            if (this.age == p.getAge()) {
                return 0;
            } else {
                return -1;
            }
        }
    }


}