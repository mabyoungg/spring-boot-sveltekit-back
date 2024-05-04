package org.example.springbootsveltekitback.global.exceptionHandlers;

import lombok.RequiredArgsConstructor;
import org.example.springbootsveltekitback.global.exceptions.GlobalException;
import org.example.springbootsveltekitback.global.rq.Rq;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(annotations = Controller.class)
@RequiredArgsConstructor
public class GlobalCommonExceptionHandler {
    private final Rq rq;

    @ExceptionHandler(GlobalException.class)
    public String handle(GlobalException ex) {
        return rq.historyBack(ex);
    }
}
