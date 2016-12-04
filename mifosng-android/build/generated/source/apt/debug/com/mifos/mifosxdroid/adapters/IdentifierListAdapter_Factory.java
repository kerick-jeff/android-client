package com.mifos.mifosxdroid.adapters;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class IdentifierListAdapter_Factory implements Factory<IdentifierListAdapter> {
  private final MembersInjector<IdentifierListAdapter> identifierListAdapterMembersInjector;

  public IdentifierListAdapter_Factory(
      MembersInjector<IdentifierListAdapter> identifierListAdapterMembersInjector) {
    assert identifierListAdapterMembersInjector != null;
    this.identifierListAdapterMembersInjector = identifierListAdapterMembersInjector;
  }

  @Override
  public IdentifierListAdapter get() {
    return MembersInjectors.injectMembers(
        identifierListAdapterMembersInjector, new IdentifierListAdapter());
  }

  public static Factory<IdentifierListAdapter> create(
      MembersInjector<IdentifierListAdapter> identifierListAdapterMembersInjector) {
    return new IdentifierListAdapter_Factory(identifierListAdapterMembersInjector);
  }
}
