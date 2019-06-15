package rpc.service;

import org.apache.avro.AvroRemoteException;

public class AddServiceImpl implements AddService{

	public int add(int a, int b) throws AvroRemoteException {
		//--服务端收到客户端发来的数据,将结果求和后返回
		return a+b;
	}

}
