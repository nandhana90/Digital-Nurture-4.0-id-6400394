package com.mockint.springboot_demo;

public class Service {
private Repositiry repository;
public Service(Repositiry repository)
{
	this.repository = repository;
	
}
public String processData()
{
	return "Processed" + repository.getData();
}
}
