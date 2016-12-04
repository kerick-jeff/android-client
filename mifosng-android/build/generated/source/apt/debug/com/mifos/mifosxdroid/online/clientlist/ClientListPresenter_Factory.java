package com.mifos.mifosxdroid.online.clientlist;

import com.mifos.api.datamanager.DataManagerClient;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ClientListPresenter_Factory implements Factory<ClientListPresenter> {
  private final MembersInjector<ClientListPresenter> clientListPresenterMembersInjector;

  private final Provider<DataManagerClient> dataManagerClientProvider;

  public ClientListPresenter_Factory(
      MembersInjector<ClientListPresenter> clientListPresenterMembersInjector,
      Provider<DataManagerClient> dataManagerClientProvider) {
    assert clientListPresenterMembersInjector != null;
    this.clientListPresenterMembersInjector = clientListPresenterMembersInjector;
    assert dataManagerClientProvider != null;
    this.dataManagerClientProvider = dataManagerClientProvider;
  }

  @Override
  public ClientListPresenter get() {
    return MembersInjectors.injectMembers(
        clientListPresenterMembersInjector,
        new ClientListPresenter(dataManagerClientProvider.get()));
  }

  public static Factory<ClientListPresenter> create(
      MembersInjector<ClientListPresenter> clientListPresenterMembersInjector,
      Provider<DataManagerClient> dataManagerClientProvider) {
    return new ClientListPresenter_Factory(
        clientListPresenterMembersInjector, dataManagerClientProvider);
  }
}
