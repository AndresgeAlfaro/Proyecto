package com.example.proyecto.Models;

public class appointment {
    private medic medic;
    private user user;
    private boolean state;
    private String annotations ;

    public appointment(medic medic, user user, boolean state, String annotations) {
        this.medic = medic;
        this.user = user;
        this.state = state;
        this.annotations = annotations;
    }

    public medic getMedic() {
        return medic;
    }

    public void setMedic(medic medic) {
        this.medic = medic;
    }

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }

    public boolean state() {
        return state;
    }

    public void enable() {
        this.state = true;
    }

    public void disable() {
        this.state = false;
    }

    public String getAnnotations() {
        return annotations;
    }

    public void setAnnotations(String annotations) {
        this.annotations = annotations;
    }
}
