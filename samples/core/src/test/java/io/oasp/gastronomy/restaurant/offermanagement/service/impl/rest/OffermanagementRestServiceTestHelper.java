package io.oasp.gastronomy.restaurant.offermanagement.service.impl.rest;

import java.time.DayOfWeek;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.OfferEto;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialEto;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.WeeklyPeriod;

public class OffermanagementRestServiceTestHelper {

  private static final String NAME = "John";

  private static final Money SPECIAL_PRICE = new Money(1.15);

  public SpecialEto createSpecial(long specialId) {

    SpecialEto special = new SpecialEto();
    special.setId(specialId);
    special.setName(NAME);
    special.setOffer(prepareOffer());
    special.setSpecialPrice(SPECIAL_PRICE);
    special.setActivePeriod(createActivePeriod());

    return special;
  }

  /**
   * @return
   */
  private WeeklyPeriod createActivePeriod() {

    WeeklyPeriod period = new WeeklyPeriod();
    period.setEndingDay(DayOfWeek.FRIDAY);
    period.setEndingHour(6);
    period.setStartingDay(DayOfWeek.MONDAY);
    period.setStartingHour(1);

    return period;
  }

  /**
   * @return
   */
  private OfferEto prepareOffer() {

    OfferEto offer = new OfferEto();
    offer.setId(1L);
    offer.setName("Offer");

    return offer;
  }
}
