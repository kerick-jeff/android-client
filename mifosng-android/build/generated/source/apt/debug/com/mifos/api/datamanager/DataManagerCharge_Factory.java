package com.mifos.api.datamanager;

import com.mifos.api.BaseApiManager;
import com.mifos.api.local.databasehelper.DatabaseHelperCharge;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataManagerCharge_Factory implements Factory<DataManagerCharge> {
  private final Provider<BaseApiManager> baseApiManagerProvider;

  private final Provider<DatabaseHelperCharge> databaseHelperChargeProvider;

  public DataManagerCharge_Factory(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperCharge> databaseHelperChargeProvider) {
    assert baseApiManagerProvider != null;
    this.baseApiManagerProvider = baseApiManagerProvider;
    assert databaseHelperChargeProvider != null;
    this.databaseHelperChargeProvider = databaseHelperChargeProvider;
  }

  @Override
  public DataManagerCharge get() {
    return new DataManagerCharge(baseApiManagerProvider.get(), databaseHelperChargeProvider.get());
  }

  public static Factory<DataManagerCharge> create(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperCharge> databaseHelperChargeProvider) {
    return new DataManagerCharge_Factory(baseApiManagerProvider, databaseHelperChargeProvider);
  }
}
