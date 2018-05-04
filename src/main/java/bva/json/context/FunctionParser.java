package bva.json.context;

import bva.json.exceptions.WrongTemplateException;

import java.lang.reflect.Method;

public class FunctionParser {
    public Method getMethod(String function) throws WrongTemplateException, ClassNotFoundException, NoSuchMethodException {
        function = function.trim();
        if (function.charAt(0)!='$' || function.charAt(function.length()-1)!='$')
            throw new WrongTemplateException("function name should start with '$'");
        Class<?> clazz = FunctionEnum.valueOf(function).getType().getClassRandom();
        return clazz.getMethod("next");
    }
}
