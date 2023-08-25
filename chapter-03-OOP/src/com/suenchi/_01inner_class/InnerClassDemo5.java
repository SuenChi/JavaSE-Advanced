package com.suenchi._01inner_class;

/**
 * 学生信息管理模块
 * PROJECT_NAME: advanced-415
 * NAME: InnerClassDemo5
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/15
 */
public class InnerClassDemo5 {
    public static void main(String[] args) {
        Student[] studentArray = new Student[5];
        studentArray[0] = new Student("张二狗", "男", 100);
        studentArray[1] = new Student("李狗蛋", "男", 96);
        studentArray[2] = new Student("刘铁柱", "男", 60);
        studentArray[3] = new Student("王小花", "女", 0);
        studentArray[4] = new Student("张美丽", "女", 99);

        //创建StudentOperatorImpl实现类对象并且作为StudentOperator接口的参数传递(多态)
        printStudentInfo(studentArray, new StudentOperatorImpl());

        System.out.println("============================================");

        //创建StudentOperator接口的匿名内部类作为参数传递
        printStudentInfo(studentArray, new StudentOperator() {
            @Override
            public void printStudentInfo(Student[] studentArray) {
                int maleCnt=0,femaleCnt=0;
                for (int i = 0; i < studentArray.length; i++) {
                    Student stu= studentArray[i];
                    if (stu.getGender().equals("男")){
                        maleCnt++;
                    }else if(stu.getGender().equals("女")){
                        femaleCnt++;
                    }
                    System.out.println("学生姓名 : "+stu.getName()+" 学生性别 : "+stu.getGender()+" 学生分数 : "+stu.getScore());
                }
                System.out.println("男生人数 : "+ maleCnt+" 女生人数 : "+femaleCnt);
            }

            @Override
            public void printStudentAvgScore(Student[] studentArray) {
                int sum=studentArray[0].getScore(),max=studentArray[0].getScore(),min=studentArray[0].getScore();
                for (int i = 1; i < studentArray.length; i++) {
                    if(studentArray[i].getScore()>max){
                        max=studentArray[i].getScore();
                    }
                    if(studentArray[i].getScore()<min){
                        min=studentArray[i].getScore();
                    }
                    sum+=studentArray[i].getScore();
                }
                double ave=1.0*(sum-max-min)/(studentArray.length-2);
                System.out.println("去掉最高分 : "+max+" 去掉最低分 : "+min+" 后,学生平均分为 : "+ ave);
            }
        });


    }

    //定义一个方法,方法可以接收保存了学生信息的数组以及操作方案(接口)
    public static void printStudentInfo(Student[] studentArray, StudentOperator studentOperator) {
        //将学生数组传递到接口引用调用的方法中(具体的实现逻辑)
        studentOperator.printStudentInfo(studentArray);
        studentOperator.printStudentAvgScore(studentArray);
    }

}
