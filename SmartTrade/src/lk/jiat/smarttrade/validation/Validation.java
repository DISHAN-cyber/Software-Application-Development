package lk.jiat.smarttrade.validation;

public enum Validation {
    EMAIL() {
        @Override
        public String validate() {
            return "^[a-zA-Z0-9_!#$%&amp;'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        }
    },
    MOBILE() {
        @Override
        public String validate() {
            return "^(0{1})(7{1})([0|1|2|4|5|6|7|8]{1})([0-9]{7})";
        }
    },
    PASSWORD() {
        @Override
        public String validate() {
            return "^.*(?=.{4,8})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
        }
    };

    public String validate() {
        return "";
    }
}
