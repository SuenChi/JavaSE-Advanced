package com.suenchi._01inner_class;

/**
 * 学生管理接口的实现类
 * PROJECT_NAME: advanced-415
 * NAME: StudentOperatorImpl
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/15
 */
public class StudentOperatorImpl implements StudentOperator {
    @Override
    public void printStudentInfo(Student[] studentArray) {
        for (int i = 0; i < studentArray.length; i++) {
            Student stu = studentArray[i];
            System.out.println("学生姓名 : " + stu.getName() + " 学生性别 : " + stu.getGender() + " 学生分数 : " + stu.getScore());
        }
    }

    @Override
    public void printStudentAvgScore(Student[] studentArray) {
        int sumScore = 0;
        for (int i = 0; i < studentArray.length; i++) {
            sumScore += studentArray[i].getScore();
        }
        System.out.println("全班同学的平均分数 : " + (sumScore / studentArray.length));
    }
}
