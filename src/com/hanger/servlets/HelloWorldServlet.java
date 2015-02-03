package com.hanger.servlets;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by b.potapskiy on 03.02.15.
 */
@Path("/hello")
public class HelloWorldServlet {


    @SuppressWarnings("unchecked")
    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public String getHello() {
        JSONObject jsonRequest = new JSONObject();

        String msg;


        try {
            jsonRequest.put("msg", "ok");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonRequest.toString();

    }




}