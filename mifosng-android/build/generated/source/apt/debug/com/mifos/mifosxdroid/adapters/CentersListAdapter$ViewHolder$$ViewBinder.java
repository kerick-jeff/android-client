// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.adapters;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class CentersListAdapter$ViewHolder$$ViewBinder<T extends CentersListAdapter.ViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558954, "field 'tv_center_name'");
    target.tv_center_name = finder.castView(view, 2131558954, "field 'tv_center_name'");
    view = finder.findRequiredView(source, 2131558956, "field 'tv_center_id'");
    target.tv_center_id = finder.castView(view, 2131558956, "field 'tv_center_id'");
    view = finder.findRequiredView(source, 2131558957, "field 'tv_staff_name'");
    target.tv_staff_name = finder.castView(view, 2131558957, "field 'tv_staff_name'");
    view = finder.findRequiredView(source, 2131558958, "field 'tv_staff_id'");
    target.tv_staff_id = finder.castView(view, 2131558958, "field 'tv_staff_id'");
    view = finder.findRequiredView(source, 2131558959, "field 'tv_office_name'");
    target.tv_office_name = finder.castView(view, 2131558959, "field 'tv_office_name'");
    view = finder.findRequiredView(source, 2131558909, "field 'tv_office_id'");
    target.tv_office_id = finder.castView(view, 2131558909, "field 'tv_office_id'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends CentersListAdapter.ViewHolder> implements Unbinder {
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
      target.tv_center_name = null;
      target.tv_center_id = null;
      target.tv_staff_name = null;
      target.tv_staff_id = null;
      target.tv_office_name = null;
      target.tv_office_id = null;
    }
  }
}
