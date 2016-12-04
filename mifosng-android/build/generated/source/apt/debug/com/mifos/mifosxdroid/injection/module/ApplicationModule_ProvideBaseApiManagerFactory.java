package com.mifos.mifosxdroid.injection.module;

import com.mifos.api.BaseApiManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideBaseApiManagerFactory
    implements Factory<BaseApiManager> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideBaseApiManagerFactory(ApplicationModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseApiManager get() {
    return Preconditions.checkNotNull(
        module.provideBaseApiManager(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseApiManager> create(ApplicationModule module) {
    return new ApplicationModule_ProvideBaseApiManagerFactory(module);
  }
}
