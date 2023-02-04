package org.example.controller;

import org.example.controller.responses.SampleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/my-management")
public class MainController {

    @GetMapping
    public SampleResponse getResponse() {
        return SampleResponse.builder()
                .message("Hello World!")
                .build();
    }
}
