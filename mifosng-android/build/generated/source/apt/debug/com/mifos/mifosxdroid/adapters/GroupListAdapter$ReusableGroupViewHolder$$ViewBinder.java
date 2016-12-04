// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.adapters;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class GroupListAdapter$ReusableGroupViewHolder$$ViewBinder<T extends GroupListAdapter.ReusableGroupViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558626, "field 'tv_groupName'");
    target.tv_groupName = finder.castView(view, 2131558626, "field 'tv_groupName'");
    view = finder.findRequiredView(source, 2131558959, "field 'tv_officeName'");
    target.tv_officeName = finder.castView(view, 2131558959, "field 'tv_officeName'");
    view = finder.findRequiredView(source, 2131558788, "field 'view_statusIndicator'");
    target.view_statusIndicator = view;
    view = finder.findRequiredView(source, 2131558987, "field 'tv_statusText'");
    target.tv_statusText = finder.castView(view, 2131558987, "field 'tv_statusText'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends GroupListAdapter.ReusableGroupViewHolder> implements Unbinder {
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
      target.tv_officeName = null;
      target.view_statusIndicator = null;
      target.tv_statusText = null;
    }
  }
}
