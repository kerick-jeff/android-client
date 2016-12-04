package com.mifos.api.datamanager;

import com.mifos.api.BaseApiManager;
import com.mifos.api.local.databasehelper.DatabaseHelperCenter;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataManagerCenter_Factory implements Factory<DataManagerCenter> {
  private final Provider<BaseApiManager> baseApiManagerProvider;

  private final Provider<DatabaseHelperCenter> databaseHelperCenterProvider;

  public DataManagerCenter_Factory(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperCenter> databaseHelperCenterProvider) {
    assert baseApiManagerProvider != null;
    this.baseApiManagerProvider = baseApiManagerProvider;
    assert databaseHelperCenterProvider != null;
    this.databaseHelperCenterProvider = databaseHelperCenterProvider;
  }

  @Override
  public DataManagerCenter get() {
    return new DataManagerCenter(baseApiManagerProvider.get(), databaseHelperCenterProvider.get());
  }

  public static Factory<DataManagerCenter> create(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperCenter> databaseHelperCenterProvider) {
    return new DataManagerCenter_Factory(baseApiManagerProvider, databaseHelperCenterProvider);
  }
}
