package bva.json.types;

public enum TypesEnum {
    RANDOMSTR {
        @Override
        public Class<?> getRandomClass() throws Exception {
            return Class.forName("bva.json.types.StringRandom");
        }
    },
    RANDOMTEXT {
        @Override
        public Class<?> getRandomClass() throws Exception {
            return Class.forName("bva.json.types.TextRandom");
        }
    },
    NUMBER {
        @Override
        public Class<?> getRandomClass() throws Exception {
            return Class.forName("bva.json.types.NumberRandom");
        }
    },
    DATETIME {
        @Override
        public Class<?> getRandomClass() throws Exception {
            return Class.forName("bva.json.types.DateTimeRandom");
        }
    },
    DATE {
        @Override
        public Class<?> getRandomClass() throws Exception {
            return Class.forName("bva.json.types.DateRandom");
        }
    },
    TIME {
        @Override
        public Class<?> getRandomClass() throws Exception {
            return Class.forName("bva.json.types.TimeRandom");
        }
    },
    GUID {
        @Override
        public Class<?> getRandomClass() throws Exception {
            return Class.forName("bva.json.types.GuidRandom");
        }
    },
    BOOL {
        @Override
        public Class<?> getRandomClass() throws Exception {
            return Class.forName("bva.json.types.BoolRandom");
        }
    },
    PHONE {
        @Override
        public Class<?> getRandomClass() throws Exception {
            return Class.forName("bva.json.types.PhoneRandom");
        }
    },
    NAME {
        @Override
        public Class<?> getRandomClass() throws Exception {
            return Class.forName("bva.json.types.NameRandom");
        }
    },
    EMAIL {
        @Override
        public Class<?> getRandomClass() throws Exception {
            return Class.forName("bva.json.types.EmailRandom");
        }
    },
    CURRENCY {
        @Override
        public Class<?> getRandomClass() throws Exception {
            return Class.forName("bva.json.types.CurrencyRandom");
        }
    },
    WEBSITE {
        @Override
        public Class<?> getRandomClass() throws Exception {
            return Class.forName("bva.json.types.WebSiteRandom");
        }
    },
    GENDER {
        @Override
        public Class<?> getRandomClass() throws Exception {
            return Class.forName("bva.json.types.GenderRandom");
        }
    };

    public abstract Class<?> getRandomClass() throws Exception;

}
