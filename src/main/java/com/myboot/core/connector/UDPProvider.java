package com.myboot.core.connector;

import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPProvider {

    public static void main(String[] args) throws SocketException {

        System.out.println("UDPProvider Started!");

        //作为接收者，指定一个端口用于接收数据
        DatagramSocket ds = new DatagramSocket(20000);

        //构建接收实体
        final byte[] buf = new byte[512];
        DatagramSocket receivePack = new DatagramSocket(buf.length);

        //接收
        //ds.receive(receivePack);

    }
}
