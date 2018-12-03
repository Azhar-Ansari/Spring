package com.spring.ioc.beans;

import java.util.List;
import java.util.Properties;
import java.util.Set;

public class Team {
	private Set<String> tasks;
	private List<String> members;
	private Properties assignedTasks;

	public Team(List<String> members) {
		this.members = members;
	}

	public void setTasks(Set<String> tasks) {
		this.tasks = tasks;
	}

	public void setAssignedTasks(Properties assignedTasks) {
		this.assignedTasks = assignedTasks;
	}

	@Override
	public String toString() {
		return "Team [tasks=" + tasks + ", members=" + members + ", assignedTasks=" + assignedTasks + "]"+"\n"
		+"Class[tasks: "+tasks.getClass().getName()+", members: "+members.getClass().getName()+", assignedTasks: "+assignedTasks.getClass().getName()+"]";
	}
}
