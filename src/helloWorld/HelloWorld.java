package helloWorld;

import javax.jws.WebService;

//v3

@WebService
public class HelloWorld {

  public void constructor(){
  }
  
  //v2
  public String Hello(String s){
    return "Hello "+ s;
  }

}
