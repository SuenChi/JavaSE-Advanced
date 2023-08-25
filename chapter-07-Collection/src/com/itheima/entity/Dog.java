package com.itheima.entity;

/**
 * PROJECT_NAME: advanced-415
 * NAME: Dog
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/21
 */
public class Dog implements Comparable<Dog>{
    private String name;
    private Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (name != null ? !name.equals(dog.name) : dog.name != null) return false;
        return age != null ? age.equals(dog.age) : dog.age == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dog() {
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Dog o) {
        return o.getAge() - this.getAge();
    }
}
