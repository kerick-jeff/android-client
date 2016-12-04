package com.mifos.mifosxdroid.online.grouplist;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GroupListFragment_MembersInjector implements MembersInjector<GroupListFragment> {
  private final Provider<GroupListPresenter> mGroupListPresenterProvider;

  public GroupListFragment_MembersInjector(
      Provider<GroupListPresenter> mGroupListPresenterProvider) {
    assert mGroupListPresenterProvider != null;
    this.mGroupListPresenterProvider = mGroupListPresenterProvider;
  }

  public static MembersInjector<GroupListFragment> create(
      Provider<GroupListPresenter> mGroupListPresenterProvider) {
    return new GroupListFragment_MembersInjector(mGroupListPresenterProvider);
  }

  @Override
  public void injectMembers(GroupListFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mGroupListPresenter = mGroupListPresenterProvider.get();
  }

  public static void injectMGroupListPresenter(
      GroupListFragment instance, Provider<GroupListPresenter> mGroupListPresenterProvider) {
    instance.mGroupListPresenter = mGroupListPresenterProvider.get();
  }
}
