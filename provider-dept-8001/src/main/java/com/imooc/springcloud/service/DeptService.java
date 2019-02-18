package com.imooc.springcloud.service;

import com.imooc.entity.Dept;

import java.util.List;

public interface DeptService {

	public boolean add(Dept dept);

	public Dept get(long id);

	public List<Dept> list();
}
