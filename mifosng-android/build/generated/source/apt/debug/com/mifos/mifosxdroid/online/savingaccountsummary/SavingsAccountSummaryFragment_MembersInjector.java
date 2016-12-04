package com.mifos.mifosxdroid.online.savingaccountsummary;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountSummaryFragment_MembersInjector
    implements MembersInjector<SavingsAccountSummaryFragment> {
  private final Provider<SavingsAccountSummaryPresenter> mSavingAccountSummaryPresenterProvider;

  public SavingsAccountSummaryFragment_MembersInjector(
      Provider<SavingsAccountSummaryPresenter> mSavingAccountSummaryPresenterProvider) {
    assert mSavingAccountSummaryPresenterProvider != null;
    this.mSavingAccountSummaryPresenterProvider = mSavingAccountSummaryPresenterProvider;
  }

  public static MembersInjector<SavingsAccountSummaryFragment> create(
      Provider<SavingsAccountSummaryPresenter> mSavingAccountSummaryPresenterProvider) {
    return new SavingsAccountSummaryFragment_MembersInjector(
        mSavingAccountSummaryPresenterProvider);
  }

  @Override
  public void injectMembers(SavingsAccountSummaryFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mSavingAccountSummaryPresenter = mSavingAccountSummaryPresenterProvider.get();
  }

  public static void injectMSavingAccountSummaryPresenter(
      SavingsAccountSummaryFragment instance,
      Provider<SavingsAccountSummaryPresenter> mSavingAccountSummaryPresenterProvider) {
    instance.mSavingAccountSummaryPresenter = mSavingAccountSummaryPresenterProvider.get();
  }
}
