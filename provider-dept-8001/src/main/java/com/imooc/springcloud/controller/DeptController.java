package com.imooc.springcloud.controller;

import com.imooc.entity.Dept;
import com.imooc.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;

	@RequestMapping(value = "/dept/add",method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept){
		return deptService.add(dept);
	}

	@RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
	public Dept get(@PathVariable("id")long id){
		return deptService.get(id);
	}

	@RequestMapping(value = "/dept/list",method = RequestMethod.GET)
	public List<Dept> list(){
		return deptService.list();
	}
}
