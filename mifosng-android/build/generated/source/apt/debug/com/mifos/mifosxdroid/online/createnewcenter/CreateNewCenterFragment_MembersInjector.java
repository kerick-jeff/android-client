package com.mifos.mifosxdroid.online.createnewcenter;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreateNewCenterFragment_MembersInjector
    implements MembersInjector<CreateNewCenterFragment> {
  private final Provider<CreateNewCenterPresenter> mCreateNewCenterPresenterProvider;

  public CreateNewCenterFragment_MembersInjector(
      Provider<CreateNewCenterPresenter> mCreateNewCenterPresenterProvider) {
    assert mCreateNewCenterPresenterProvider != null;
    this.mCreateNewCenterPresenterProvider = mCreateNewCenterPresenterProvider;
  }

  public static MembersInjector<CreateNewCenterFragment> create(
      Provider<CreateNewCenterPresenter> mCreateNewCenterPresenterProvider) {
    return new CreateNewCenterFragment_MembersInjector(mCreateNewCenterPresenterProvider);
  }

  @Override
  public void injectMembers(CreateNewCenterFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mCreateNewCenterPresenter = mCreateNewCenterPresenterProvider.get();
  }

  public static void injectMCreateNewCenterPresenter(
      CreateNewCenterFragment instance,
      Provider<CreateNewCenterPresenter> mCreateNewCenterPresenterProvider) {
    instance.mCreateNewCenterPresenter = mCreateNewCenterPresenterProvider.get();
  }
}
