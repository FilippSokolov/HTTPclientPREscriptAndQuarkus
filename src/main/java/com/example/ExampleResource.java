package com.example;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Timer;

//@Path("/hello")
//public class ExampleResource {
//
//
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String hello() {
//        return "Hello from RESTEasy Reactive";
//    }
//
//    @POST
//    @Consumes(MediaType.TEXT_PLAIN)
//    @Produces(MediaType.TEXT_PLAIN)
//    public String hello2(String message) {
//        return message;
//    }
//}

@Path("hello")
public class ExampleResource {

    @Path("{timestamp}/{signature}/{envVal}/{envValChanged}")
    @GET
    public String personalisedHello(String timestamp, String signature, int envVal, String envValChanged) {
        return "Hello " + timestamp + " is your age really " + signature + "?" + "  Also here envVal: " + envVal + "  HERE CHANGED ENV VAL:" + envValChanged;
    }

    @GET
    public String genericHello() {
        return "Hello stranger";
    }
}