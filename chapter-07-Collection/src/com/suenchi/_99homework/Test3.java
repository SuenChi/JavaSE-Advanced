package com.suenchi._99homework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

/**基础题3:
 * 当我们在京东注册新用户的时候,我们输入一个要注册的用户名,如果之前有该用户名注册过,京东是不会让相同的用户名注册的,会注册失败.
 * 根据以上描述,设计程序,完成注册功能!*/
public class Test3 {
    public static void main(String[] args) {
        //1.创建HashSet集合对象userSet
        HashSet<User> userSet=new HashSet<>();
        Collections.addAll(userSet,new User("suenchi","123"),new User("sunqi","123")
        ,new User("seer","123"));

        //2.接收用户输入的用户名
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入注册的用户名 : ");
            String username=sc.next();
            System.out.println("请输入注册的密码 : ");
            String password=sc.next();
            User user=new User(username,password);
            if(userSet.add(user)){
                System.out.println("注册成功!");
                System.out.println("当前用户集合userSet : "+userSet);
            }else{
                System.out.println("用户名重复,注册失败!!!");
            }
            System.out.println("继续注册吗?(按1继续,按0结束)");
            if((sc.next()).equals("1")){
                continue;
            }else{
                break;
            }
        }
    }
}

class User{
    private String username;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }
}
