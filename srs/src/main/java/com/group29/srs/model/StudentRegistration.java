package com.group29.srs.model;

public class StudentRegistration {
    Long course_id;
    String course_code;
    String name;
    String course_type;

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse_type() {
        return course_type;
    }

    public void setCourse_type(String course_type) {
        this.course_type = course_type;
    }

    public StudentRegistration() {
    }

    public StudentRegistration(Long course_id, String course_code, String name, String course_type) {
        this.course_id = course_id;
        this.course_code = course_code;
        this.name = name;
        this.course_type = course_type;
    }

    @Override
    public String toString() {
        return "StudentRegistration{" +
                "course_id=" + course_id +
                ", course_code='" + course_code + '\'' +
                ", name='" + name + '\'' +
                ", course_type='" + course_type + '\'' +
                '}';
    }
}
