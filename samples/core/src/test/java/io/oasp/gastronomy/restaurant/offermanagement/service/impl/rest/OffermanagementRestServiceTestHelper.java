package io.oasp.gastronomy.restaurant.offermanagement.service.impl.rest;

import io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialEto;

public class OffermanagementRestServiceTestHelper {

  private static final String NAME = "John";

  private static final Offer OFFER = new Off

  public SpecialEto createSpecial(long specialId) {

    SpecialEto special = new SpecialEto();
    special.setId(specialId);
    special.setName(NAME);
    special.setOffer(OFFER);
    special.setSpecialPrice(SPECIAL_PRICE);

    return special;
  }
}
