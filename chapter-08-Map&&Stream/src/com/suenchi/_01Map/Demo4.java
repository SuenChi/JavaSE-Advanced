package com.suenchi._01Map;

import java.util.*;

/**Map排序
 * 需求:按照身高完成内容的排序后保存结果并展示
 */
public class Demo4 {
    public static void main(String[] args) {
        //创建HashMap对象
        HashMap<Student, Integer> studentMap = new HashMap<>(); //键: 学生信息, 值: 学生身高
        studentMap.put(new Student("张二狗", 23, 100), 188);
        studentMap.put(new Student("李狗蛋", 21, 88), 177);
        studentMap.put(new Student("刘铁柱", 24, 95), 166);
        studentMap.put(new Student("王小花", 25, 9), 189);

        /**(1)双列变单列
         * 将Map集合转换成保存了所有键值对对象的Set集合
         */
        Set<Map.Entry<Student, Integer>> studentEntrySet = studentMap.entrySet();

        /**(2)单列再转换
         * 将该Set集合转换为一个可排序的List集合
         * public ArrayList(Collection c)
         *      任意一个单列集合都有该构造方法，可以将任意一个单列集合的内容拷贝到当前集合中
         */
        ArrayList<Map.Entry<Student, Integer>> studentEntryList = new ArrayList<>(studentEntrySet);

        /**(3)单列自定义排序规则
         * 传入Comparator接口的实现类对象
         */
        studentEntryList.sort((o1, o2) -> o2.getKey().getScore() - o1.getKey().getScore());

        /**(4)单列变双列
         * 将数据存到LinkedHashMap集合中
         */
        LinkedHashMap<Student, Integer> studentLinkedMap = new LinkedHashMap<>();
        studentEntryList.forEach(entry -> studentLinkedMap.put(entry.getKey(), entry.getValue()));

        //查看结果
        studentLinkedMap.forEach((student, value) -> System.out.println("学生信息 : " + student + " 学生身高 : " + value));
    }

    public static class Student {
        private String name;
        private Integer age;
        private Integer score;

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", score=" + score +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) && Objects.equals(age, student.age) && Objects.equals(score, student.score);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, score);
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

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Student() {
        }

        public Student(String name, Integer age, Integer score) {
            this.name = name;
            this.age = age;
            this.score = score;
        }
    }
}
