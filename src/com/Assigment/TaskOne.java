package com.Assigment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TaskOne {

	public static void main(String[] args) throws ParseException
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		ProjectUtils pu=new ProjectUtils();
Map<Project, Employee> map=pu.loadProjects();
pu.displayByProjectID(map);
System.out.println("*****************");
pu.displayByProjectDomain(map);

	}

}
