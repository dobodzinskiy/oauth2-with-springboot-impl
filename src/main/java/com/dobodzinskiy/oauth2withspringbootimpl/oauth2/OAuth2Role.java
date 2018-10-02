package com.dobodzinskiy.oauth2withspringbootimpl.oauth2;

public enum OAuth2Role {
    ROLE_USER("ROLE_USER"),
    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_MERCHANT("ROLE_MERCHANT");

    private String value;

    OAuth2Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static OAuth2Role getEnum(String value) {
        for (OAuth2Role v : values())
            if (v.getValue().equalsIgnoreCase(value)) {
                return v;
            }

        throw new IllegalArgumentException(String.format("Cannot convert '%s' value to enum", value));
    }
}
