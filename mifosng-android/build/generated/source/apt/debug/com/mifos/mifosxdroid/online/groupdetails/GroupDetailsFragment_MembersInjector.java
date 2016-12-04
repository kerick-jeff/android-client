package com.mifos.mifosxdroid.online.groupdetails;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GroupDetailsFragment_MembersInjector
    implements MembersInjector<GroupDetailsFragment> {
  private final Provider<GroupDetailsPresenter> mGroupDetailsPresenterProvider;

  public GroupDetailsFragment_MembersInjector(
      Provider<GroupDetailsPresenter> mGroupDetailsPresenterProvider) {
    assert mGroupDetailsPresenterProvider != null;
    this.mGroupDetailsPresenterProvider = mGroupDetailsPresenterProvider;
  }

  public static MembersInjector<GroupDetailsFragment> create(
      Provider<GroupDetailsPresenter> mGroupDetailsPresenterProvider) {
    return new GroupDetailsFragment_MembersInjector(mGroupDetailsPresenterProvider);
  }

  @Override
  public void injectMembers(GroupDetailsFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mGroupDetailsPresenter = mGroupDetailsPresenterProvider.get();
  }

  public static void injectMGroupDetailsPresenter(
      GroupDetailsFragment instance,
      Provider<GroupDetailsPresenter> mGroupDetailsPresenterProvider) {
    instance.mGroupDetailsPresenter = mGroupDetailsPresenterProvider.get();
  }
}
