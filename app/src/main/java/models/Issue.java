package models;

import java.util.ArrayList;
import java.util.List;

public class Issue {
    public IssueCategory category;
    public String title;
    public String description;
    public String RootCause;
    public ArrayList<String> Preventions = new ArrayList<>();
    public ArrayList<String> EmergencyPreventions= new ArrayList<>();
    public ArrayList<String> Symptoms= new ArrayList<>();

    public Issue(IssueCategory category, String t, String d, ArrayList<String> preventions,ArrayList<String> ep,ArrayList<String> Symptoms){
        this.category = category;
        this.title = t;
        this.description = d;
        this.Preventions = preventions;
        this.EmergencyPreventions = ep;
        this.Symptoms = Symptoms;
    }
    public Issue(){}

}


