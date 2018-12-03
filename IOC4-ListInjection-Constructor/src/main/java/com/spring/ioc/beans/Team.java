package com.spring.ioc.beans;

import java.util.List;

public class Team {
	private List<String> players;
	
	public Team(List<String> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Team [players=" + players + "]";
	}
}
