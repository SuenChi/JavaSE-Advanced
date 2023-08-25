package com.suenchi._02Set;

import java.util.HashSet;
import java.util.Objects;


/**1.创建HashSet对象
 * 2.向HashSet中添加数据
 * 3.JavaBean中equals方法和hashcode方法重写的必要性
 */

public class Demo5 {
    public static void main(String[] args) {
        HashSet<Dog> dogs=new HashSet<>();
        Dog dog1=new Dog("大黄",2);
        Dog dog2=new Dog("大白",1);
        Dog dog3=new Dog("大黄",2);
        Dog dog4=new Dog("大黑",3);
        System.out.println("dog1的哈希值是 : "+dog1.hashCode());
        System.out.println("dog2的哈希值是 : "+dog2.hashCode());
        System.out.println("dog3的哈希值是 : "+dog3.hashCode());
        System.out.println("dog4的哈希值是 : "+dog4.hashCode());
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.forEach(dog -> System.out.println("dog = " + dog));
    }

    public static class Dog{
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

