// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.adapters;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class LoanRepaymentScheduleAdapter$ReusableViewHolder$$ViewBinder<T extends LoanRepaymentScheduleAdapter.ReusableViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558788, "field 'view_status_indicator'");
    target.view_status_indicator = view;
    view = finder.findRequiredView(source, 2131558997, "field 'tv_repaymentDueDate'");
    target.tv_repaymentDueDate = finder.castView(view, 2131558997, "field 'tv_repaymentDueDate'");
    view = finder.findRequiredView(source, 2131558998, "field 'tv_repaymentAmountDue'");
    target.tv_repaymentAmountDue = finder.castView(view, 2131558998, "field 'tv_repaymentAmountDue'");
    view = finder.findRequiredView(source, 2131558999, "field 'tv_repaymentAmountPaid'");
    target.tv_repaymentAmountPaid = finder.castView(view, 2131558999, "field 'tv_repaymentAmountPaid'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends LoanRepaymentScheduleAdapter.ReusableViewHolder> implements Unbinder {
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
      target.view_status_indicator = null;
      target.tv_repaymentDueDate = null;
      target.tv_repaymentAmountDue = null;
      target.tv_repaymentAmountPaid = null;
    }
  }
}
