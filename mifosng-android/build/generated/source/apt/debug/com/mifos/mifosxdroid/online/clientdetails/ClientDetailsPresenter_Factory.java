package com.mifos.mifosxdroid.online.clientdetails;

import com.mifos.api.datamanager.DataManagerClient;
import com.mifos.api.datamanager.DataManagerDataTable;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ClientDetailsPresenter_Factory implements Factory<ClientDetailsPresenter> {
  private final MembersInjector<ClientDetailsPresenter> clientDetailsPresenterMembersInjector;

  private final Provider<DataManagerDataTable> dataManagerDataTableProvider;

  private final Provider<DataManagerClient> dataManagerClientProvider;

  public ClientDetailsPresenter_Factory(
      MembersInjector<ClientDetailsPresenter> clientDetailsPresenterMembersInjector,
      Provider<DataManagerDataTable> dataManagerDataTableProvider,
      Provider<DataManagerClient> dataManagerClientProvider) {
    assert clientDetailsPresenterMembersInjector != null;
    this.clientDetailsPresenterMembersInjector = clientDetailsPresenterMembersInjector;
    assert dataManagerDataTableProvider != null;
    this.dataManagerDataTableProvider = dataManagerDataTableProvider;
    assert dataManagerClientProvider != null;
    this.dataManagerClientProvider = dataManagerClientProvider;
  }

  @Override
  public ClientDetailsPresenter get() {
    return MembersInjectors.injectMembers(
        clientDetailsPresenterMembersInjector,
        new ClientDetailsPresenter(
            dataManagerDataTableProvider.get(), dataManagerClientProvider.get()));
  }

  public static Factory<ClientDetailsPresenter> create(
      MembersInjector<ClientDetailsPresenter> clientDetailsPresenterMembersInjector,
      Provider<DataManagerDataTable> dataManagerDataTableProvider,
      Provider<DataManagerClient> dataManagerClientProvider) {
    return new ClientDetailsPresenter_Factory(
        clientDetailsPresenterMembersInjector,
        dataManagerDataTableProvider,
        dataManagerClientProvider);
  }
}
