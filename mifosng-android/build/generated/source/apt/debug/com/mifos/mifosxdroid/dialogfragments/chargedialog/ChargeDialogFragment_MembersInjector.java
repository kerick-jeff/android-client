package com.mifos.mifosxdroid.dialogfragments.chargedialog;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ChargeDialogFragment_MembersInjector
    implements MembersInjector<ChargeDialogFragment> {
  private final Provider<ChargeDialogPresenter> mChargeDialogPresenterProvider;

  public ChargeDialogFragment_MembersInjector(
      Provider<ChargeDialogPresenter> mChargeDialogPresenterProvider) {
    assert mChargeDialogPresenterProvider != null;
    this.mChargeDialogPresenterProvider = mChargeDialogPresenterProvider;
  }

  public static MembersInjector<ChargeDialogFragment> create(
      Provider<ChargeDialogPresenter> mChargeDialogPresenterProvider) {
    return new ChargeDialogFragment_MembersInjector(mChargeDialogPresenterProvider);
  }

  @Override
  public void injectMembers(ChargeDialogFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mChargeDialogPresenter = mChargeDialogPresenterProvider.get();
  }

  public static void injectMChargeDialogPresenter(
      ChargeDialogFragment instance,
      Provider<ChargeDialogPresenter> mChargeDialogPresenterProvider) {
    instance.mChargeDialogPresenter = mChargeDialogPresenterProvider.get();
  }
}
