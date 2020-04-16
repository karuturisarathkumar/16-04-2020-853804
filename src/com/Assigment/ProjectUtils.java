package com.Assigment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ProjectUtils 
{
	public  Map<Project,Employee> loadProjects() throws ParseException
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Map<Project, Employee> map=new LinkedHashMap<Project,Employee>();
		map.put(new Project(105,"AWS",sdf.parse("16-04-2020"),sdf.parse("30-04-2020")),new Employee(853804,"sarath",22000.00,"ksk@gmail.com"));
		map.put(new Project(107,"AWS_INT",sdf.parse("16-04-2020"),sdf.parse("30-04-2020")),new Employee(853762,"sai",23000.00,"sai@gmail.com"));
		map.put(new Project(103,"CMD",sdf.parse("16-04-2020"),sdf.parse("30-04-2020")),new Employee(853806,"sam",30000.00,"sam@gmail.com"));
		map.put(new Project(109,"IOT",sdf.parse("16-04-2020"),sdf.parse("30-04-2020")),new Employee(853366,"tom",42000.00,"tom@gmail.com"));
		map.put(new Project(101,"AWS_INT",sdf.parse("16-04-2020"),sdf.parse("30-04-2020")),new Employee(853818,"jerry",52000.00,"jerry@gmail.com"));
		map.put(new Project(111,"Testing",sdf.parse("16-04-2020"),sdf.parse("30-04-2020")),new Employee(853820,"jessy",52000.00,"jessy@gmail.com"));
		map.put(new Project(121,"Developer",sdf.parse("16-04-2020"),sdf.parse("30-04-2020")),new Employee(853830,"mercy",52000.00,"mercy@gmail.com"));
		map.put(new Project(150,"Support",sdf.parse("16-04-2020"),sdf.parse("30-04-2020")),new Employee(853819,"yamani",52000.00,"yamani@gmail.com"));
		map.put(new Project(123,"IOT",sdf.parse("16-04-2020"),sdf.parse("30-04-2020")),new Employee(853817,"zacob",52000.00,"zacob@gmail.com"));
		map.put(new Project(124,"INT",sdf.parse("16-04-2020"),sdf.parse("30-04-2020")),new Employee(853858,"ashwin",52000.00,"@gmail.com"));
		return map;
	}

public void displayByProjectID(Map<Project,Employee> map)
{
	TreeMap<Project, Employee> tmap=new TreeMap<Project,Employee>(map);
	tmap.entrySet().stream().forEach(t->System.out.println(t));
}
	
public void displayByProjectDomain(Map<Project,Employee> map)
{

	Set<Map.Entry<Project, Employee>> entryset=map.entrySet();
	Comparator<Map.Entry<Project, Employee>> projectcmp=new Comparator<Map.Entry<Project,Employee>>() {
		
		@Override
		public int compare(Entry<Project, Employee> o1, Entry<Project, Employee> o2) 
		{
			
			return o1.getKey().getDomain().compareTo(o2.getKey().getDomain());
		}
	};
	entryset.stream().sorted(projectcmp).forEach(t->System.out.println(t));;
	//TreeMap<Project, Employee> tdmap=new TreeMap<Project,Employee>(map);
	//tdmap.entrySet().stream().forEach(t->System.out.println(t));
}
}
