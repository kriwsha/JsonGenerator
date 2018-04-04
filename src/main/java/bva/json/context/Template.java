package bva.json.context;

import bva.json.exceptions.WrongTemplateException;

import java.util.HashMap;
import java.util.Map;

public class Template {
    private Map<String, ?> template;

    public Template(String template) throws Exception {
        this.template = createTemplate(template);
    }

    private Map<String, ?> createTemplate(String template) throws Exception {
        Map<String, Object> result = new HashMap<>();

        if (template.charAt(0) != '{')
            throw new WrongTemplateException("template should start with '{'");
        for (int i=1; i<template.length(); i++) {
            switch (template.charAt(i)) {

            }
        }
        return result;
    }

    public Map<String, ?> getTemplate() {
        return template;
    }
}
