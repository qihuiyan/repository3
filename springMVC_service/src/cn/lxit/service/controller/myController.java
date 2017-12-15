package cn.lxit.service.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class myController {
	
	@RequestMapping("/userInfo")
	public @ResponseBody Map getUserInfo(){
	   System.out.println("userInfo");
	   ObjectMapper mapper = new ObjectMapper();
	   Map<Object, Object> map = new HashMap<Object, Object>();
	   map.put("111", "lay");
	   map.put("222", "³¤É³");
	   map.put("333", "Ð¡½¾°Á");
		
		return map;
	}

}
