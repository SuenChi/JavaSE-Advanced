package com.suenchi._03communicate;

/**
 * PROJECT_NAME: advanced-415
 * NAME: ProducerThread 生产者线程
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/28
 */
public class ProducerThread extends Thread{
    //将Desk生成为线程成员变量
    private Desk desk;

    public ProducerThread(Desk desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
        while (true) {
            try {
                desk.make(); //做
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
