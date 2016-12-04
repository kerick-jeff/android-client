package com.mifos.api.datamanager;

import com.mifos.api.BaseApiManager;
import com.mifos.api.local.databasehelper.DatabaseHelperClient;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataManagerClient_Factory implements Factory<DataManagerClient> {
  private final Provider<BaseApiManager> baseApiManagerProvider;

  private final Provider<DatabaseHelperClient> databaseHelperClientProvider;

  public DataManagerClient_Factory(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperClient> databaseHelperClientProvider) {
    assert baseApiManagerProvider != null;
    this.baseApiManagerProvider = baseApiManagerProvider;
    assert databaseHelperClientProvider != null;
    this.databaseHelperClientProvider = databaseHelperClientProvider;
  }

  @Override
  public DataManagerClient get() {
    return new DataManagerClient(baseApiManagerProvider.get(), databaseHelperClientProvider.get());
  }

  public static Factory<DataManagerClient> create(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperClient> databaseHelperClientProvider) {
    return new DataManagerClient_Factory(baseApiManagerProvider, databaseHelperClientProvider);
  }
}
