package com.mifos.mifosxdroid.online.clientlist;

import com.mifos.mifosxdroid.adapters.ClientNameListAdapter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ClientListFragment_MembersInjector
    implements MembersInjector<ClientListFragment> {
  private final Provider<ClientNameListAdapter> mClientNameListAdapterProvider;

  private final Provider<ClientListPresenter> mClientListPresenterProvider;

  public ClientListFragment_MembersInjector(
      Provider<ClientNameListAdapter> mClientNameListAdapterProvider,
      Provider<ClientListPresenter> mClientListPresenterProvider) {
    assert mClientNameListAdapterProvider != null;
    this.mClientNameListAdapterProvider = mClientNameListAdapterProvider;
    assert mClientListPresenterProvider != null;
    this.mClientListPresenterProvider = mClientListPresenterProvider;
  }

  public static MembersInjector<ClientListFragment> create(
      Provider<ClientNameListAdapter> mClientNameListAdapterProvider,
      Provider<ClientListPresenter> mClientListPresenterProvider) {
    return new ClientListFragment_MembersInjector(
        mClientNameListAdapterProvider, mClientListPresenterProvider);
  }

  @Override
  public void injectMembers(ClientListFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mClientNameListAdapter = mClientNameListAdapterProvider.get();
    instance.mClientListPresenter = mClientListPresenterProvider.get();
  }

  public static void injectMClientNameListAdapter(
      ClientListFragment instance, Provider<ClientNameListAdapter> mClientNameListAdapterProvider) {
    instance.mClientNameListAdapter = mClientNameListAdapterProvider.get();
  }

  public static void injectMClientListPresenter(
      ClientListFragment instance, Provider<ClientListPresenter> mClientListPresenterProvider) {
    instance.mClientListPresenter = mClientListPresenterProvider.get();
  }
}
