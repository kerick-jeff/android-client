package com.mifos.mifosxdroid.online.clientsearch;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ClientSearchFragment_MembersInjector
    implements MembersInjector<ClientSearchFragment> {
  private final Provider<ClientSearchPresenter> mClientSearchPresenterProvider;

  public ClientSearchFragment_MembersInjector(
      Provider<ClientSearchPresenter> mClientSearchPresenterProvider) {
    assert mClientSearchPresenterProvider != null;
    this.mClientSearchPresenterProvider = mClientSearchPresenterProvider;
  }

  public static MembersInjector<ClientSearchFragment> create(
      Provider<ClientSearchPresenter> mClientSearchPresenterProvider) {
    return new ClientSearchFragment_MembersInjector(mClientSearchPresenterProvider);
  }

  @Override
  public void injectMembers(ClientSearchFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mClientSearchPresenter = mClientSearchPresenterProvider.get();
  }

  public static void injectMClientSearchPresenter(
      ClientSearchFragment instance,
      Provider<ClientSearchPresenter> mClientSearchPresenterProvider) {
    instance.mClientSearchPresenter = mClientSearchPresenterProvider.get();
  }
}
