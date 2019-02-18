package com.imooc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Data
public class Dept implements Serializable {

	private long deptno;

	private String dname;

	private String db_source;


}


