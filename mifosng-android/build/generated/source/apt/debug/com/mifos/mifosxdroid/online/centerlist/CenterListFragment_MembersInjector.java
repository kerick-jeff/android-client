package com.mifos.mifosxdroid.online.centerlist;

import com.mifos.mifosxdroid.adapters.CentersListAdapter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CenterListFragment_MembersInjector
    implements MembersInjector<CenterListFragment> {
  private final Provider<CenterListPresenter> mCenterListPresenterProvider;

  private final Provider<CentersListAdapter> centersListAdapterProvider;

  public CenterListFragment_MembersInjector(
      Provider<CenterListPresenter> mCenterListPresenterProvider,
      Provider<CentersListAdapter> centersListAdapterProvider) {
    assert mCenterListPresenterProvider != null;
    this.mCenterListPresenterProvider = mCenterListPresenterProvider;
    assert centersListAdapterProvider != null;
    this.centersListAdapterProvider = centersListAdapterProvider;
  }

  public static MembersInjector<CenterListFragment> create(
      Provider<CenterListPresenter> mCenterListPresenterProvider,
      Provider<CentersListAdapter> centersListAdapterProvider) {
    return new CenterListFragment_MembersInjector(
        mCenterListPresenterProvider, centersListAdapterProvider);
  }

  @Override
  public void injectMembers(CenterListFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mCenterListPresenter = mCenterListPresenterProvider.get();
    instance.centersListAdapter = centersListAdapterProvider.get();
  }

  public static void injectMCenterListPresenter(
      CenterListFragment instance, Provider<CenterListPresenter> mCenterListPresenterProvider) {
    instance.mCenterListPresenter = mCenterListPresenterProvider.get();
  }

  public static void injectCentersListAdapter(
      CenterListFragment instance, Provider<CentersListAdapter> centersListAdapterProvider) {
    instance.centersListAdapter = centersListAdapterProvider.get();
  }
}
