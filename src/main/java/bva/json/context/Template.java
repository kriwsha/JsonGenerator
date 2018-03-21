package bva.json.context;

import bva.json.exceptions.WrongTemplateException;

import java.util.HashMap;

public class Template {
    private HashMap<String, Object> template;

    public Template(String template) throws Exception {
        this.template = createTemplate(template);
    }

    private HashMap<String, Object> createTemplate(String template) throws Exception {
        HashMap<String, Object> result = new HashMap<>();

        if (template.charAt(0) != '{')
            throw new WrongTemplateException("template should start with '{'");
        for (int i=1; i<template.length(); i++) {
            switch (template.charAt(i)) {

            }
        }
        return result;
    }

    public HashMap<String, Object> getTemplate() {
        return template;
    }
}
