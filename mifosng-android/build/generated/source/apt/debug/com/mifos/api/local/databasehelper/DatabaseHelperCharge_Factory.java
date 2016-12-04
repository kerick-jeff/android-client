package com.mifos.api.local.databasehelper;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum DatabaseHelperCharge_Factory implements Factory<DatabaseHelperCharge> {
  INSTANCE;

  @Override
  public DatabaseHelperCharge get() {
    return new DatabaseHelperCharge();
  }

  public static Factory<DatabaseHelperCharge> create() {
    return INSTANCE;
  }
}
