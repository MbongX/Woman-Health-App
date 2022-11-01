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
    public ArrayList<Object> Icons = new ArrayList<>();

    public Issue(IssueCategory category, String t, String d, ArrayList<String> preventions,ArrayList<String> ep,ArrayList<String> Symptoms,ArrayList<Object> ic){
        this.category = category;
        this.title = t;
        this.description = d;
        this.Preventions = preventions;
        this.EmergencyPreventions = ep;
        this.Symptoms = Symptoms;
        this.Icons = ic;
    }
    public Issue(){}

}


