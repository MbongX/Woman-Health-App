package models;

import java.util.List;

public class Issue {
    public String title;
    public String description;
    public String RootCause;

    public Issue(String t, String d, String rc){
        this.title = t;
        this.description = d;
        this.RootCause = rc;
    }

}


