package net.dg.wiremockdemo.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "httpbin", url = "${base.url.httpbin}")
public interface HttpBinProxy {

    @GetMapping("/anything")
    String getAnything();
}
