// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.adapters;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ChargeNameListAdapter$ViewHolder$$ViewBinder<T extends ChargeNameListAdapter.ViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558960, "field 'tv_charger_id'");
    target.tv_charger_id = finder.castView(view, 2131558960, "field 'tv_charger_id'");
    view = finder.findRequiredView(source, 2131558962, "field 'tv_charge_Name'");
    target.tv_charge_Name = finder.castView(view, 2131558962, "field 'tv_charge_Name'");
    view = finder.findRequiredView(source, 2131558964, "field 'tv_charge_amount'");
    target.tv_charge_amount = finder.castView(view, 2131558964, "field 'tv_charge_amount'");
    view = finder.findRequiredView(source, 2131558965, "field 'tv_charge_duedate'");
    target.tv_charge_duedate = finder.castView(view, 2131558965, "field 'tv_charge_duedate'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ChargeNameListAdapter.ViewHolder> implements Unbinder {
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
      target.tv_charger_id = null;
      target.tv_charge_Name = null;
      target.tv_charge_amount = null;
      target.tv_charge_duedate = null;
    }
  }
}
