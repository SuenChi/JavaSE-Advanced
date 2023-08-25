package com.suenchi._99homework;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;


/**进阶题2:
 * 现需要在素材(treeset01)项目中的指定位置补全代码，选择合适的集合存储各个学科的就业数据并进行遍历
 * 输出的结果是按照平均薪资从大到小进行排序的，因此需要使用到TreeSet集合对象存储数据
 */
public class Test5 {
    public static void main(String[] args) {

        // 创建各个学科的平均薪资对象
        Salary javaEESalary = new Salary("JavaEE" , 15756) ;
        Salary htmlSalary = new Salary("HTML&JS+前端" , 14400) ;
        Salary pythonSalary = new Salary("Python+大数据库开发" , 17124) ;
        Salary smartSalary = new Salary("人工智能开发" , 22643) ;
        Salary uiSalary = new Salary("UI/UE设计" , 11530) ;
        Salary testSalary = new Salary("软件测试" , 13145) ;
        Salary mediaSalary = new Salary("新媒体+短视频直播运营" , 11307) ;
        Salary productSalary = new Salary("产品经理" , 16176) ;

        // 补全代码
        TreeSet<Salary> salaries=new TreeSet<>(new Comparator<Salary>() {
            @Override
            public int compare(Salary o1, Salary o2) {
                return o2.getSalary()-o1.getSalary();
            }
        });

        Collections.addAll(salaries,javaEESalary,htmlSalary,pythonSalary,smartSalary,uiSalary,testSalary,mediaSalary,productSalary);

        salaries.forEach(System.out::println);
    }
}
class Salary {

    private String disciplineName ;     // 学科名称
    private Integer salary ;            // 平均薪资

    // 有参构造方法
    public Salary(String disciplineName, Integer salary) {
        this.disciplineName = disciplineName;
        this.salary = salary;
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary{" + "disciplineName='" + disciplineName + '\'' + ", salary=" + salary + '}';
    }
}

