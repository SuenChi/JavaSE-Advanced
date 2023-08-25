package com.suenchi._01inner_class;

/**
 * PROJECT_NAME: advanced-415
 * NAME: StudentOperator
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/15
 */
public interface StudentOperator {
    //打印全部同学信息的抽象方法
    void printStudentInfo(Student[] studentArray);

    //打印全部同学平均的抽象方法
    void printStudentAvgScore(Student[] studentArray);
}
