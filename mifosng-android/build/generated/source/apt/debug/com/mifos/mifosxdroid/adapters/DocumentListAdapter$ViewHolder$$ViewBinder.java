// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.adapters;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class DocumentListAdapter$ViewHolder$$ViewBinder<T extends DocumentListAdapter.ViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558984, "field 'tv_doc_name'");
    target.tv_doc_name = finder.castView(view, 2131558984, "field 'tv_doc_name'");
    view = finder.findRequiredView(source, 2131558985, "field 'tv_doc_description'");
    target.tv_doc_description = finder.castView(view, 2131558985, "field 'tv_doc_description'");
    view = finder.findRequiredView(source, 2131558986, "field 'tv_doc_location_icon'");
    target.tv_doc_location_icon = finder.castView(view, 2131558986, "field 'tv_doc_location_icon'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends DocumentListAdapter.ViewHolder> implements Unbinder {
    private T target;

    protected InnerUnbinder(T target) {
      this.target = target;
    }

    @Override
    public final void unbind() {
      if (target == null) throw new IllegalStateException("Bindings already cleared.");
      unbind(target);
      target = null;
    }

    protected void unbind(T target) {
      target.tv_doc_name = null;
      target.tv_doc_description = null;
      target.tv_doc_location_icon = null;
    }
  }
}
