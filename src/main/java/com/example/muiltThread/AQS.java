package com.example.muiltThread;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class AQS {
    /**
     * 同步队列中，从尾端加节点的时候，因为尾节点可能随时会变，所以需要保证线程安全CAS
     * 设置同步节点时，因为头节点只有一个，所以只要让新节点成为头结点的后继节点，再断开头结点的next
     */

    /**
     * 区分两个队列：同步队列 / 等待队列
     */

    /**
     * waitStatus: 1 --CANCEL(超时等待/被中断的线程，将要从同步队列中移除)
     *            -1 --SINGLE(后继线程处于等待状态，当前线程释放同步状态或被取消，通知后继节点)
     *            -2 --CONDITIONAL(该线程处于等待队列中，被唤醒后进入同步队列中)
     */


}
