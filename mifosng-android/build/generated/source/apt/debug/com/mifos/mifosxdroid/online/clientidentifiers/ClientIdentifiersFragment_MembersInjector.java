package com.mifos.mifosxdroid.online.clientidentifiers;

import com.mifos.mifosxdroid.adapters.IdentifierListAdapter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ClientIdentifiersFragment_MembersInjector
    implements MembersInjector<ClientIdentifiersFragment> {
  private final Provider<ClientIdentifiersPresenter> mClientIdentifiersPresenterProvider;

  private final Provider<IdentifierListAdapter> identifierListAdapterProvider;

  public ClientIdentifiersFragment_MembersInjector(
      Provider<ClientIdentifiersPresenter> mClientIdentifiersPresenterProvider,
      Provider<IdentifierListAdapter> identifierListAdapterProvider) {
    assert mClientIdentifiersPresenterProvider != null;
    this.mClientIdentifiersPresenterProvider = mClientIdentifiersPresenterProvider;
    assert identifierListAdapterProvider != null;
    this.identifierListAdapterProvider = identifierListAdapterProvider;
  }

  public static MembersInjector<ClientIdentifiersFragment> create(
      Provider<ClientIdentifiersPresenter> mClientIdentifiersPresenterProvider,
      Provider<IdentifierListAdapter> identifierListAdapterProvider) {
    return new ClientIdentifiersFragment_MembersInjector(
        mClientIdentifiersPresenterProvider, identifierListAdapterProvider);
  }

  @Override
  public void injectMembers(ClientIdentifiersFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mClientIdentifiersPresenter = mClientIdentifiersPresenterProvider.get();
    instance.identifierListAdapter = identifierListAdapterProvider.get();
  }

  public static void injectMClientIdentifiersPresenter(
      ClientIdentifiersFragment instance,
      Provider<ClientIdentifiersPresenter> mClientIdentifiersPresenterProvider) {
    instance.mClientIdentifiersPresenter = mClientIdentifiersPresenterProvider.get();
  }

  public static void injectIdentifierListAdapter(
      ClientIdentifiersFragment instance,
      Provider<IdentifierListAdapter> identifierListAdapterProvider) {
    instance.identifierListAdapter = identifierListAdapterProvider.get();
  }
}
