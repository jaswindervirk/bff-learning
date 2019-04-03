package com.oyo.consumerbff.bffcore.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

  private static Logger logger= LoggerFactory.getLogger("logstash");
  private static Gson gson = new GsonBuilder().disableHtmlEscaping().create();
  @RequestMapping(value ="/check",method = RequestMethod.GET)
  public String fun()
  {
    HashMap<String,Object> hashMap=new HashMap<>();
    hashMap.put("NameAsli","Jaswinder");
    hashMap.put("Married",false);
    logger.warn("{}",gson.toJson(hashMap));
    return "hi";
  }
}
