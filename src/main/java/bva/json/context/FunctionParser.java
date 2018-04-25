package bva.json.context;

import bva.json.exceptions.WrongTemplateException;

import java.lang.reflect.Method;

public class FunctionParser {
    public Method getMethod(String funtion) throws WrongTemplateException {
        funtion = funtion.trim();
        if (funtion.charAt(0)!='$' || funtion.charAt(funtion.length()-1)!='$')
            throw new WrongTemplateException("function name should start with '$'");

        throw new RuntimeException();
    }
}
