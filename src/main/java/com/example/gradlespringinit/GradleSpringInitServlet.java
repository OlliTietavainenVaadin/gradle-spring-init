package com.example.gradlespringinit;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import com.vaadin.server.VaadinServlet;

@WebServlet(
    asyncSupported=false,
    urlPatterns={"/*","/VAADIN/*"},
    initParams={
        @WebInitParam(name="ui", value="com.example.gradlespringinit.GradleSpringInitUI")
    })
public class GradleSpringInitServlet extends VaadinServlet { }
