package com.mifos.mifosxdroid.adapters;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SyncGroupPayloadAdapter_Factory implements Factory<SyncGroupPayloadAdapter> {
  private final MembersInjector<SyncGroupPayloadAdapter> syncGroupPayloadAdapterMembersInjector;

  public SyncGroupPayloadAdapter_Factory(
      MembersInjector<SyncGroupPayloadAdapter> syncGroupPayloadAdapterMembersInjector) {
    assert syncGroupPayloadAdapterMembersInjector != null;
    this.syncGroupPayloadAdapterMembersInjector = syncGroupPayloadAdapterMembersInjector;
  }

  @Override
  public SyncGroupPayloadAdapter get() {
    return MembersInjectors.injectMembers(
        syncGroupPayloadAdapterMembersInjector, new SyncGroupPayloadAdapter());
  }

  public static Factory<SyncGroupPayloadAdapter> create(
      MembersInjector<SyncGroupPayloadAdapter> syncGroupPayloadAdapterMembersInjector) {
    return new SyncGroupPayloadAdapter_Factory(syncGroupPayloadAdapterMembersInjector);
  }
}
