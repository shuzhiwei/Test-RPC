package rpc.service;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;

public class Start {

	public static void main(String[] args) throws Exception {
		//--获取Avro RPC通信的客户端对象,并指定连接的服务端地址和端口
		NettyTransceiver client=new NettyTransceiver(
				new InetSocketAddress("127.0.0.1",8888));
		
		//--是获取存储接口的代理类,通过此代理类可以发起远程调用
		AddService proxy=SpecificRequestor.getClient(
				             AddService.class, client);
		//--把数据发送给服务端,并接受返回的结果
		//--为什么要使用RPC通信,好处是什么?
		//--在调用远程方法时,感觉就是在调用本地方法一样
		//--RPC通信,不仅可以调用远程方法,也可以用于传递数据
		int result=proxy.add(2, 3);
		
		System.out.println("客户端收到:"+result);
	}
}
