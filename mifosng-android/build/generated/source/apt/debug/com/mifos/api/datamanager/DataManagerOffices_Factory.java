package com.mifos.api.datamanager;

import com.mifos.api.BaseApiManager;
import com.mifos.api.local.databasehelper.DatabaseHelperOffices;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataManagerOffices_Factory implements Factory<DataManagerOffices> {
  private final Provider<BaseApiManager> baseApiManagerProvider;

  private final Provider<DatabaseHelperOffices> databaseHelperOfficesProvider;

  public DataManagerOffices_Factory(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperOffices> databaseHelperOfficesProvider) {
    assert baseApiManagerProvider != null;
    this.baseApiManagerProvider = baseApiManagerProvider;
    assert databaseHelperOfficesProvider != null;
    this.databaseHelperOfficesProvider = databaseHelperOfficesProvider;
  }

  @Override
  public DataManagerOffices get() {
    return new DataManagerOffices(
        baseApiManagerProvider.get(), databaseHelperOfficesProvider.get());
  }

  public static Factory<DataManagerOffices> create(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperOffices> databaseHelperOfficesProvider) {
    return new DataManagerOffices_Factory(baseApiManagerProvider, databaseHelperOfficesProvider);
  }
}
