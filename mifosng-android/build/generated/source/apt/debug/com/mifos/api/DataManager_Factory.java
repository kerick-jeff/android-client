package com.mifos.api;

import com.mifos.api.datamanager.DataManagerClient;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataManager_Factory implements Factory<DataManager> {
  private final Provider<BaseApiManager> baseApiManagerProvider;

  private final Provider<DataManagerClient> dataManagerClientProvider;

  public DataManager_Factory(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DataManagerClient> dataManagerClientProvider) {
    assert baseApiManagerProvider != null;
    this.baseApiManagerProvider = baseApiManagerProvider;
    assert dataManagerClientProvider != null;
    this.dataManagerClientProvider = dataManagerClientProvider;
  }

  @Override
  public DataManager get() {
    return new DataManager(baseApiManagerProvider.get(), dataManagerClientProvider.get());
  }

  public static Factory<DataManager> create(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DataManagerClient> dataManagerClientProvider) {
    return new DataManager_Factory(baseApiManagerProvider, dataManagerClientProvider);
  }
}
