package com.mifos.mifosxdroid.online.datatabledata;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataTableDataFragment_MembersInjector
    implements MembersInjector<DataTableDataFragment> {
  private final Provider<DataTableDataPresenter> mDataTableDataPresenterProvider;

  public DataTableDataFragment_MembersInjector(
      Provider<DataTableDataPresenter> mDataTableDataPresenterProvider) {
    assert mDataTableDataPresenterProvider != null;
    this.mDataTableDataPresenterProvider = mDataTableDataPresenterProvider;
  }

  public static MembersInjector<DataTableDataFragment> create(
      Provider<DataTableDataPresenter> mDataTableDataPresenterProvider) {
    return new DataTableDataFragment_MembersInjector(mDataTableDataPresenterProvider);
  }

  @Override
  public void injectMembers(DataTableDataFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mDataTableDataPresenter = mDataTableDataPresenterProvider.get();
  }

  public static void injectMDataTableDataPresenter(
      DataTableDataFragment instance,
      Provider<DataTableDataPresenter> mDataTableDataPresenterProvider) {
    instance.mDataTableDataPresenter = mDataTableDataPresenterProvider.get();
  }
}
