package bva.json.context;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class TemplateTokener {
    private String tempStr;
    private Iterator<Character> iterator;

    public TemplateTokener(String tempStr) {
        LinkedList<Character> list = new LinkedList<>();
        for (Character ch : tempStr.toCharArray())
            list.add(ch);
        iterator = list.iterator();
    }

    public Character next() {
        return iterator.next();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }
}
