package models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Student {
    private final StringProperty id;
    private final StringProperty name;
    private final StringProperty email;
    private final StringProperty major;

    public Student(String id, String name, String email, String major) {
        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
        this.email = new SimpleStringProperty(email);
        this.major = new SimpleStringProperty(major);
    }

    public String getId() {
        return id.get();
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public StringProperty idProperty() {
        return id;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public StringProperty emailProperty() {
        return email;
    }

    public String getMajor() {
        return major.get();
    }

    public void setMajor(String major) {
        this.major.set(major);
    }

    public StringProperty majorProperty() {
        return major;
    }
}
