package com.mifos.mifosxdroid.online.groupslist;

import com.mifos.mifosxdroid.adapters.GroupNameListAdapter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GroupsListFragment_MembersInjector
    implements MembersInjector<GroupsListFragment> {
  private final Provider<GroupsListPresenter> mGroupsListPresenterProvider;

  private final Provider<GroupNameListAdapter> mGroupListAdapterProvider;

  public GroupsListFragment_MembersInjector(
      Provider<GroupsListPresenter> mGroupsListPresenterProvider,
      Provider<GroupNameListAdapter> mGroupListAdapterProvider) {
    assert mGroupsListPresenterProvider != null;
    this.mGroupsListPresenterProvider = mGroupsListPresenterProvider;
    assert mGroupListAdapterProvider != null;
    this.mGroupListAdapterProvider = mGroupListAdapterProvider;
  }

  public static MembersInjector<GroupsListFragment> create(
      Provider<GroupsListPresenter> mGroupsListPresenterProvider,
      Provider<GroupNameListAdapter> mGroupListAdapterProvider) {
    return new GroupsListFragment_MembersInjector(
        mGroupsListPresenterProvider, mGroupListAdapterProvider);
  }

  @Override
  public void injectMembers(GroupsListFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mGroupsListPresenter = mGroupsListPresenterProvider.get();
    instance.mGroupListAdapter = mGroupListAdapterProvider.get();
  }

  public static void injectMGroupsListPresenter(
      GroupsListFragment instance, Provider<GroupsListPresenter> mGroupsListPresenterProvider) {
    instance.mGroupsListPresenter = mGroupsListPresenterProvider.get();
  }

  public static void injectMGroupListAdapter(
      GroupsListFragment instance, Provider<GroupNameListAdapter> mGroupListAdapterProvider) {
    instance.mGroupListAdapter = mGroupListAdapterProvider.get();
  }
}
