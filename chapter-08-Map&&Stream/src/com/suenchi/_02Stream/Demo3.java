package com.suenchi._02Stream;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Stream;

/**中间方法
 * (1)Stream<T> filter(Predicate<T> predicate)
 * (2)Stream<T> distinct()
 * (3)Stream<T> sorted(Comparator<T> comparator)
 * (4)Stream<T> limit(long maxSize)
 * (5)Stream<R> map(Function<T, R> mapper)
 * (6)static <T> Stream<T> concat(Stream a,Stream b)
 */
public class Demo3 {
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
        /**(1)Stream<T> filter(Predicate<T> predicate)
         * 对流中的数据进行过滤，基于接口的判断逻辑
         * Predicate: 谓词型接口/判断型接口, 可以针对于一个指定类型的元素进行判断并返回boolean值
         * 建议 : 一个filter内只写一个条件，方便后期维护；
         */
        System.out.println("(1)--------------------------------------------------------------");
        PERSON_LIST.stream()
                .filter(person -> person.getGender().equals("男"))
                .filter(person -> person.getAddress().startsWith("北京"))
                .forEach(System.out::println);  //所有地址在北京的男性

        /**(2)Stream<T> distinct()
         * 基于元素的哈希值和equals方法去除重复元素
         * ★自定义的元素想要正常调用该方法, 一定要重写hashCode和equals方法
         */
        /**(3)Stream<T> sorted(Comparator<T> comparator)
         * 基于自定义比较规则对流中元素进行排序
         */
        System.out.println("(2)(3)--------------------------------------------------------------");
        PERSON_LIST.stream()
                .filter(person -> person.getAddress().startsWith("北京"))
                .filter(person -> person.getGender().equals("男"))
                .distinct() //去重
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .forEach(System.out::println);  //展示所有北京男性的信息(按照年龄的降序排列)

        /**(4)Stream<T> limit(long maxSize)
         * 获取流中的前maxSize个的元素, 其余舍弃
         */
        System.out.println("(4)--------------------------------------------------------------");
        PERSON_LIST.stream()
                .distinct()
                .filter(person -> person.getAddress().startsWith("上海"))
                .filter(person -> person.getGender().equals("女"))
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .limit(1)
                .forEach(System.out::println);  //展示上海年龄最大的女人信息

        /**(5)Stream<R> map(Function<T, R> mapper)
         * 基于传递的元素转换逻辑完成流中的元素转换，并返回保存了转换结果的Stream流；
         * 可以将当前流中T类型的转换为指定的R类型,转换的逻辑需要由开发者自己编写
         */
        System.out.println("(5)--------------------------------------------------------------");
        PERSON_LIST.stream()
                .distinct()
                .map(person -> person.getName())
                .forEach(System.out::println);  //获取将流中所有Person对象的姓名属性

        /**(6)static <T> Stream<T> concat(Stream a,Stream b)
         * 静态方法，合并a和b两个流为一个流
         */
        System.out.println("(6)--------------------------------------------------------------");
        Stream<Integer> stream1 = Stream.of(11, 22, 33, 44, 55);
        Stream<Integer> stream2 = Stream.of(100, 200, 300, 400, 500);
        Stream.concat(stream1, stream2).forEach(System.out::println);

    }
}
