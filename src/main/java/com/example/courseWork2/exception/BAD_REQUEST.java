package com.example.courseWork2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BAD_REQUEST extends RuntimeException{
    public BAD_REQUEST(){super("BAD_REQUEST"); }
}
