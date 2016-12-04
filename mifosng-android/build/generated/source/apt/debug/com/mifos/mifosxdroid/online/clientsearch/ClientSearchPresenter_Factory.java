package com.mifos.mifosxdroid.online.clientsearch;

import com.mifos.api.DataManager;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ClientSearchPresenter_Factory implements Factory<ClientSearchPresenter> {
  private final MembersInjector<ClientSearchPresenter> clientSearchPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  public ClientSearchPresenter_Factory(
      MembersInjector<ClientSearchPresenter> clientSearchPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    assert clientSearchPresenterMembersInjector != null;
    this.clientSearchPresenterMembersInjector = clientSearchPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public ClientSearchPresenter get() {
    return MembersInjectors.injectMembers(
        clientSearchPresenterMembersInjector, new ClientSearchPresenter(dataManagerProvider.get()));
  }

  public static Factory<ClientSearchPresenter> create(
      MembersInjector<ClientSearchPresenter> clientSearchPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    return new ClientSearchPresenter_Factory(
        clientSearchPresenterMembersInjector, dataManagerProvider);
  }
}
