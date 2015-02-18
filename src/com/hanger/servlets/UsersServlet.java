package com.hanger.servlets;


import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.hanger.model.User;
import com.hanger.utils.Messages;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UsersServlet {

    @RequestMapping("register")
    public String registerUser(String incomeJSON) {


        ObjectMapper mapper = new ObjectMapper();

        String msg;
        try {

            System.out.println("income: " + incomeJSON);

            User user = mapper.readValue(
                    incomeJSON, User.class);

            System.out.println("User: " + user.toString());

            msg = Messages.OK;

        } catch (Exception e) {
            msg = Messages.ERROR;
        }


        ObjectNode msg1 = mapper.createObjectNode().put("msg", msg);
        return msg1.asText();

    }


}