package bva.json.context;

import java.util.HashMap;

public class Template {
    private HashMap<String, Object> template;

    public Template(String template) throws Exception {
        this.template = createTemplate(template);
    }

    private HashMap<String, Object> createTemplate(String template) throws Exception {

    }

    public HashMap<String, Object> getTemplate() {
        return template;
    }
}
