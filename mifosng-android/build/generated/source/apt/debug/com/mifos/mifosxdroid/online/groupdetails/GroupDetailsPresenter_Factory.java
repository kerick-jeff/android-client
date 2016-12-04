package com.mifos.mifosxdroid.online.groupdetails;

import com.mifos.api.datamanager.DataManagerDataTable;
import com.mifos.api.datamanager.DataManagerGroups;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GroupDetailsPresenter_Factory implements Factory<GroupDetailsPresenter> {
  private final MembersInjector<GroupDetailsPresenter> groupDetailsPresenterMembersInjector;

  private final Provider<DataManagerGroups> dataManagerGroupsProvider;

  private final Provider<DataManagerDataTable> dataManagerDataTableProvider;

  public GroupDetailsPresenter_Factory(
      MembersInjector<GroupDetailsPresenter> groupDetailsPresenterMembersInjector,
      Provider<DataManagerGroups> dataManagerGroupsProvider,
      Provider<DataManagerDataTable> dataManagerDataTableProvider) {
    assert groupDetailsPresenterMembersInjector != null;
    this.groupDetailsPresenterMembersInjector = groupDetailsPresenterMembersInjector;
    assert dataManagerGroupsProvider != null;
    this.dataManagerGroupsProvider = dataManagerGroupsProvider;
    assert dataManagerDataTableProvider != null;
    this.dataManagerDataTableProvider = dataManagerDataTableProvider;
  }

  @Override
  public GroupDetailsPresenter get() {
    return MembersInjectors.injectMembers(
        groupDetailsPresenterMembersInjector,
        new GroupDetailsPresenter(
            dataManagerGroupsProvider.get(), dataManagerDataTableProvider.get()));
  }

  public static Factory<GroupDetailsPresenter> create(
      MembersInjector<GroupDetailsPresenter> groupDetailsPresenterMembersInjector,
      Provider<DataManagerGroups> dataManagerGroupsProvider,
      Provider<DataManagerDataTable> dataManagerDataTableProvider) {
    return new GroupDetailsPresenter_Factory(
        groupDetailsPresenterMembersInjector,
        dataManagerGroupsProvider,
        dataManagerDataTableProvider);
  }
}
