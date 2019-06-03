package bva.json.randomizers;

/**
 * Set of randomizers
 */
enum TypesEnum {
    STR {
        @Override
        public Class<? extends RandomValue> getClassRandom() throws ClassNotFoundException {
            return (Class<? extends RandomValue>) Class.forName("bva.json.randomizers.StringRandom");
        }
    },
    TEXT {
        @Override
        public Class<? extends RandomValue> getClassRandom() throws ClassNotFoundException {
            return (Class<? extends RandomValue>) Class.forName("bva.json.randomizers.TextRandom");
        }
    },
    NUMBER {
        @Override
        public Class<? extends RandomValue> getClassRandom() throws ClassNotFoundException {
            return (Class<? extends RandomValue>) Class.forName("bva.json.randomizers.NumberRandom");
        }
    },
    DATETIME {
        @Override
        public Class<? extends RandomValue> getClassRandom() throws ClassNotFoundException {
            return (Class<? extends RandomValue>) Class.forName("bva.json.randomizers.DateTimeRandom");
        }
    },
    DATE {
        @Override
        public Class<? extends RandomValue> getClassRandom() throws ClassNotFoundException {
            return (Class<? extends RandomValue>) Class.forName("bva.json.randomizers.DateRandom");
        }
    },
    TIME {
        @Override
        public Class<? extends RandomValue> getClassRandom() throws ClassNotFoundException {
            return (Class<? extends RandomValue>) Class.forName("bva.json.randomizers.TimeRandom");
        }
    },
    GUID {
        @Override
        public Class<? extends RandomValue> getClassRandom() throws ClassNotFoundException {
            return (Class<? extends RandomValue>) Class.forName("bva.json.randomizers.GuidRandom");
        }
    },
    PHONE {
        @Override
        public Class<? extends RandomValue> getClassRandom() throws ClassNotFoundException {
            return (Class<? extends RandomValue>) Class.forName("bva.json.randomizers.PhoneRandom");
        }
    },
    NAME {
        @Override
        public Class<? extends RandomValue> getClassRandom() throws ClassNotFoundException {
            return (Class<? extends RandomValue>) Class.forName("bva.json.randomizers.NameRandom");
        }
    },
    EMAIL {
        @Override
        public Class<? extends RandomValue> getClassRandom() throws ClassNotFoundException {
            return (Class<? extends RandomValue>) Class.forName("bva.json.randomizers.EmailRandom");
        }
    },
    CURRENCY {
        @Override
        public Class<? extends RandomValue> getClassRandom() throws ClassNotFoundException {
            return (Class<? extends RandomValue>) Class.forName("bva.json.randomizers.CurrencyRandom");
        }
    },
    WEBSITE {
        @Override
        public Class<? extends RandomValue> getClassRandom() throws ClassNotFoundException {
            return (Class<? extends RandomValue>) Class.forName("bva.json.randomizers.WebSiteRandom");
        }
    };

    public abstract Class<? extends RandomValue> getClassRandom() throws ClassNotFoundException;

}
