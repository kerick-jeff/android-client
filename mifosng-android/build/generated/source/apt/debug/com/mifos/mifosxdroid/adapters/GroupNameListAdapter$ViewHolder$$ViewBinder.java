// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.adapters;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class GroupNameListAdapter$ViewHolder$$ViewBinder<T extends GroupNameListAdapter.ViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558626, "field 'tv_groupsName'");
    target.tv_groupsName = finder.castView(view, 2131558626, "field 'tv_groupsName'");
    view = finder.findRequiredView(source, 2131558989, "field 'tv_groupsId'");
    target.tv_groupsId = finder.castView(view, 2131558989, "field 'tv_groupsId'");
    view = finder.findRequiredView(source, 2131558973, "field 'view_selectedOverlay'");
    target.view_selectedOverlay = view;
    view = finder.findRequiredView(source, 2131558972, "field 'iv_sync_status'");
    target.iv_sync_status = finder.castView(view, 2131558972, "field 'iv_sync_status'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends GroupNameListAdapter.ViewHolder> implements Unbinder {
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
      target.tv_groupsName = null;
      target.tv_groupsId = null;
      target.view_selectedOverlay = null;
      target.iv_sync_status = null;
    }
  }
}
