package com.mifos.api.local.databasehelper;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum DatabaseHelperDataTable_Factory implements Factory<DatabaseHelperDataTable> {
  INSTANCE;

  @Override
  public DatabaseHelperDataTable get() {
    return new DatabaseHelperDataTable();
  }

  public static Factory<DatabaseHelperDataTable> create() {
    return INSTANCE;
  }
}
