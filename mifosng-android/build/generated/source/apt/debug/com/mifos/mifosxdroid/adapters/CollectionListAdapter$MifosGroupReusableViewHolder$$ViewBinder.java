// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.adapters;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class CollectionListAdapter$MifosGroupReusableViewHolder$$ViewBinder<T extends CollectionListAdapter.MifosGroupReusableViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558975, "field 'tv_groupName'");
    target.tv_groupName = finder.castView(view, 2131558975, "field 'tv_groupName'");
    view = finder.findRequiredView(source, 2131558977, "field 'tv_groupTotal'");
    target.tv_groupTotal = finder.castView(view, 2131558977, "field 'tv_groupTotal'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends CollectionListAdapter.MifosGroupReusableViewHolder> implements Unbinder {
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
      target.tv_groupName = null;
      target.tv_groupTotal = null;
    }
  }
}
