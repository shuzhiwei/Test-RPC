/**
 * 
 * DO NOT EDIT DIRECTLY
 */
package rpc.service;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface AddService {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"AddService\",\"namespace\":\"rpc.service\",\"types\":[],\"messages\":{\"add\":{\"request\":[{\"name\":\"a\",\"type\":\"int\"},{\"name\":\"b\",\"type\":\"int\"}],\"response\":\"int\"}}}");
  int add(int a, int b) throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  public interface Callback extends AddService {
    public static final org.apache.avro.Protocol PROTOCOL = rpc.service.AddService.PROTOCOL;
    void add(int a, int b, org.apache.avro.ipc.Callback<java.lang.Integer> callback) throws java.io.IOException;
  }
}