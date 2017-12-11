package com.example;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

@ApplicationPath("rest")
@Path("ws")
public class TestWebServices extends Application {
	@GET
	@Path("helloWorld")
	@Produces(MediaType.TEXT_PLAIN)
	public String helloWorld() {
		return "Hello World @ " + new Date() + "\n";
	}

	@GET
	@Path("error")
	@Produces(MediaType.TEXT_PLAIN)
	public String error() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Set<Class<?>> getClasses() {
		return new HashSet<>(Arrays.asList(TestWebServices.class, TestContainerResponseFilter.class));
	}
}
