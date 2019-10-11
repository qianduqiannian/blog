package com.xzg.web.Utils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JsonUtils {
    @GetMapping("/jsonutils")
    public String GetJsonUtils(){
        return "Utils/jsonUtils";
    }
}
