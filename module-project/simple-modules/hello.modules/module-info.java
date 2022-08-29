module hello.modules {

	provides com.baeldung.modules.hello.HelloService with com.baeldung.modules.hello.HelloModules;
	exports com.baeldung.modules.hello;
}
