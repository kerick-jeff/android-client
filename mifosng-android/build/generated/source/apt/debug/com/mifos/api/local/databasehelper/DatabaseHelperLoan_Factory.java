package com.mifos.api.local.databasehelper;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum DatabaseHelperLoan_Factory implements Factory<DatabaseHelperLoan> {
  INSTANCE;

  @Override
  public DatabaseHelperLoan get() {
    return new DatabaseHelperLoan();
  }

  public static Factory<DatabaseHelperLoan> create() {
    return INSTANCE;
  }
}
