package metrohack.cancerdetector.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

public class ReturnController {
    @GetMapping("result")
    public Map<String, String> sayHello() {
        HashMap<String, String> map = new HashMap<>();
        boolean ai=true;
        if(ai==true) {
            map.put("code", "101");
            map.put("msg", "It is cancer cell.");

        }
        else{
            map.put("code", "102");
            map.put("msg", "It is not cancer cell.");
        }
        return map;
    }
}
