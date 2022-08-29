package com.baeldung.modules.main;
import com.baeldung.modules.hello.HelloModules;
import com.baeldung.modules.hello.HelloService;

import java.util.ServiceLoader;

public class MainApp {
	public static void main(String[] args) {
		HelloModules.doSomething();

		ServiceLoader<HelloService> load = ServiceLoader.load(HelloService.class);
		load.iterator().next()
				.sayHello();
	}
}
