package com.mifos.mifosxdroid.online.savingsaccount;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountFragment_MembersInjector
    implements MembersInjector<SavingsAccountFragment> {
  private final Provider<SavingsAccountPresenter> mSavingsAccountPresenterProvider;

  public SavingsAccountFragment_MembersInjector(
      Provider<SavingsAccountPresenter> mSavingsAccountPresenterProvider) {
    assert mSavingsAccountPresenterProvider != null;
    this.mSavingsAccountPresenterProvider = mSavingsAccountPresenterProvider;
  }

  public static MembersInjector<SavingsAccountFragment> create(
      Provider<SavingsAccountPresenter> mSavingsAccountPresenterProvider) {
    return new SavingsAccountFragment_MembersInjector(mSavingsAccountPresenterProvider);
  }

  @Override
  public void injectMembers(SavingsAccountFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mSavingsAccountPresenter = mSavingsAccountPresenterProvider.get();
  }

  public static void injectMSavingsAccountPresenter(
      SavingsAccountFragment instance,
      Provider<SavingsAccountPresenter> mSavingsAccountPresenterProvider) {
    instance.mSavingsAccountPresenter = mSavingsAccountPresenterProvider.get();
  }
}
