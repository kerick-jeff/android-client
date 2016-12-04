package com.mifos.mifosxdroid.dialogfragments.datatablerowdialog;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataTableRowDialogFragment_MembersInjector
    implements MembersInjector<DataTableRowDialogFragment> {
  private final Provider<DataTableRowDialogPresenter> mDataTableRowDialogPresenterProvider;

  public DataTableRowDialogFragment_MembersInjector(
      Provider<DataTableRowDialogPresenter> mDataTableRowDialogPresenterProvider) {
    assert mDataTableRowDialogPresenterProvider != null;
    this.mDataTableRowDialogPresenterProvider = mDataTableRowDialogPresenterProvider;
  }

  public static MembersInjector<DataTableRowDialogFragment> create(
      Provider<DataTableRowDialogPresenter> mDataTableRowDialogPresenterProvider) {
    return new DataTableRowDialogFragment_MembersInjector(mDataTableRowDialogPresenterProvider);
  }

  @Override
  public void injectMembers(DataTableRowDialogFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mDataTableRowDialogPresenter = mDataTableRowDialogPresenterProvider.get();
  }

  public static void injectMDataTableRowDialogPresenter(
      DataTableRowDialogFragment instance,
      Provider<DataTableRowDialogPresenter> mDataTableRowDialogPresenterProvider) {
    instance.mDataTableRowDialogPresenter = mDataTableRowDialogPresenterProvider.get();
  }
}
