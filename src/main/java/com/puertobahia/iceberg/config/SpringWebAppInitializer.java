package com.puertobahia.iceberg.config;


import com.puertobahia.iceberg.config.security.SecurityConfiguration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringWebAppInitializer implements WebApplicationInitializer {

    //SpringSecurity configuration
    private static Class<?>[] configurationClasses =  new Class<?>[]{SecurityConfiguration.class};

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        //Spring IoC Container
        AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
        appContext.register(ApplicationContextConfig.class);

        //Spring servlet and container registration
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet(
                "SpringDispatcher", new DispatcherServlet(appContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");

    }

//    @Override
//    protected void customizeRegistration(Dynamic registration) {
//        registration.setInitParameter("dispatchOptionsRequest", "true");
//        super.customizeRegistration(registration);
//    }

}
