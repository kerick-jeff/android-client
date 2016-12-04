package com.mifos.mifosxdroid.online.grouploanaccount;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GroupLoanAccountFragment_MembersInjector
    implements MembersInjector<GroupLoanAccountFragment> {
  private final Provider<GroupLoanAccountPresenter> mGroupLoanAccountPresenterProvider;

  public GroupLoanAccountFragment_MembersInjector(
      Provider<GroupLoanAccountPresenter> mGroupLoanAccountPresenterProvider) {
    assert mGroupLoanAccountPresenterProvider != null;
    this.mGroupLoanAccountPresenterProvider = mGroupLoanAccountPresenterProvider;
  }

  public static MembersInjector<GroupLoanAccountFragment> create(
      Provider<GroupLoanAccountPresenter> mGroupLoanAccountPresenterProvider) {
    return new GroupLoanAccountFragment_MembersInjector(mGroupLoanAccountPresenterProvider);
  }

  @Override
  public void injectMembers(GroupLoanAccountFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mGroupLoanAccountPresenter = mGroupLoanAccountPresenterProvider.get();
  }

  public static void injectMGroupLoanAccountPresenter(
      GroupLoanAccountFragment instance,
      Provider<GroupLoanAccountPresenter> mGroupLoanAccountPresenterProvider) {
    instance.mGroupLoanAccountPresenter = mGroupLoanAccountPresenterProvider.get();
  }
}
