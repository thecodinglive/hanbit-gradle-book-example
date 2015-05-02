package info.thecodinglive.hiber.repository;

import info.thecodinglive.hiber.model.Team;


import java.util.List;

public interface TeamDao {

    public void addTeam(Team team);
    public void updateTeam(Team team);
    public Team getTeam(int id);
    public void deleteTeam(int id);
    public List<Team> getTeams();
}
