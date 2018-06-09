package com.threadLock;
/**
 *@author zhisiyi
 *@date 2017年3月21日 下午4:05:53
 *@comment
 */
public class SleepWait implements Runnable{
	int number = 10;

    public void firstMethod() throws Exception {
        synchronized (this) {
        	System.out.println("firstMethod");
            number += 100;
            System.out.println(number);
        }
    }

    public void secondMethod() throws Exception {
        synchronized (this) {
        	System.out.println("secondMethod");
            /**
             * (休息2S,阻塞线程)
             * 以验证当前线程对象的机锁被占用时,
             * 是否被可以访问其他同步代码块
             */
//            Thread.sleep(2000);
            this.wait(2000);
            number *= 200;
        }
    }

    @Override
    public void run() {
        try {
            firstMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
    	SleepWait threadTest = new SleepWait();
        Thread thread = new Thread(threadTest);
        thread.start();
        threadTest.secondMethod();
        System.out.println("number="+threadTest.number);
    }
}
