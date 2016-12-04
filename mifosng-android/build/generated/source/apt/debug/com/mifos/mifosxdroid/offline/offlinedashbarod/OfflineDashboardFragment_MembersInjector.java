package com.mifos.mifosxdroid.offline.offlinedashbarod;

import com.mifos.mifosxdroid.adapters.OfflineDashboardAdapter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OfflineDashboardFragment_MembersInjector
    implements MembersInjector<OfflineDashboardFragment> {
  private final Provider<OfflineDashboardPresenter> mOfflineDashboardPresenterProvider;

  private final Provider<OfflineDashboardAdapter> mOfflineDashboardAdapterProvider;

  public OfflineDashboardFragment_MembersInjector(
      Provider<OfflineDashboardPresenter> mOfflineDashboardPresenterProvider,
      Provider<OfflineDashboardAdapter> mOfflineDashboardAdapterProvider) {
    assert mOfflineDashboardPresenterProvider != null;
    this.mOfflineDashboardPresenterProvider = mOfflineDashboardPresenterProvider;
    assert mOfflineDashboardAdapterProvider != null;
    this.mOfflineDashboardAdapterProvider = mOfflineDashboardAdapterProvider;
  }

  public static MembersInjector<OfflineDashboardFragment> create(
      Provider<OfflineDashboardPresenter> mOfflineDashboardPresenterProvider,
      Provider<OfflineDashboardAdapter> mOfflineDashboardAdapterProvider) {
    return new OfflineDashboardFragment_MembersInjector(
        mOfflineDashboardPresenterProvider, mOfflineDashboardAdapterProvider);
  }

  @Override
  public void injectMembers(OfflineDashboardFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mOfflineDashboardPresenter = mOfflineDashboardPresenterProvider.get();
    instance.mOfflineDashboardAdapter = mOfflineDashboardAdapterProvider.get();
  }

  public static void injectMOfflineDashboardPresenter(
      OfflineDashboardFragment instance,
      Provider<OfflineDashboardPresenter> mOfflineDashboardPresenterProvider) {
    instance.mOfflineDashboardPresenter = mOfflineDashboardPresenterProvider.get();
  }

  public static void injectMOfflineDashboardAdapter(
      OfflineDashboardFragment instance,
      Provider<OfflineDashboardAdapter> mOfflineDashboardAdapterProvider) {
    instance.mOfflineDashboardAdapter = mOfflineDashboardAdapterProvider.get();
  }
}
