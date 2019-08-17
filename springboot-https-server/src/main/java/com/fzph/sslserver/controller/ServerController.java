package com.fzph.sslserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class ServerController {
 
  @RequestMapping("/ssl")
  public String getUrlInfo() {
    return "************request https success************";
  }
 
}
