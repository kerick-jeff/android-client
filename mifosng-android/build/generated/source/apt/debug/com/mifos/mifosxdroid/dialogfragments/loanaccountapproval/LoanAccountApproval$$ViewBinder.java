// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.dialogfragments.loanaccountapproval;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class LoanAccountApproval$$ViewBinder<T extends LoanAccountApproval> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558564, "field 'tv_loan_approval_dates'");
    target.tv_loan_approval_dates = finder.castView(view, 2131558564, "field 'tv_loan_approval_dates'");
    view = finder.findRequiredView(source, 2131558567, "field 'bt_approve_loan'");
    target.bt_approve_loan = finder.castView(view, 2131558567, "field 'bt_approve_loan'");
    view = finder.findRequiredView(source, 2131558565, "field 'et_approved_amount'");
    target.et_approved_amount = finder.castView(view, 2131558565, "field 'et_approved_amount'");
    view = finder.findRequiredView(source, 2131558566, "field 'et_approval_note'");
    target.et_approval_note = finder.castView(view, 2131558566, "field 'et_approval_note'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends LoanAccountApproval> implements Unbinder {
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
      target.tv_loan_approval_dates = null;
      target.bt_approve_loan = null;
      target.et_approved_amount = null;
      target.et_approval_note = null;
    }
  }
}
