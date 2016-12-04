package com.mifos.mifosxdroid.online.clientcharge;

import com.mifos.api.datamanager.DataManagerCharge;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ClientChargePresenter_Factory implements Factory<ClientChargePresenter> {
  private final MembersInjector<ClientChargePresenter> clientChargePresenterMembersInjector;

  private final Provider<DataManagerCharge> dataManagerChargeProvider;

  public ClientChargePresenter_Factory(
      MembersInjector<ClientChargePresenter> clientChargePresenterMembersInjector,
      Provider<DataManagerCharge> dataManagerChargeProvider) {
    assert clientChargePresenterMembersInjector != null;
    this.clientChargePresenterMembersInjector = clientChargePresenterMembersInjector;
    assert dataManagerChargeProvider != null;
    this.dataManagerChargeProvider = dataManagerChargeProvider;
  }

  @Override
  public ClientChargePresenter get() {
    return MembersInjectors.injectMembers(
        clientChargePresenterMembersInjector,
        new ClientChargePresenter(dataManagerChargeProvider.get()));
  }

  public static Factory<ClientChargePresenter> create(
      MembersInjector<ClientChargePresenter> clientChargePresenterMembersInjector,
      Provider<DataManagerCharge> dataManagerChargeProvider) {
    return new ClientChargePresenter_Factory(
        clientChargePresenterMembersInjector, dataManagerChargeProvider);
  }
}
