package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.general.dataaccess.api.ApplicationPersistenceEntity;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Special;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.WeeklyPeriod;

@Entity
@Table(name = "Special")
public class SpecialEntity extends ApplicationPersistenceEntity implements Special {

  private static final long serialVersionUID = 1L;

  /**
   * The constructor.
   */
  public SpecialEntity() {

    super();
  }

  private String name;

  private OfferEntity offer;

  private WeeklyPeriod activePeriod;

  private Money specialPrice;

  @Column(name = "name", unique = true)
  @Override
  public String getName() {

    return this.name;
  }

  @Override
  public void setName(String name) {

    this.name = name;
  }

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "offerId")
  public OfferEntity getOffer() {

    return this.offer;
  }

  @Override
  public void setOffer(OfferEntity offer) {

    this.offer = offer;
  }

  @Column(name = "price")
  @Override
  public Money getSpecialPrice() {

    return this.specialPrice;
  }

  @Override
  public void setSpecialPrice(Money specialPrice) {

    this.specialPrice = specialPrice;
  }

  public static long getSerialversionuid() {

    return serialVersionUID;
  }

  @Column(name = "activePeriod")
  @Embedded
  public WeeklyPeriod getActivePeriod() {

    return this.activePeriod;
  }

  @Override
  public void setActivePeriod(WeeklyPeriod weeklyPeriod) {

    WeeklyPeriodEmbeddable period = new WeeklyPeriodEmbeddable();
    period.setEndingDay(weeklyPeriod.getEndingDay());
    period.setEndingHour(weeklyPeriod.getEndingHour());
    period.setStartingDay(weeklyPeriod.getStartingDay());
    period.setStartingHour(weeklyPeriod.getStartingHour());
    this.activePeriod = period;
  }

}
