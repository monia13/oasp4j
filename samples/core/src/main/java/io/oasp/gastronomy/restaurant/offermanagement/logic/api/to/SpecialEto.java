package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Special;
import io.oasp.module.basic.common.api.to.AbstractEto;

/**
 * The {@link io.oasp.module.basic.common.api.to.AbstractEto ETO} for a {@link Special}.
 *
 */
public class SpecialEto extends AbstractEto implements Special {

  /** UID for serialization. */
  private static final long serialVersionUID = 1L;

  private String name;

  private OfferEto offer;

  private WeeklyPeriodEto activePeriod;

  private Money specialPrice;

  /**
   * The constructor.
   */
  public SpecialEto() {

    super();
  }

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return offer
   */
  public OfferEto getOffer() {

    return this.offer;
  }

  /**
   * @param offer new value of {@link #getoffer}.
   */
  public void setOffer(OfferEto offer) {

    this.offer = offer;
  }

  /**
   * @return activePeriod
   */
  public WeeklyPeriodEto getActivePeriod() {

    return this.activePeriod;
  }

  /**
   * @param activePeriod new value of {@link #getactivePeriod}.
   */
  public void setActivePeriod(WeeklyPeriodEto activePeriod) {

    this.activePeriod = activePeriod;
  }

  /**
   * @return specialPrice
   */
  public Money getSpecialPrice() {

    return this.specialPrice;
  }

  /**
   * @param specialPrice new value of {@link #getspecialPrice}.
   */
  public void setSpecialPrice(Money specialPrice) {

    this.specialPrice = specialPrice;
  }

  /**
   * @return serialversionuid
   */
  public static long getSerialversionuid() {

    return serialVersionUID;
  }

}
