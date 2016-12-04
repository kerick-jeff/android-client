package com.mifos.mifosxdroid.online.grouplist;

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
public final class GroupListPresenter_Factory implements Factory<GroupListPresenter> {
  private final MembersInjector<GroupListPresenter> groupListPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  public GroupListPresenter_Factory(
      MembersInjector<GroupListPresenter> groupListPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    assert groupListPresenterMembersInjector != null;
    this.groupListPresenterMembersInjector = groupListPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public GroupListPresenter get() {
    return MembersInjectors.injectMembers(
        groupListPresenterMembersInjector, new GroupListPresenter(dataManagerProvider.get()));
  }

  public static Factory<GroupListPresenter> create(
      MembersInjector<GroupListPresenter> groupListPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider) {
    return new GroupListPresenter_Factory(groupListPresenterMembersInjector, dataManagerProvider);
  }
}
