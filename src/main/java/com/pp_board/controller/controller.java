package com.pp_board.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pp_board.domain.dto.hukazawa;

@RequestMapping("/odango")
@RestController
public class controller {
	
	@ResponseBody
	@RequestMapping(value="/odango", method=RequestMethod.POST )
	public hukazawa odango(@RequestBody hukazawa hukazawa1){
		System.out.println(hukazawa1);
		hukazawa hukazawa = new hukazawa() ;
		hukazawa.setAge(25);
		hukazawa.setName("terada");
		hukazawa.setSex("woman");
		return hukazawa;
	}
}
