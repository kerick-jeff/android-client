package com.mifos.mifosxdroid.online.createnewclient;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreateNewClientFragment_MembersInjector
    implements MembersInjector<CreateNewClientFragment> {
  private final Provider<CreateNewClientPresenter> mCreateNewClientPresenterProvider;

  public CreateNewClientFragment_MembersInjector(
      Provider<CreateNewClientPresenter> mCreateNewClientPresenterProvider) {
    assert mCreateNewClientPresenterProvider != null;
    this.mCreateNewClientPresenterProvider = mCreateNewClientPresenterProvider;
  }

  public static MembersInjector<CreateNewClientFragment> create(
      Provider<CreateNewClientPresenter> mCreateNewClientPresenterProvider) {
    return new CreateNewClientFragment_MembersInjector(mCreateNewClientPresenterProvider);
  }

  @Override
  public void injectMembers(CreateNewClientFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mCreateNewClientPresenter = mCreateNewClientPresenterProvider.get();
  }

  public static void injectMCreateNewClientPresenter(
      CreateNewClientFragment instance,
      Provider<CreateNewClientPresenter> mCreateNewClientPresenterProvider) {
    instance.mCreateNewClientPresenter = mCreateNewClientPresenterProvider.get();
  }
}
