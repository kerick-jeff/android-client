// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.dialogfragments.chargedialog;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ChargeDialogFragment$$ViewBinder<T extends ChargeDialogFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558576, "field 'sp_charge_name'");
    target.sp_charge_name = finder.castView(view, 2131558576, "field 'sp_charge_name'");
    view = finder.findRequiredView(source, 2131558579, "field 'et_amout_due'");
    target.et_amout_due = finder.castView(view, 2131558579, "field 'et_amout_due'");
    view = finder.findRequiredView(source, 2131558582, "field 'charge_due_date'");
    target.charge_due_date = finder.castView(view, 2131558582, "field 'charge_due_date'");
    view = finder.findRequiredView(source, 2131558585, "field 'charge_locale'");
    target.charge_locale = finder.castView(view, 2131558585, "field 'charge_locale'");
    view = finder.findRequiredView(source, 2131558586, "field 'bt_save_charge'");
    target.bt_save_charge = finder.castView(view, 2131558586, "field 'bt_save_charge'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ChargeDialogFragment> implements Unbinder {
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
      target.sp_charge_name = null;
      target.et_amout_due = null;
      target.charge_due_date = null;
      target.charge_locale = null;
      target.bt_save_charge = null;
    }
  }
}
