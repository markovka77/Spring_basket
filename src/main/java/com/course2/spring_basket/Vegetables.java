package com.course2.spring_basket;

import org.springframework.context.annotation.Scope;

import java.util.Objects;
@Scope("Session")
public class Vegetables {
    private String name;
    private Integer id;

    public Vegetables(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetables that = (Vegetables) o;
        return name.equals(that.name) && id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
