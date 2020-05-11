package net.Avalith.CollectionsInterfaces.Ej6;

import java.util.Objects;
import java.util.UUID;

public class ClubMember {
    private UUID id;
    private String name;
    private String phone;
    private Integer age;

    public ClubMember(String name, String phone, Integer age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClubMember c = (ClubMember) o;
        return  getId().equals(c.getId())&&
                getName().equals(c.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone, age);
    }
}
