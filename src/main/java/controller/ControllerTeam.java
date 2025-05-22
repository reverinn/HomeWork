package controller;

import model.Team;
import gui.TeamGUI;

public class ControllerTeam {
    private Team team;
    private String scelta;
    public ControllerTeam(Team team) { this.team = team; }

    public void setScelta(String scelta) { this.scelta = scelta; }
    public String getScelta(String scelta) { return scelta; }
}
