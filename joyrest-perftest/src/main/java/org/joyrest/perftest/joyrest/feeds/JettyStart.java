package org.joyrest.perftest.joyrest.feeds;

import org.joyrest.context.ApplicationContext;
import org.joyrest.jetty.JettyServer;

public class JettyStart {

	public static void main(String[] args) {
		ApplicationConfig configurer = new ApplicationConfig();
		ApplicationContext applicationContext = configurer.initialize();

		JettyServer.start(applicationContext, 5000, "/services");
	}
}
