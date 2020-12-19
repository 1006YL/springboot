package com.example.springboot.config;

import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;


public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String language=request.getParameter("l");
        System.out.println(language);
        Locale defaultLocale = Locale.getDefault();
        if(language.isEmpty()) {
            String[] split = language.split("_");
            defaultLocale=new Locale(split[0],split[1]);
        }

        return defaultLocale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
