package com.suenchi._02Stream;

import java.util.ArrayList;
import java.util.Objects;

/**案例
 * 1.保留所有地址在沈阳, 并且年龄大于18岁的人
 * 2.保留所有地址在上海, 并且年龄大于20岁的人
 * 3.输出北京年龄最小的男人信息(注意去重)
 * 涉及知识点 : Stream流的创建, 中间方法, 终结方法
 *
 */
public class Exam {
    private static final ArrayList<Person> PERSON_LIST = new ArrayList<>();

    public static class Person{
        private String id;
        private String name;
        private Integer age;
        private String address;
        private String sex;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(age, person.age) && Objects.equals(address, person.address) && Objects.equals(sex, person.sex);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, age, address, sex);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    ", sex='" + sex + '\'' +
                    '}';
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
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

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public Person(String id, String name, Integer age, String address, String sex) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.address = address;
            this.sex = sex;
        }

        public Person() {
        }
    }

    static {
        PERSON_LIST.add(new Person("A001", "张二狗", 22, "北京市昌平区", "男"));
        PERSON_LIST.add(new Person("A002", "张四毛", 23, "北京市门头沟区", "女"));
        PERSON_LIST.add(new Person("A002", "张四毛", 23, "北京市门头沟区", "女"));
        PERSON_LIST.add(new Person("A003", "刘铁柱", 19, "北京市通州区", "男"));
        PERSON_LIST.add(new Person("A003", "刘铁柱", 19, "北京市通州区", "男"));
        PERSON_LIST.add(new Person("A003", "刘铁柱", 19, "北京市通州区", "男"));
        PERSON_LIST.add(new Person("A003", "刘铁柱", 19, "北京市通州区", "男"));
        PERSON_LIST.add(new Person("A004", "李狗蛋", 24, "北京市海淀区", "男"));
        PERSON_LIST.add(new Person("A005", "王钢蛋", 33, "上海市徐汇区", "女"));
        PERSON_LIST.add(new Person("A005", "王钢蛋", 33, "上海市徐汇区", "女"));
        PERSON_LIST.add(new Person("A005", "王钢蛋", 33, "上海市徐汇区", "女"));
        PERSON_LIST.add(new Person("A006", "王建国", 32, "上海市浦东新区", "男"));
        PERSON_LIST.add(new Person("A007", "张全蛋", 17, "上海市静安区", "女"));
        PERSON_LIST.add(new Person("A007", "张全蛋", 17, "上海市静安区", "女"));
        PERSON_LIST.add(new Person("A008", "宋援朝", 19, "天津市北辰区", "男"));
        PERSON_LIST.add(new Person("A009", "李爱军", 16, "天津市河北区", "男"));
        PERSON_LIST.add(new Person("A009", "李爱军", 16, "天津市河北区", "男"));
        PERSON_LIST.add(new Person("A010", "张爱民", 19, "天津市和平区", "女"));
        PERSON_LIST.add(new Person("A011", "刘爱党", 24, "沈阳市大东区", "女"));
        PERSON_LIST.add(new Person("A011", "刘爱党", 24, "沈阳市大东区", "女"));
    }

    public static void main(String[] args) {
        //保留所有地址在沈阳, 并且年龄大于18岁的人
        PERSON_LIST.stream()
                .filter(person -> person.getAddress().startsWith("沈阳"))
                .filter(person -> person.getAge()>18)
                .forEach(System.out::println);
        //保留所有地址在上海, 并且年龄大于20岁的人
        PERSON_LIST.stream()
                .filter(person -> person.getAddress().startsWith("上海"))
                .filter(person -> person.getAge()>20)
                .forEach(System.out::println);
        //输出北京年龄最小的男人信息(注意去重)
        PERSON_LIST.stream()
                .distinct()
                .filter(person->person.getAddress().startsWith("北京"))
                .filter(person->person.getSex().equals("男"))
                .sorted((o1,o2)->o2.getAge()-o1.getAge())
                .limit(1)
                .forEach(System.out::println);
    }
}