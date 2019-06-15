package rpc.service;

import java.net.InetSocketAddress;

import org.apache.avro.ipc.NettyServer;
import org.apache.avro.ipc.specific.SpecificResponder;

public class Start {

	public static void main(String[] args) {
		
		//--创建Avro服务端对象
		//--①参:指定存根接口的类,和接口实现类对
		//--②参:服务对外暴露的端口
		NettyServer server=new NettyServer(
				new SpecificResponder(AddService.class,new AddServiceImpl()),
				new InetSocketAddress(8888));
		System.out.println("服务端启动");
	}
}
