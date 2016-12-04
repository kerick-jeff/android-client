package com.mifos.mifosxdroid.offline.syncgrouppayloads;

import com.mifos.api.datamanager.DataManagerGroups;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SyncGroupPayloadsPresenter_Factory
    implements Factory<SyncGroupPayloadsPresenter> {
  private final MembersInjector<SyncGroupPayloadsPresenter>
      syncGroupPayloadsPresenterMembersInjector;

  private final Provider<DataManagerGroups> dataManagerGroupsProvider;

  public SyncGroupPayloadsPresenter_Factory(
      MembersInjector<SyncGroupPayloadsPresenter> syncGroupPayloadsPresenterMembersInjector,
      Provider<DataManagerGroups> dataManagerGroupsProvider) {
    assert syncGroupPayloadsPresenterMembersInjector != null;
    this.syncGroupPayloadsPresenterMembersInjector = syncGroupPayloadsPresenterMembersInjector;
    assert dataManagerGroupsProvider != null;
    this.dataManagerGroupsProvider = dataManagerGroupsProvider;
  }

  @Override
  public SyncGroupPayloadsPresenter get() {
    return MembersInjectors.injectMembers(
        syncGroupPayloadsPresenterMembersInjector,
        new SyncGroupPayloadsPresenter(dataManagerGroupsProvider.get()));
  }

  public static Factory<SyncGroupPayloadsPresenter> create(
      MembersInjector<SyncGroupPayloadsPresenter> syncGroupPayloadsPresenterMembersInjector,
      Provider<DataManagerGroups> dataManagerGroupsProvider) {
    return new SyncGroupPayloadsPresenter_Factory(
        syncGroupPayloadsPresenterMembersInjector, dataManagerGroupsProvider);
  }
}
