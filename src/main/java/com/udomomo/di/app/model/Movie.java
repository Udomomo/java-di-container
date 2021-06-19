package com.udomomo.di.app.model;

public class Movie {
  String title;
  int lengthMinute;

  public Movie(String title, int lengthMinute) {
    this.title = title;
    this.lengthMinute = lengthMinute;
  }

  public String getTitle() {
    return title;
  }

  public int getLengthMinute() {
    return lengthMinute;
  }
}
