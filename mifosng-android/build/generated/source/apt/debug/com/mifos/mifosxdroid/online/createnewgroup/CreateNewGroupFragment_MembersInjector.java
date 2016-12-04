package com.mifos.mifosxdroid.online.createnewgroup;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreateNewGroupFragment_MembersInjector
    implements MembersInjector<CreateNewGroupFragment> {
  private final Provider<CreateNewGroupPresenter> mCreateNewGroupPresenterProvider;

  public CreateNewGroupFragment_MembersInjector(
      Provider<CreateNewGroupPresenter> mCreateNewGroupPresenterProvider) {
    assert mCreateNewGroupPresenterProvider != null;
    this.mCreateNewGroupPresenterProvider = mCreateNewGroupPresenterProvider;
  }

  public static MembersInjector<CreateNewGroupFragment> create(
      Provider<CreateNewGroupPresenter> mCreateNewGroupPresenterProvider) {
    return new CreateNewGroupFragment_MembersInjector(mCreateNewGroupPresenterProvider);
  }

  @Override
  public void injectMembers(CreateNewGroupFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mCreateNewGroupPresenter = mCreateNewGroupPresenterProvider.get();
  }

  public static void injectMCreateNewGroupPresenter(
      CreateNewGroupFragment instance,
      Provider<CreateNewGroupPresenter> mCreateNewGroupPresenterProvider) {
    instance.mCreateNewGroupPresenter = mCreateNewGroupPresenterProvider.get();
  }
}
