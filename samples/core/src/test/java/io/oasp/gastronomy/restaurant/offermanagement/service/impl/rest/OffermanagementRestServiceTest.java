package io.oasp.gastronomy.restaurant.offermanagement.service.impl.rest;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import io.oasp.gastronomy.restaurant.general.common.base.AbstractRestServiceTest;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialEto;
import io.oasp.gastronomy.restaurant.offermanagement.service.api.rest.OffermanagementRestService;
import io.oasp.module.service.common.api.client.ServiceClientFactory;

/**
 * This class serves as an example of how to perform a subsystem test (e.g., call a *RestService interface). The test
 * database is accessed via an instance of the class {@link OffermanagementRestService}.
 *
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { OffermanagementRestTestConfig.class })
@TestPropertySource(properties = { "flyway.locations=filesystem:src/test/resources/db/tablemanagement",
"service.client.app.restaurant.user.login=waiter" })

public class OffermanagementRestServiceTest extends AbstractRestServiceTest {

  private OffermanagementRestService service;

  @Inject
  private ServiceClientFactory serviceClientFactory;

  @Inject
  private OffermanagementRestServiceTestHelper helper;

  /**
   * Provides initialization previous to the creation of the text fixture.
   */
  @Override
  public void doSetUp() {

    super.doSetUp();
    getDbTestHelper().resetDatabase();
    this.service = this.serviceClientFactory.create(OffermanagementRestService.class);
  }

  /**
   * Provides clean up after tests.
   */
  @Override
  public void doTearDown() {

    this.service = null;
    super.doTearDown();
  }

  @Test
  public void testFindSpecialOffer() {

    // given
    SpecialEto special = this.helper.createSpecial(1L);
    SpecialEto savedSpecial = this.service.saveSpecial(special);

    // when
    SpecialEto find = this.service.getSpecialOffer(savedSpecial.getId());

    // then
    assertThat(find).isNotNull();
    assertThat(find).isEqualTo(savedSpecial);
    assertThat(find.getName()).isEqualTo(savedSpecial.getName());
  }

}