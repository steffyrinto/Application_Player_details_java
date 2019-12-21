package player;

import skill.Skill;
import team.Team;

public class Player {
	
	
	public Player(String playerName, String country, Skill skill, Team team) {
		
	}
	
	String playerName;
	String country;
	Skill skillns;
	Team teamins;
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Skill getSkillns() {
		return skillns;
	}
	public void setSkillns(Skill skillns) {
		this.skillns = skillns;
	}
	public Team getTeamins() {
		return teamins;
	}
	public void setTeamins(Team teamins) {
		this.teamins = teamins;
	}
	
	
	

}
