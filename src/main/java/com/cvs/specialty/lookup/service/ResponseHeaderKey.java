package com.cvs.specialty.lookup.service;

public enum ResponseHeaderKey {
	HTTP_STATUS_CODE("Http-Status-Code"),
	CUSTOM_STATUS_CODE("Custom-Status-Code"),
	CUSTOM_STATUS_DESCRIPTION("Custom-Status-Desc")
    ;

    private final String text;

    /**
     * @param text
     */
    private ResponseHeaderKey(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }
}