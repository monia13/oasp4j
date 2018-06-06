package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api;

import java.time.DayOfWeek;

import javax.persistence.Embeddable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Embeddable
public class WeeklyPeriodEmbeddable {

  private DayOfWeek startingDay;

  private int startingHour;

  private DayOfWeek endingDay;

  private int endingHour;

  public DayOfWeek getStartingDay() {

    return this.startingDay;
  }

  public void setStartingDay(DayOfWeek startingDay) {

    this.startingDay = startingDay;
  }

  @Max(24)
  @Min(0)
  public int getStartingHour() {

    return this.startingHour;
  }

  public void setStartingHour(int startingHour) {

    this.startingHour = startingHour;
  }

  public DayOfWeek getEndingDay() {

    return this.endingDay;
  }

  public void setEndingDay(DayOfWeek endingDay) {

    this.endingDay = endingDay;
  }

  @Max(24)
  @Min(0)
  public int getEndingHour() {

    return this.endingHour;
  }

  public void setEndingHour(int endingHour) {

    this.endingHour = endingHour;
  }
}
