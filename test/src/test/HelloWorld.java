package test;

import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String[] args) {
		Logger log = Logger.getLogger(test.HelloWorld.class.getName());

		log.info("--- Start ---");
		log.info("Hello World !");
		for (int i = 0; i < args.length; i++)
			log.info("arg[" + i + "]=" + args[i]);
		log.info("--- Finish ---");

	}

}
