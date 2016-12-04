package com.mifos.api.datamanager;

import com.mifos.api.BaseApiManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataManagerDocument_Factory implements Factory<DataManagerDocument> {
  private final Provider<BaseApiManager> baseApiManagerProvider;

  public DataManagerDocument_Factory(Provider<BaseApiManager> baseApiManagerProvider) {
    assert baseApiManagerProvider != null;
    this.baseApiManagerProvider = baseApiManagerProvider;
  }

  @Override
  public DataManagerDocument get() {
    return new DataManagerDocument(baseApiManagerProvider.get());
  }

  public static Factory<DataManagerDocument> create(
      Provider<BaseApiManager> baseApiManagerProvider) {
    return new DataManagerDocument_Factory(baseApiManagerProvider);
  }
}
