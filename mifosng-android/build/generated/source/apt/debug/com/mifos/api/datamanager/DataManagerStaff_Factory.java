package com.mifos.api.datamanager;

import com.mifos.api.BaseApiManager;
import com.mifos.api.local.databasehelper.DatabaseHelperStaff;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataManagerStaff_Factory implements Factory<DataManagerStaff> {
  private final Provider<BaseApiManager> baseApiManagerProvider;

  private final Provider<DatabaseHelperStaff> databaseHelperStaffProvider;

  public DataManagerStaff_Factory(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperStaff> databaseHelperStaffProvider) {
    assert baseApiManagerProvider != null;
    this.baseApiManagerProvider = baseApiManagerProvider;
    assert databaseHelperStaffProvider != null;
    this.databaseHelperStaffProvider = databaseHelperStaffProvider;
  }

  @Override
  public DataManagerStaff get() {
    return new DataManagerStaff(baseApiManagerProvider.get(), databaseHelperStaffProvider.get());
  }

  public static Factory<DataManagerStaff> create(
      Provider<BaseApiManager> baseApiManagerProvider,
      Provider<DatabaseHelperStaff> databaseHelperStaffProvider) {
    return new DataManagerStaff_Factory(baseApiManagerProvider, databaseHelperStaffProvider);
  }
}
