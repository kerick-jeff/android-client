// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.loanrepaymentschedule;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class LoanRepaymentScheduleFragment$$ViewBinder<T extends LoanRepaymentScheduleFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558837, "field 'lv_repaymentSchedule'");
    target.lv_repaymentSchedule = finder.castView(view, 2131558837, "field 'lv_repaymentSchedule'");
    view = finder.findRequiredView(source, 2131558819, "field 'tv_totalPaid'");
    target.tv_totalPaid = finder.castView(view, 2131558819, "field 'tv_totalPaid'");
    view = finder.findRequiredView(source, 2131558839, "field 'tv_totalUpcoming'");
    target.tv_totalUpcoming = finder.castView(view, 2131558839, "field 'tv_totalUpcoming'");
    view = finder.findRequiredView(source, 2131558840, "field 'tv_totalOverdue'");
    target.tv_totalOverdue = finder.castView(view, 2131558840, "field 'tv_totalOverdue'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends LoanRepaymentScheduleFragment> implements Unbinder {
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
      target.lv_repaymentSchedule = null;
      target.tv_totalPaid = null;
      target.tv_totalUpcoming = null;
      target.tv_totalOverdue = null;
    }
  }
}
