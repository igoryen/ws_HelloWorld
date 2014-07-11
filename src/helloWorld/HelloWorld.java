package helloWorld;

import javax.jws.WebMethod;
import javax.jws.WebService;

//v4

@WebService(name="newname")
public class HelloWorld {

  public void constructor(){
  }
  
  //v3
  @WebMethod(
      action="newAction",
      operationName="newOperationName")
  public String Hello(String s){
    return "Hello "+ s;
  }

}
