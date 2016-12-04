package com.mifos.mifosxdroid.adapters;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DocumentListAdapter_Factory implements Factory<DocumentListAdapter> {
  private final MembersInjector<DocumentListAdapter> documentListAdapterMembersInjector;

  public DocumentListAdapter_Factory(
      MembersInjector<DocumentListAdapter> documentListAdapterMembersInjector) {
    assert documentListAdapterMembersInjector != null;
    this.documentListAdapterMembersInjector = documentListAdapterMembersInjector;
  }

  @Override
  public DocumentListAdapter get() {
    return MembersInjectors.injectMembers(
        documentListAdapterMembersInjector, new DocumentListAdapter());
  }

  public static Factory<DocumentListAdapter> create(
      MembersInjector<DocumentListAdapter> documentListAdapterMembersInjector) {
    return new DocumentListAdapter_Factory(documentListAdapterMembersInjector);
  }
}
