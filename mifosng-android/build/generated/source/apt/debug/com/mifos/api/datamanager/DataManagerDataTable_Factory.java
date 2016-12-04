package com.mifos.api.datamanager;

import com.mifos.api.BaseApiManager;
import com.mifos.api.local.databasehelper.DatabaseHelperDataTable;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataManagerDataTable_Factory implements Factory<DataManagerDataTable> {
  private final Provider<BaseApiManager> baseApiManagerProvider;

  private final Provider<DatabaseHelperDataTable> databaseHelperDataTableProvider;

  public DataManagerDataTable_Factory(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperDataTable> databaseHelperDataTableProvider) {
    assert baseApiManagerProvider != null;
    this.baseApiManagerProvider = baseApiManagerProvider;
    assert databaseHelperDataTableProvider != null;
    this.databaseHelperDataTableProvider = databaseHelperDataTableProvider;
  }

  @Override
  public DataManagerDataTable get() {
    return new DataManagerDataTable(
        baseApiManagerProvider.get(), databaseHelperDataTableProvider.get());
  }

  public static Factory<DataManagerDataTable> create(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperDataTable> databaseHelperDataTableProvider) {
    return new DataManagerDataTable_Factory(
        baseApiManagerProvider, databaseHelperDataTableProvider);
  }
}
