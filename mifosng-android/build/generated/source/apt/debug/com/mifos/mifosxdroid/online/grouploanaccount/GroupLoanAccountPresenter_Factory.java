package com.mifos.mifosxdroid.online.grouploanaccount;

import com.mifos.api.DataManager;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GroupLoanAccountPresenter_Factory implements Factory<GroupLoanAccountPresenter> {
  private final MembersInjector<GroupLoanAccountPresenter> groupLoanAccountPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  public GroupLoanAccountPresenter_Factory(
      MembersInjector<GroupLoanAccountPresenter> groupLoanAccountPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    assert groupLoanAccountPresenterMembersInjector != null;
    this.groupLoanAccountPresenterMembersInjector = groupLoanAccountPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public GroupLoanAccountPresenter get() {
    return MembersInjectors.injectMembers(
        groupLoanAccountPresenterMembersInjector,
        new GroupLoanAccountPresenter(dataManagerProvider.get()));
  }

  public static Factory<GroupLoanAccountPresenter> create(
      MembersInjector<GroupLoanAccountPresenter> groupLoanAccountPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    return new GroupLoanAccountPresenter_Factory(
        groupLoanAccountPresenterMembersInjector, dataManagerProvider);
  }
}
