package com.ohgiraffers.jwtsecurity.user.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/* PreAuthorize: 어노테이션에 권한 설정 */
@PreAuthorize("hasAuthority('ADMIN')")
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "test GET";
    }

    @PostMapping("/test")
    public String test2(){
        return "test POST";
    }
}
