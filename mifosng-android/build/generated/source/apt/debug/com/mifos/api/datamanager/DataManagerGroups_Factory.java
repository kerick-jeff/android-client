package com.mifos.api.datamanager;

import com.mifos.api.BaseApiManager;
import com.mifos.api.local.databasehelper.DatabaseHelperClient;
import com.mifos.api.local.databasehelper.DatabaseHelperGroups;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataManagerGroups_Factory implements Factory<DataManagerGroups> {
  private final Provider<BaseApiManager> baseApiManagerProvider;

  private final Provider<DatabaseHelperGroups> databaseHelperGroupsProvider;

  private final Provider<DatabaseHelperClient> databaseHelperClientProvider;

  public DataManagerGroups_Factory(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperGroups> databaseHelperGroupsProvider,
      Provider<DatabaseHelperClient> databaseHelperClientProvider) {
    assert baseApiManagerProvider != null;
    this.baseApiManagerProvider = baseApiManagerProvider;
    assert databaseHelperGroupsProvider != null;
    this.databaseHelperGroupsProvider = databaseHelperGroupsProvider;
    assert databaseHelperClientProvider != null;
    this.databaseHelperClientProvider = databaseHelperClientProvider;
  }

  @Override
  public DataManagerGroups get() {
    return new DataManagerGroups(
        baseApiManagerProvider.get(),
        databaseHelperGroupsProvider.get(),
        databaseHelperClientProvider.get());
  }

  public static Factory<DataManagerGroups> create(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperGroups> databaseHelperGroupsProvider,
      Provider<DatabaseHelperClient> databaseHelperClientProvider) {
    return new DataManagerGroups_Factory(
        baseApiManagerProvider, databaseHelperGroupsProvider, databaseHelperClientProvider);
  }
}
