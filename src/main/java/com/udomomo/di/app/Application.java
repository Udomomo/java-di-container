package com.udomomo.di.app;

import com.udomomo.di.app.model.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
  private static final Logger log = LoggerFactory.getLogger(Application.class);
  public static void main(String[] args) {
    Movie movie = new Movie("titanic", 194);
    log.info("name: " + movie.getTitle() + ", length: " + movie.getLengthMinute() + " min");
  }
}
