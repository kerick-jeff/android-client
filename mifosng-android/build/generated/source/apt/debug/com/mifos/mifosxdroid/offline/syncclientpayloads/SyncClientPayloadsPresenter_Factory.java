package com.mifos.mifosxdroid.offline.syncclientpayloads;

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
public final class SyncClientPayloadsPresenter_Factory
    implements Factory<SyncClientPayloadsPresenter> {
  private final MembersInjector<SyncClientPayloadsPresenter>
      syncClientPayloadsPresenterMembersInjector;

  private final Provider<DataManagerClient> dataManagerClientProvider;

  public SyncClientPayloadsPresenter_Factory(
      MembersInjector<SyncClientPayloadsPresenter> syncClientPayloadsPresenterMembersInjector,
      Provider<DataManagerClient> dataManagerClientProvider) {
    assert syncClientPayloadsPresenterMembersInjector != null;
    this.syncClientPayloadsPresenterMembersInjector = syncClientPayloadsPresenterMembersInjector;
    assert dataManagerClientProvider != null;
    this.dataManagerClientProvider = dataManagerClientProvider;
  }

  @Override
  public SyncClientPayloadsPresenter get() {
    return MembersInjectors.injectMembers(
        syncClientPayloadsPresenterMembersInjector,
        new SyncClientPayloadsPresenter(dataManagerClientProvider.get()));
  }

  public static Factory<SyncClientPayloadsPresenter> create(
      MembersInjector<SyncClientPayloadsPresenter> syncClientPayloadsPresenterMembersInjector,
      Provider<DataManagerClient> dataManagerClientProvider) {
    return new SyncClientPayloadsPresenter_Factory(
        syncClientPayloadsPresenterMembersInjector, dataManagerClientProvider);
  }
}
