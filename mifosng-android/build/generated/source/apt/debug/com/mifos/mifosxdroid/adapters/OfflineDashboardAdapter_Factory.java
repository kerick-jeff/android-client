package com.mifos.mifosxdroid.adapters;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OfflineDashboardAdapter_Factory implements Factory<OfflineDashboardAdapter> {
  private final MembersInjector<OfflineDashboardAdapter> offlineDashboardAdapterMembersInjector;

  public OfflineDashboardAdapter_Factory(
      MembersInjector<OfflineDashboardAdapter> offlineDashboardAdapterMembersInjector) {
    assert offlineDashboardAdapterMembersInjector != null;
    this.offlineDashboardAdapterMembersInjector = offlineDashboardAdapterMembersInjector;
  }

  @Override
  public OfflineDashboardAdapter get() {
    return MembersInjectors.injectMembers(
        offlineDashboardAdapterMembersInjector, new OfflineDashboardAdapter());
  }

  public static Factory<OfflineDashboardAdapter> create(
      MembersInjector<OfflineDashboardAdapter> offlineDashboardAdapterMembersInjector) {
    return new OfflineDashboardAdapter_Factory(offlineDashboardAdapterMembersInjector);
  }
}
