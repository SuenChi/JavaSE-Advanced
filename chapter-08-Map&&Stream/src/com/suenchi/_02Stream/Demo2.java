package com.suenchi._02Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**终结方法
 * 1.public void forEach(Consumer<T> c)
 * 2.public List collect(Collectors.toList())
 * 3.public Set collect(Collectors.toSet())
 * 4.public long count()
 */
public class Demo2 {
    private static final ArrayList<Person> PERSON_LIST = new ArrayList<>();
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
    public static class Person{
        private String id;
        private String name;
        private Integer age;
        private String address;
        private String gender;

        @Override
        public String toString() {
            return "Person{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(age, person.age) && Objects.equals(address, person.address) && Objects.equals(gender, person.gender);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, age, address, gender);
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

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public Person(String id, String name, Integer age, String address, String gender) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.address = address;
            this.gender = gender;
        }

        public Person() {
        }
    }

    public static void main(String[] args) {
        /**(1)public void forEach(Consumer<T> c)
         * 传递消费逻辑，消费流中剩余的每个元素
         */
        System.out.println("(1)----------------------------------------------------------");
        PERSON_LIST.stream().forEach(System.out::println);

        /**(2)public List collect(Collectors.toList())
         * 将流中元素收集到List集合中
         */
        System.out.println("(2)----------------------------------------------------------");
        List<Person> personList = PERSON_LIST.stream()
                .filter(person -> person.getAddress().startsWith("北京"))
                .filter(person -> person.getGender().equals("男"))
                .distinct() //去重
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())  //按照年龄, 从大到小排序
                .collect(Collectors.toList());
        System.out.println(personList);

        /**(3)public Set collect(Collectors.toSet())
         * 将流中元素收集到Set集合中
         */
        System.out.println("(3)----------------------------------------------------------");
        Set<Person> personSet = PERSON_LIST.stream()
                .filter(person -> person.getAddress().startsWith("北京"))
                .filter(person -> person.getGender().equals("男"))
                .collect(Collectors.toSet());
        System.out.println("personSet = " + personSet);

        /**(4)public long count()
         * 返回流中剩余元素的个数
         */
        System.out.println("(4)----------------------------------------------------------");
        long count = PERSON_LIST.stream()
                .filter(person -> person.getAddress().startsWith("北京"))
                .filter(person -> person.getGender().equals("男"))
                .distinct()
                .count();
        System.out.println("北京男性的个数是:" + count);
    }
}
