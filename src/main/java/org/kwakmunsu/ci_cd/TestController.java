package org.kwakmunsu.ci_cd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/health")
    public String health() {
        return "hello!!";
    }

}