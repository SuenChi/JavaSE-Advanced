package com.suenchi._02Set;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

/**TreeSet
 *
 */
public class Demo6 {
    public static void main(String[] args) {
        TreeSet<Dog> dogTreeSet = new TreeSet<>(new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                int i = o1.getAge() - o2.getAge();
                if (i == 0) {
                    return o1.equals(o2) ? 0 : 1;
                }
                return i;
            }
        });
        Dog dog1=new Dog("大黄",2);
        Dog dog2=new Dog("大白",1);
        Dog dog3=new Dog("大黄",2);
        Dog dog4=new Dog("大黑",3);
        dogTreeSet.add(dog1);
        dogTreeSet.add(dog2);
        dogTreeSet.add(dog3);
        dogTreeSet.add(dog4);
        System.out.println("dogTreeSet = " + dogTreeSet);
    }
    public static class Dog {
        private String name;
        private Integer age;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dog dog = (Dog) o;
            return Objects.equals(name, dog.name) && Objects.equals(age, dog.age);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
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

        public Dog(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public Dog() {
        }
    }
}

