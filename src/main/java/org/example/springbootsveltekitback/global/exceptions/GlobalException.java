package org.example.springbootsveltekitback.global.exceptions;

public class GlobalException extends RuntimeException {
    public GlobalException(String resultCode, String msg) {
        super("resultCode=" + resultCode + ",msg=" + msg);
    }
}
