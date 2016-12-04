package com.mifos.mifosxdroid.online.clientidentifiers;

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
public final class ClientIdentifiersPresenter_Factory
    implements Factory<ClientIdentifiersPresenter> {
  private final MembersInjector<ClientIdentifiersPresenter>
      clientIdentifiersPresenterMembersInjector;

  private final Provider<DataManagerClient> dataManagerClientProvider;

  public ClientIdentifiersPresenter_Factory(
      MembersInjector<ClientIdentifiersPresenter> clientIdentifiersPresenterMembersInjector,
      Provider<DataManagerClient> dataManagerClientProvider) {
    assert clientIdentifiersPresenterMembersInjector != null;
    this.clientIdentifiersPresenterMembersInjector = clientIdentifiersPresenterMembersInjector;
    assert dataManagerClientProvider != null;
    this.dataManagerClientProvider = dataManagerClientProvider;
  }

  @Override
  public ClientIdentifiersPresenter get() {
    return MembersInjectors.injectMembers(
        clientIdentifiersPresenterMembersInjector,
        new ClientIdentifiersPresenter(dataManagerClientProvider.get()));
  }

  public static Factory<ClientIdentifiersPresenter> create(
      MembersInjector<ClientIdentifiersPresenter> clientIdentifiersPresenterMembersInjector,
      Provider<DataManagerClient> dataManagerClientProvider) {
    return new ClientIdentifiersPresenter_Factory(
        clientIdentifiersPresenterMembersInjector, dataManagerClientProvider);
  }
}
