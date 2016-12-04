package com.mifos.api.datamanager;

import com.mifos.api.BaseApiManager;
import com.mifos.api.local.databasehelper.DatabaseHelperSavings;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataManagerSavings_Factory implements Factory<DataManagerSavings> {
  private final Provider<BaseApiManager> baseApiManagerProvider;

  private final Provider<DatabaseHelperSavings> databaseHelperSavingsProvider;

  public DataManagerSavings_Factory(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperSavings> databaseHelperSavingsProvider) {
    assert baseApiManagerProvider != null;
    this.baseApiManagerProvider = baseApiManagerProvider;
    assert databaseHelperSavingsProvider != null;
    this.databaseHelperSavingsProvider = databaseHelperSavingsProvider;
  }

  @Override
  public DataManagerSavings get() {
    return new DataManagerSavings(
        baseApiManagerProvider.get(), databaseHelperSavingsProvider.get());
  }

  public static Factory<DataManagerSavings> create(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperSavings> databaseHelperSavingsProvider) {
    return new DataManagerSavings_Factory(baseApiManagerProvider, databaseHelperSavingsProvider);
  }
}
