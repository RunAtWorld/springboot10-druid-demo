
package dev.lpf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * HiController 测试
 */
@RestController
public class HiController {
    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

}
