package com.xingjie.jettyServer;

import org.eclipse.jetty.server.Server;


public class SplitFileServer {

	public static void main( String[] args ) throws Exception
    {
        Server server = new Server();
//        ServerConnector connector = new ServerConnector(server);
//        connector.setPort(8090);
//        server.setConnectors(new Connector[] { connector });
//        ResourceHandler rh0 = new ResourceHandler();
//        ContextHandler context0 = new ContextHandler();
//        context0.setContextPath("/");
//        File dir0 = MavenTestingUtils.getTestResourceDir("dir0");
//        context0.setBaseResource(Resource.newResource(dir0));
//        context0.setHandler(rh0);
//        ResourceHandler rh1 = new ResourceHandler();
//        ContextHandler context1 = new ContextHandler();
//        context1.setContextPath("/");
//        File dir1 = MavenTestingUtils.getTestResourceDir("dir1");
//        context1.setBaseResource(Resource.newResource(dir1));
//        context1.setHandler(rh1);
//        ContextHandlerCollection contexts = new ContextHandlerCollection();
//        contexts.setHandlers(new Handler[] { context0, context1 });
//        server.setHandler(contexts);
//        server.start();
//        System.out.println(server.dump());
//        server.join();
    }
}
