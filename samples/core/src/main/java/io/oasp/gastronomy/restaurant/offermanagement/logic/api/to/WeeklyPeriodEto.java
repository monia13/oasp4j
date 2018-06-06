package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import java.time.DayOfWeek;

import io.oasp.gastronomy.restaurant.offermanagement.common.api.Special;
import io.oasp.module.basic.common.api.to.AbstractEto;

/**
 * The {@link io.oasp.module.basic.common.api.to.AbstractEto ETO} for a {@link Special}.
 *
 */
public class WeeklyPeriodEto extends AbstractEto {

  /** UID for serialization. */
  private static final long serialVersionUID = 1L;

  private DayOfWeek startingDay;

  private int startingHour;

  private DayOfWeek endingDay;

  private int endingHour;

  /**
   * The constructor.
   */
  public WeeklyPeriodEto() {

    super();
  }

  /**
   * @return startingDay
   */
  public DayOfWeek getStartingDay() {

    return this.startingDay;
  }

  /**
   * @param startingDay new value of {@link #getstartingDay}.
   */
  public void setStartingDay(DayOfWeek startingDay) {

    this.startingDay = startingDay;
  }

  /**
   * @return startingHour
   */
  public int getStartingHour() {

    return this.startingHour;
  }

  /**
   * @param startingHour new value of {@link #getstartingHour}.
   */
  public void setStartingHour(int startingHour) {

    this.startingHour = startingHour;
  }

  /**
   * @return endingDay
   */
  public DayOfWeek getEndingDay() {

    return this.endingDay;
  }

  /**
   * @param endingDay new value of {@link #getendingDay}.
   */
  public void setEndingDay(DayOfWeek endingDay) {

    this.endingDay = endingDay;
  }

  /**
   * @return endingHour
   */
  public int getEndingHour() {

    return this.endingHour;
  }

  /**
   * @param endingHour new value of {@link #getendingHour}.
   */
  public void setEndingHour(int endingHour) {

    this.endingHour = endingHour;
  }

  /**
   * @return serialversionuid
   */
  public static long getSerialversionuid() {

    return serialVersionUID;
  }

}
