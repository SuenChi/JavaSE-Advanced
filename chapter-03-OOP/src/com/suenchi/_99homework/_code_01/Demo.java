package com.suenchi._99homework._code_01;
/**
 * 题目：
 * 今日,金燕龙110教室为学生的自习室,自习室中今天只来了大郎和金莲两个同学
 * 由于老师开会,需要占用教室,所以大郎和金莲两位学生需要更换到金燕龙111教室
 * 设计程序,完成需求.
 *
 * 提示：
 * 由于跟换教室要是一个学生一个学生的换,很麻烦
 * 所以定义一个变量,让这个变量共享,后面换教室的时候该一次值,其他的学生都跟着改
 *
 * 参考方案：
 * 1.首先我们要定义一个Student类,其中可以包含学号,姓名,以及所在的教室
 * 2.将来我们要创建Student对象,为属性赋值
 * 3.后面两个学生要更换教室,如果单独更换,为每个学生对象的教室属性重新赋值
 *   那么,很麻烦.所以,我们可以static修饰其中的教室属性.因为static修饰的成员属于类成员,不属于对象
 *   在内存中优先于对象存在,而且可以作为共享数据,只要是根据static所在的类创建出来的对象都可以共享
 *   这个成员,所以,当学生换教室的时候就不用挨个重新赋值了!
 * */
public class Demo {
    public static void main(String[] args) {
        Student.setClassroom("金燕龙110");
        Student stu1=new Student("A01","大郎");
        Student stu2=new Student("A02","金莲");
        System.out.println("学号为 : "+stu1.getId()+" 姓名为 : "+stu1.getName()+" 的同学在 : "+Student.getClassroom()+" 教室学习 ");
        System.out.println("学号为 : "+stu2.getId()+" 姓名为 : "+stu2.getName()+" 的同学在 : "+Student.getClassroom()+" 教室学习 ");
        System.out.println("由于老师开会,临时占用教室,学生的自习室更换.");
        Student.setClassroom("金燕龙A111");
        System.out.println("学号为 : "+stu1.getId()+" 姓名为 : "+stu1.getName()+" 的同学在 : "+Student.getClassroom()+" 教室学习 ");
        System.out.println("学号为 : "+stu2.getId()+" 姓名为 : "+stu2.getName()+" 的同学在 : "+Student.getClassroom()+" 教室学习 ");
    }
}
