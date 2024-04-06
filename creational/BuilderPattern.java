package creational;

public class BuilderPattern {
    private int valueInteger;
    private String valueString;

    public int getValueInteger() {
        return valueInteger;
    }

    public String getValueString() {
        return valueString;
    }

    private BuilderPattern(Builder builder) {
        this.valueInteger = builder.getValueInteger();
        this.valueString = builder.getValueString();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private int valueInteger;
        private String valueString;

        public int getValueInteger() {
            return valueInteger;
        }

        public Builder setValueInteger(int valueInteger) {
            this.valueInteger = valueInteger;
            return this;
        }

        public String getValueString() {
            return valueString;
        }

        public Builder setValueString(String valueString) {
            this.valueString = valueString;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }
}
