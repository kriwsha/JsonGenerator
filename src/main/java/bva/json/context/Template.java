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

        TemplateTokener tokener = new TemplateTokener(template);
        while (tokener.hasNext()) {
            char ch = tokener.next();
            switch (ch) {


            }
        }

        return result;
    }

    public Map<String, ?> getTemplate() {
        return template;
    }
}
