package com.mifos.mifosxdroid.dialogfragments.identifierdialog;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class IdentifierDialogFragment_MembersInjector
    implements MembersInjector<IdentifierDialogFragment> {
  private final Provider<IdentifierDialogPresenter> mIdentifierDialogPresenterProvider;

  public IdentifierDialogFragment_MembersInjector(
      Provider<IdentifierDialogPresenter> mIdentifierDialogPresenterProvider) {
    assert mIdentifierDialogPresenterProvider != null;
    this.mIdentifierDialogPresenterProvider = mIdentifierDialogPresenterProvider;
  }

  public static MembersInjector<IdentifierDialogFragment> create(
      Provider<IdentifierDialogPresenter> mIdentifierDialogPresenterProvider) {
    return new IdentifierDialogFragment_MembersInjector(mIdentifierDialogPresenterProvider);
  }

  @Override
  public void injectMembers(IdentifierDialogFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mIdentifierDialogPresenter = mIdentifierDialogPresenterProvider.get();
  }

  public static void injectMIdentifierDialogPresenter(
      IdentifierDialogFragment instance,
      Provider<IdentifierDialogPresenter> mIdentifierDialogPresenterProvider) {
    instance.mIdentifierDialogPresenter = mIdentifierDialogPresenterProvider.get();
  }
}
