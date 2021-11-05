package net.dg.wiremockdemo.controller;

import lombok.AllArgsConstructor;
import net.dg.wiremockdemo.proxy.HttpBinProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DemoController {

    private final HttpBinProxy httpBinProxy;

    @GetMapping("/demo")
    public String getAnything(){
        return httpBinProxy.getAnything();
    }

}
