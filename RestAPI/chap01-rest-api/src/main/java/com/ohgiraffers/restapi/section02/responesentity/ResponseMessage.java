package com.ohgiraffers.restapi.section02.responesentity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class ResponseMessage {

    private int httpStatusCode;
    private String message;
    private Map<String, Object> result;
}
