package com.sjsushil09.designpatterns.creational.builder;

import lombok.Data;
import lombok.Getter;

@Data
public class Phone {
    private int ram;
    private int internalStorage;
    private String modelName;
    private String operatingSystem;

    public Phone(PhoneBuilder phoneBuilder) {
        this.ram = phoneBuilder.getRam();
        this.internalStorage = phoneBuilder.getInternalStorage();
        this.modelName = phoneBuilder.getModelName();
        this.operatingSystem = phoneBuilder.getOperatingSystem();
    }

    @Getter
    static class PhoneBuilder {
        private int ram;
        private int internalStorage;
        private String modelName;
        private String operatingSystem = "Android 14";

        public PhoneBuilder() {
        }

        public PhoneBuilder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public PhoneBuilder internalStorage(int internalStorage) {
            this.internalStorage = internalStorage;
            return this;
        }

        public PhoneBuilder modeName(String modeName) {
            this.modelName = modeName;
            return this;
        }

        public PhoneBuilder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Phone buildPhone() {
            return new Phone(this);
        }
    }

    public static PhoneBuilder builder() {
        return new PhoneBuilder();
    }

}
