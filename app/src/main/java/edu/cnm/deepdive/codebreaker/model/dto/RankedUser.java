package edu.cnm.deepdive.codebreaker.model.dto;

import com.google.gson.annotations.Expose;

public class RankedUser {

  @Expose
  private String displayName;

  @Expose
  private double averageGuessCount;


  @Expose
  private double averageTime;

  // No setters. Gson doesn't use them.

  public String getDisplayName() {
    return displayName;
  }

  public double getAverageGuessCount() {
    return averageGuessCount;
  }

  public double getAverageTime() {
    return averageTime;
  }
}
