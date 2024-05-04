package org.example.springbootsveltekitback.global.exceptions;

import lombok.Getter;
import org.example.springbootsveltekitback.global.rsData.RsData;
import org.example.springbootsveltekitback.standard.Empty;

@Getter
public class GlobalException extends RuntimeException {
    private final RsData<Empty> rsData;

    public GlobalException(String resultCode, String msg) {
        super("resultCode=" + resultCode + ",msg=" + msg);
        this.rsData = RsData.of(resultCode, msg);
    }
}
