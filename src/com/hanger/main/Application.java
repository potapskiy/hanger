package com.hanger.main;

import com.hanger.config.SpringConfiguration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by b.potapskiy on 04.02.15.
 */

public class Application implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("Starting vPlay 0.2.1");

        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringConfiguration.class);

        servletContext.addListener(new ContextLoaderListener(ctx));

        AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
        dispatcherContext.register(DispatcherServlet.class);

        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
        registration.addMapping("/");
        registration.setLoadOnStartup(1);


    }
}