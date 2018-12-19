package com.zttc.itat.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @version 1.0
 * @Description: SpringBoot整合FreeMarker
 * @author: ChenRuiQing.
 * @url： http://127.0.0.1:8080/fmIndex
 * Create Time:  2018-12-14 下午 3:28
 */
@Controller
public class FmController {
    @RequestMapping("/fmIndex")
    public String fmIndex(Map<String,Object> map){
        map.put("name","秦始皇");
        map.put("age","20");
        map.put("sex",1);
        return "fmIndex";
    }
}
