package com.baeldung.modules.hello;
public class HelloModules implements HelloService {

 public static void doSomething() {
	 System.out.println("Hello,Modules!");
 }

    @Override
    public void sayHello() {
        System.out.println("Hello !!");
    }
}
