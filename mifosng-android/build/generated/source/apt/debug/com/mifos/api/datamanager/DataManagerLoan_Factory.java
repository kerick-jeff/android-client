package com.mifos.api.datamanager;

import com.mifos.api.BaseApiManager;
import com.mifos.api.local.databasehelper.DatabaseHelperLoan;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataManagerLoan_Factory implements Factory<DataManagerLoan> {
  private final Provider<BaseApiManager> baseApiManagerProvider;

  private final Provider<DatabaseHelperLoan> databaseHelperLoanProvider;

  public DataManagerLoan_Factory(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperLoan> databaseHelperLoanProvider) {
    assert baseApiManagerProvider != null;
    this.baseApiManagerProvider = baseApiManagerProvider;
    assert databaseHelperLoanProvider != null;
    this.databaseHelperLoanProvider = databaseHelperLoanProvider;
  }

  @Override
  public DataManagerLoan get() {
    return new DataManagerLoan(baseApiManagerProvider.get(), databaseHelperLoanProvider.get());
  }

  public static Factory<DataManagerLoan> create(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperLoan> databaseHelperLoanProvider) {
    return new DataManagerLoan_Factory(baseApiManagerProvider, databaseHelperLoanProvider);
  }
}
