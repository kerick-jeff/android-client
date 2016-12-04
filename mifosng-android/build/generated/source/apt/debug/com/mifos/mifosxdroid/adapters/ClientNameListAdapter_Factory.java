package com.mifos.mifosxdroid.adapters;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ClientNameListAdapter_Factory implements Factory<ClientNameListAdapter> {
  private final MembersInjector<ClientNameListAdapter> clientNameListAdapterMembersInjector;

  public ClientNameListAdapter_Factory(
      MembersInjector<ClientNameListAdapter> clientNameListAdapterMembersInjector) {
    assert clientNameListAdapterMembersInjector != null;
    this.clientNameListAdapterMembersInjector = clientNameListAdapterMembersInjector;
  }

  @Override
  public ClientNameListAdapter get() {
    return MembersInjectors.injectMembers(
        clientNameListAdapterMembersInjector, new ClientNameListAdapter());
  }

  public static Factory<ClientNameListAdapter> create(
      MembersInjector<ClientNameListAdapter> clientNameListAdapterMembersInjector) {
    return new ClientNameListAdapter_Factory(clientNameListAdapterMembersInjector);
  }
}
