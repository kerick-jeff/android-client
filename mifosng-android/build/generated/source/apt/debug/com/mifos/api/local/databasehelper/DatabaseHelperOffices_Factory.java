package com.mifos.api.local.databasehelper;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum DatabaseHelperOffices_Factory implements Factory<DatabaseHelperOffices> {
  INSTANCE;

  @Override
  public DatabaseHelperOffices get() {
    return new DatabaseHelperOffices();
  }

  public static Factory<DatabaseHelperOffices> create() {
    return INSTANCE;
  }
}
