package com.mifos.mifosxdroid.adapters;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CentersListAdapter_Factory implements Factory<CentersListAdapter> {
  private final MembersInjector<CentersListAdapter> centersListAdapterMembersInjector;

  public CentersListAdapter_Factory(
      MembersInjector<CentersListAdapter> centersListAdapterMembersInjector) {
    assert centersListAdapterMembersInjector != null;
    this.centersListAdapterMembersInjector = centersListAdapterMembersInjector;
  }

  @Override
  public CentersListAdapter get() {
    return MembersInjectors.injectMembers(
        centersListAdapterMembersInjector, new CentersListAdapter());
  }

  public static Factory<CentersListAdapter> create(
      MembersInjector<CentersListAdapter> centersListAdapterMembersInjector) {
    return new CentersListAdapter_Factory(centersListAdapterMembersInjector);
  }
}
