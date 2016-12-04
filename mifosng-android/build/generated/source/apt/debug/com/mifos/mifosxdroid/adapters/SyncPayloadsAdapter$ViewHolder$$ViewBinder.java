// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.adapters;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SyncPayloadsAdapter$ViewHolder$$ViewBinder<T extends SyncPayloadsAdapter.ViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558890, "field 'tv_first_name'");
    target.tv_first_name = finder.castView(view, 2131558890, "field 'tv_first_name'");
    view = finder.findRequiredView(source, 2131558893, "field 'tv_middle_name'");
    target.tv_middle_name = finder.castView(view, 2131558893, "field 'tv_middle_name'");
    view = finder.findRequiredView(source, 2131558896, "field 'tv_last_name'");
    target.tv_last_name = finder.castView(view, 2131558896, "field 'tv_last_name'");
    view = finder.findRequiredView(source, 2131558899, "field 'tv_mobile_no'");
    target.tv_mobile_no = finder.castView(view, 2131558899, "field 'tv_mobile_no'");
    view = finder.findRequiredView(source, 2131558901, "field 'tv_external_id'");
    target.tv_external_id = finder.castView(view, 2131558901, "field 'tv_external_id'");
    view = finder.findRequiredView(source, 2131558904, "field 'tv_gender'");
    target.tv_gender = finder.castView(view, 2131558904, "field 'tv_gender'");
    view = finder.findRequiredView(source, 2131558907, "field 'tv_dob'");
    target.tv_dob = finder.castView(view, 2131558907, "field 'tv_dob'");
    view = finder.findRequiredView(source, 2131558910, "field 'tv_office_id'");
    target.tv_office_id = finder.castView(view, 2131558910, "field 'tv_office_id'");
    view = finder.findRequiredView(source, 2131558913, "field 'tv_activation_date'");
    target.tv_activation_date = finder.castView(view, 2131558913, "field 'tv_activation_date'");
    view = finder.findRequiredView(source, 2131558916, "field 'tv_active_status'");
    target.tv_active_status = finder.castView(view, 2131558916, "field 'tv_active_status'");
    view = finder.findRequiredView(source, 2131558917, "field 'tv_error_message'");
    target.tv_error_message = finder.castView(view, 2131558917, "field 'tv_error_message'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SyncPayloadsAdapter.ViewHolder> implements Unbinder {
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
      target.tv_first_name = null;
      target.tv_middle_name = null;
      target.tv_last_name = null;
      target.tv_mobile_no = null;
      target.tv_external_id = null;
      target.tv_gender = null;
      target.tv_dob = null;
      target.tv_office_id = null;
      target.tv_activation_date = null;
      target.tv_active_status = null;
      target.tv_error_message = null;
    }
  }
}
