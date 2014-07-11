package helloWorld;

import javax.jws.WebService;

//v4

@WebService(name="newname")
public class HelloWorld {

  public void constructor(){
  }
  
  //v2
  public String Hello(String s){
    return "Hello "+ s;
  }

}
