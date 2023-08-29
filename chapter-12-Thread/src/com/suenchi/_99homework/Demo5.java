package com.suenchi._99homework;

/**
 * 基础题5:
 * 编写四个线程：两个线程打印1-52的整数,另两个线程打字母印A-Z.
 * 整体打印数字和字母的顺序没有要求,要求分别单独看数字,单独看字母为升序排列的
 * 每个数字和字母之间用空格隔开
 * 不要求两个线程轮流打
 */
public class Demo5 {
    public static class printInteger{
        private Integer now;
        private Integer end;

        public Integer getNow() {
            return now;
        }

        public void setNow(Integer now) {
            this.now = now;
        }

        public Integer getEnd() {
            return end;
        }

        public void setEnd(Integer end) {
            this.end = end;
        }

        public printInteger(Integer start, Integer end) {
            this.now = start;
            this.end = end;
        }
    }

    public static class printCharacter{
        private Character now;
        private Character end;

        public Character getNow() {
            return now;
        }

        public void setNow(Character now) {
            this.now = now;
        }

        public Character getEnd() {
            return end;
        }

        public void setEnd(Character end) {
            this.end = end;
        }

        public printCharacter(Character now, Character end) {
            this.now = now;
            this.end = end;
        }
    }

    public static class IntegerPrintRunnable implements Runnable{
        private printInteger p;

        public IntegerPrintRunnable(printInteger p) {
            this.p = p;
        }

        @Override
        public void run() {
            while(true){
                synchronized (this){
                    if(p.getNow()<=p.getEnd()){
                        System.out.print(p.getNow()+" ");
                        p.setNow(p.getNow()+1);
                    }else{
                        break;
                    }
                }
            }
        }
    }

    public static class CharacterPrintRunnable implements Runnable{
        private printCharacter p;

        public CharacterPrintRunnable(printCharacter p) {
            this.p = p;
        }

        @Override
        public void run() {
            while(true){
                synchronized (this){
                    if(p.getNow()<=p.getEnd()){
                        System.out.print(p.getNow()+" ");
                        p.setNow((char) (p.getNow()+1));
                    }else {
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        printCharacter p1=new printCharacter('A','Z');
        printInteger p2=new printInteger(1,52);
        CharacterPrintRunnable task1 = new CharacterPrintRunnable(p1);
        IntegerPrintRunnable task2 = new IntegerPrintRunnable(p2);
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task1);
        Thread t3 = new Thread(task2);
        Thread t4 = new Thread(task2);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
