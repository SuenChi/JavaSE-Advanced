package com.suenchi._99homework._04;
//公司的每一个员工都有编号,姓名和其负责的工作
public class Employee {
    private String id;
    private String name;
    public void work(){
        System.out.println("未被重写的work()方法");
    }

    public Employee() {
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
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
}
