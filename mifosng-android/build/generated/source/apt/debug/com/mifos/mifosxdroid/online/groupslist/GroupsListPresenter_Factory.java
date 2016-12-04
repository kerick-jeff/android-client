package com.mifos.mifosxdroid.online.groupslist;

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
public final class GroupsListPresenter_Factory implements Factory<GroupsListPresenter> {
  private final MembersInjector<GroupsListPresenter> groupsListPresenterMembersInjector;

  private final Provider<DataManagerGroups> dataManagerGroupsProvider;

  public GroupsListPresenter_Factory(
      MembersInjector<GroupsListPresenter> groupsListPresenterMembersInjector,
      Provider<DataManagerGroups> dataManagerGroupsProvider) {
    assert groupsListPresenterMembersInjector != null;
    this.groupsListPresenterMembersInjector = groupsListPresenterMembersInjector;
    assert dataManagerGroupsProvider != null;
    this.dataManagerGroupsProvider = dataManagerGroupsProvider;
  }

  @Override
  public GroupsListPresenter get() {
    return MembersInjectors.injectMembers(
        groupsListPresenterMembersInjector,
        new GroupsListPresenter(dataManagerGroupsProvider.get()));
  }

  public static Factory<GroupsListPresenter> create(
      MembersInjector<GroupsListPresenter> groupsListPresenterMembersInjector,
      Provider<DataManagerGroups> dataManagerGroupsProvider) {
    return new GroupsListPresenter_Factory(
        groupsListPresenterMembersInjector, dataManagerGroupsProvider);
  }
}
