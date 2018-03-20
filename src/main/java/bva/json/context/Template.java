package bva.json.context;

import java.util.HashMap;

public class Template {
    private HashMap<String, Object> template;

    public Template(String template) throws Exception {
        this.template = createTemplate(template);
    }

    private HashMap<String, Object> createTemplate(String template) throws Exception {
        HashMap<String, Object> result = new HashMap<>();
        for (int i=0; i<template.length(); i++) {

        }
        return result;
    }

    public HashMap<String, Object> getTemplate() {
        return template;
    }
}
