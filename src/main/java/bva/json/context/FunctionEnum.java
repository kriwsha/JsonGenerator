package bva.json.context;

import bva.json.types.TypesEnum;

public enum FunctionEnum {
    DATE("date", TypesEnum.DATE);


    private String name;
    private TypesEnum type;

    public String getName() {
        return name;
    }

    public TypesEnum getType() {
        return type;
    }

    FunctionEnum(String name, TypesEnum type) {
        this.name = name;
        this.type = type;
    }
}
