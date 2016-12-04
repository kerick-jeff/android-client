package com.mifos.mifosxdroid.online.clientcharge;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ClientChargeFragment_MembersInjector
    implements MembersInjector<ClientChargeFragment> {
  private final Provider<ClientChargePresenter> mClientChargePresenterProvider;

  public ClientChargeFragment_MembersInjector(
      Provider<ClientChargePresenter> mClientChargePresenterProvider) {
    assert mClientChargePresenterProvider != null;
    this.mClientChargePresenterProvider = mClientChargePresenterProvider;
  }

  public static MembersInjector<ClientChargeFragment> create(
      Provider<ClientChargePresenter> mClientChargePresenterProvider) {
    return new ClientChargeFragment_MembersInjector(mClientChargePresenterProvider);
  }

  @Override
  public void injectMembers(ClientChargeFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mClientChargePresenter = mClientChargePresenterProvider.get();
  }

  public static void injectMClientChargePresenter(
      ClientChargeFragment instance,
      Provider<ClientChargePresenter> mClientChargePresenterProvider) {
    instance.mClientChargePresenter = mClientChargePresenterProvider.get();
  }
}
