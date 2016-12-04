package com.mifos.api.local.databasehelper;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum DatabaseHelperCenter_Factory implements Factory<DatabaseHelperCenter> {
  INSTANCE;

  @Override
  public DatabaseHelperCenter get() {
    return new DatabaseHelperCenter();
  }

  public static Factory<DatabaseHelperCenter> create() {
    return INSTANCE;
  }
}
