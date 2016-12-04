package com.mifos.mifosxdroid.adapters;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GroupNameListAdapter_Factory implements Factory<GroupNameListAdapter> {
  private final MembersInjector<GroupNameListAdapter> groupNameListAdapterMembersInjector;

  public GroupNameListAdapter_Factory(
      MembersInjector<GroupNameListAdapter> groupNameListAdapterMembersInjector) {
    assert groupNameListAdapterMembersInjector != null;
    this.groupNameListAdapterMembersInjector = groupNameListAdapterMembersInjector;
  }

  @Override
  public GroupNameListAdapter get() {
    return MembersInjectors.injectMembers(
        groupNameListAdapterMembersInjector, new GroupNameListAdapter());
  }

  public static Factory<GroupNameListAdapter> create(
      MembersInjector<GroupNameListAdapter> groupNameListAdapterMembersInjector) {
    return new GroupNameListAdapter_Factory(groupNameListAdapterMembersInjector);
  }
}
