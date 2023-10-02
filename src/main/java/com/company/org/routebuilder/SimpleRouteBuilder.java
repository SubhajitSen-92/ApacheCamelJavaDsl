package com.company.org.routebuilder;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("direct:start")
		.log("start route")
		.to("direct:print");
		
		from("direct:print")
		.log("first route");
		
	}

}
