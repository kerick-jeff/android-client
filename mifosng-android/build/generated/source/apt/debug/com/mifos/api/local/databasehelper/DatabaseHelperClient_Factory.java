package com.mifos.api.local.databasehelper;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum DatabaseHelperClient_Factory implements Factory<DatabaseHelperClient> {
  INSTANCE;

  @Override
  public DatabaseHelperClient get() {
    return new DatabaseHelperClient();
  }

  public static Factory<DatabaseHelperClient> create() {
    return INSTANCE;
  }
}
