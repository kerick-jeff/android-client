// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.adapters;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class CollectionListAdapter$ClientReusableViewHolder$$ViewBinder<T extends CollectionListAdapter.ClientReusableViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558978, "field 'tv_clientId'");
    target.tv_clientId = finder.castView(view, 2131558978, "field 'tv_clientId'");
    view = finder.findRequiredView(source, 2131558784, "field 'tv_clientName'");
    target.tv_clientName = finder.castView(view, 2131558784, "field 'tv_clientName'");
    view = finder.findRequiredView(source, 2131558979, "field 'tv_clientTotal'");
    target.tv_clientTotal = finder.castView(view, 2131558979, "field 'tv_clientTotal'");
    view = finder.findRequiredView(source, 2131558980, "field 'lv_loans'");
    target.lv_loans = finder.castView(view, 2131558980, "field 'lv_loans'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends CollectionListAdapter.ClientReusableViewHolder> implements Unbinder {
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
      target.tv_clientId = null;
      target.tv_clientName = null;
      target.tv_clientTotal = null;
      target.lv_loans = null;
    }
  }
}
