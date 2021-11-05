package net.dg.wiremockdemo.controller;

import net.dg.wiremockdemo.proxy.HttpBinProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final HttpBinProxy httpBinProxy;

    public DemoController(HttpBinProxy httpBinProxy) {
        this.httpBinProxy = httpBinProxy;
    }

    @GetMapping("/demo")
    public String getAnything(){
        return httpBinProxy.getAnything();
    }

}
