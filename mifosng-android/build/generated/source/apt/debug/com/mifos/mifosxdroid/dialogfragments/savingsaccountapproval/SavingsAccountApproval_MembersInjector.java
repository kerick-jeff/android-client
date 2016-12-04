package com.mifos.mifosxdroid.dialogfragments.savingsaccountapproval;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountApproval_MembersInjector
    implements MembersInjector<SavingsAccountApproval> {
  private final Provider<SavingsAccountApprovalPresenter> mSavingsAccountApprovalPresenterProvider;

  public SavingsAccountApproval_MembersInjector(
      Provider<SavingsAccountApprovalPresenter> mSavingsAccountApprovalPresenterProvider) {
    assert mSavingsAccountApprovalPresenterProvider != null;
    this.mSavingsAccountApprovalPresenterProvider = mSavingsAccountApprovalPresenterProvider;
  }

  public static MembersInjector<SavingsAccountApproval> create(
      Provider<SavingsAccountApprovalPresenter> mSavingsAccountApprovalPresenterProvider) {
    return new SavingsAccountApproval_MembersInjector(mSavingsAccountApprovalPresenterProvider);
  }

  @Override
  public void injectMembers(SavingsAccountApproval instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mSavingsAccountApprovalPresenter = mSavingsAccountApprovalPresenterProvider.get();
  }

  public static void injectMSavingsAccountApprovalPresenter(
      SavingsAccountApproval instance,
      Provider<SavingsAccountApprovalPresenter> mSavingsAccountApprovalPresenterProvider) {
    instance.mSavingsAccountApprovalPresenter = mSavingsAccountApprovalPresenterProvider.get();
  }
}
