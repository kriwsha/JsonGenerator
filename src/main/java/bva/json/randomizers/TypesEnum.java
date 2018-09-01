package bva.json.randomizers;

public enum TypesEnum {
    STR {
        @Override
        public Class<?> getClassRandom() throws ClassNotFoundException {
            return Class.forName("bva.json.randomizers.StringRandom");
        }
    },
    TEXT {
        @Override
        public Class<?> getClassRandom() throws ClassNotFoundException {
            return Class.forName("bva.json.randomizers.TextRandom");
        }
    },
    NUMBER {
        @Override
        public Class<?> getClassRandom() throws ClassNotFoundException {
            return Class.forName("bva.json.randomizers.NumberRandom");
        }
    },
    DATETIME {
        @Override
        public Class<?> getClassRandom() throws ClassNotFoundException {
            return Class.forName("bva.json.randomizers.DateTimeRandom");
        }
    },
    DATE {
        @Override
        public Class<?> getClassRandom() throws ClassNotFoundException {
            return Class.forName("bva.json.randomizers.DateRandom");
        }
    },
    TIME {
        @Override
        public Class<?> getClassRandom() throws ClassNotFoundException {
            return Class.forName("bva.json.randomizers.TimeRandom");
        }
    },
    GUID {
        @Override
        public Class<?> getClassRandom() throws ClassNotFoundException {
            return Class.forName("bva.json.randomizers.GuidRandom");
        }
    },
    BOOL {
        @Override
        public Class<?> getClassRandom() throws ClassNotFoundException {
            return Class.forName("bva.json.randomizers.BoolRandom");
        }
    },
    PHONE {
        @Override
        public Class<?> getClassRandom() throws ClassNotFoundException {
            return Class.forName("bva.json.randomizers.PhoneRandom");
        }
    },
    NAME {
        @Override
        public Class<?> getClassRandom() throws ClassNotFoundException {
            return Class.forName("bva.json.randomizers.NameRandom");
        }
    },
    EMAIL {
        @Override
        public Class<?> getClassRandom() throws ClassNotFoundException {
            return Class.forName("bva.json.randomizers.EmailRandom");
        }
    },
    CURRENCY {
        @Override
        public Class<?> getClassRandom() throws ClassNotFoundException {
            return Class.forName("bva.json.randomizers.CurrencyRandom");
        }
    },
    WEBSITE {
        @Override
        public Class<?> getClassRandom() throws ClassNotFoundException {
            return Class.forName("bva.json.randomizers.WebSiteRandom");
        }
    },
    GENDER {
        @Override
        public Class<?> getClassRandom() throws ClassNotFoundException {
            return Class.forName("bva.json.randomizers.GenderRandom");
        }
    };

    public abstract Class<?> getClassRandom() throws ClassNotFoundException;

}
