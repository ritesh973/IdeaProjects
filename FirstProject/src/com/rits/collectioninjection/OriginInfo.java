package com.rits.collectioninjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class OriginInfo {

	private Student names[] = new Student[2];
	private List<Student> studList;
	private Map<Integer,String> studenMap;
	private Properties properties;
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public Map<Integer, String> getStudenMap() {
		return studenMap;
	}
	public void setStudenMap(Map<Integer, String> studenMap) {
		this.studenMap = studenMap;
	}
	private Set<Student> studIdsSet;
	public Student[] getNames() {
		return names;
	}
	public void setNames(Student[] names) {
		this.names = names;
	}
	public List<Student> getStudList() {
		return studList;
	}
	public void setStudList(List<Student> studList) {
		this.studList = studList;
	}
	
	public Set<Student> getStudIdsSet() {
		return studIdsSet;
	}
	public void setStudIdsSet(Set<Student> studIdsSet) {
		this.studIdsSet = studIdsSet;
	}
	
}
