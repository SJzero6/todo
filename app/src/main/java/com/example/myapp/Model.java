package com.example.myapp;

public class Model {

    private String task,discription,date,id;

    public Model(){}
    public Model(String task, String discription, String date, String id) {
        this.task = task;
        this.discription = discription;
        this.date = date;
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
