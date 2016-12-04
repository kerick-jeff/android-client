package com.mifos.mifosxdroid.online.clientdetails;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ClientDetailsFragment_MembersInjector
    implements MembersInjector<ClientDetailsFragment> {
  private final Provider<ClientDetailsPresenter> mClientDetailsPresenterProvider;

  public ClientDetailsFragment_MembersInjector(
      Provider<ClientDetailsPresenter> mClientDetailsPresenterProvider) {
    assert mClientDetailsPresenterProvider != null;
    this.mClientDetailsPresenterProvider = mClientDetailsPresenterProvider;
  }

  public static MembersInjector<ClientDetailsFragment> create(
      Provider<ClientDetailsPresenter> mClientDetailsPresenterProvider) {
    return new ClientDetailsFragment_MembersInjector(mClientDetailsPresenterProvider);
  }

  @Override
  public void injectMembers(ClientDetailsFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mClientDetailsPresenter = mClientDetailsPresenterProvider.get();
  }

  public static void injectMClientDetailsPresenter(
      ClientDetailsFragment instance,
      Provider<ClientDetailsPresenter> mClientDetailsPresenterProvider) {
    instance.mClientDetailsPresenter = mClientDetailsPresenterProvider.get();
  }
}
